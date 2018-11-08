/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Admin;


/**
 *
 * @author dappo
 */
public class AdminDAO extends GenericDAO<Admin, Long>{
    
    public AdminDAO(){
        super(Admin.class);
    }
     public Admin fazerLogin(String email, String senha){
    // a senha deve chegar nesse método criptografada
    // senão
    //String senha_cripto = Criptografia.convertPasswordToMD5(senha); e add throws ...
    
    
        List<Admin> admins = em.createNamedQuery("Admin.logar").setParameter("email", email).setParameter("senha", senha).getResultList();
        
        if(0==admins.size()){
            return new Admin();
        }else{
            return admins.get(0);
        }
    
    }
    
}
