/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Admin;


/**
 *
 * @author dappo
 */
public class AdminDAO extends GenericDAO<Admin, Long>{
    
    public AdminDAO(){
        super(Admin.class);
    }
    
}
