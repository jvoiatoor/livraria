/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Livro;


/**
 *
 * @author dappo
 */
public class LivroDAO extends GenericDAO<Livro, Long>{
    
    public LivroDAO(){
        super(Livro.class);
    }
    
}
