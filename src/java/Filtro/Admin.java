/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filtro;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aluno
 */
public class Admin implements Filter {

    /**
     *
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        HttpSession session = ((HttpServletRequest) request).getSession();
        Admin admin = (Admin) session.getAttribute("usuario");
        if(admin == null){
        admin = new Admin();
                }
        String path = ((HttpServletRequest)request).getRequestURI();
        
        if((path.startsWith("/Livraria/admin/login")
            ||path.startsWith("/Livraria/admin/assets/"))||(admin.getId()!=null)){
            chain.doFilter(request, response);
        }else{
            request.setAttribute("msg", "Você não está logado no sistema!");
            ((HttpServletResponse)response).sendRedirect("../login/login.jsp");
        }

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroy() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getId() {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

}

