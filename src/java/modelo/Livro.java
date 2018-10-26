/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import util.FormataData;

/**
 *
 * @author dappo
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Livro.findAll", query = "SELECT a FROM Livro a"),
    @NamedQuery(name = "Livro.findFilter", query = "SELECT a FROM Livro a WHERE a.nome like :filtro")
})
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nome;
  
    private String endFoto;
    
    @ManyToOne
    private Autor autor;
    
    @ManyToOne
    private Classificacao classificacao;
    
    @ManyToOne
    private Editora editora;
    
    @ManyToOne
    private Genero genero;
    @Temporal(TemporalType.DATE)
    private Date datadelancamento;

    public Date getDatadelancamento() {
        return datadelancamento;
    }

    public void setDatadelancamento(Date datadelancamento) {
        this.datadelancamento = datadelancamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndFoto() {
        return endFoto;
    }

    public void setEndFoto(String endFoto) {
        this.endFoto = endFoto;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    

    public String mostraData(){
    return FormataData.formata(datadelancamento);
    }
    
    public String mostraData2(){
    return FormataData.formata(datadelancamento, "yyyy-MM-dd");
    }

    
}
