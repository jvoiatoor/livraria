/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import modelo.Classificacao;

/**
 *
 * @author dappo
 */
public class ClassificacaoDAO extends GenericDAO<Classificacao, Long>{
    
    public ClassificacaoDAO(){
        super(Classificacao.class);
    }
    
}
