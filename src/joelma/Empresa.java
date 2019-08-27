/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joelma;

/**
 *
 * @author joaon
 */
public class Empresa {
    
    private String nome;
    private Endereco endereco;
    private Projeto projeto1;
    private Projeto projeto2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Projeto getProjeto1() {
        return projeto1;
    }

    public void setProjeto1(Projeto projeto1) {
        this.projeto1 = projeto1;
    }

    public Projeto getProjeto2() {
        return projeto2;
    }

    public void setProjeto2(Projeto projeto2) {
        this.projeto2 = projeto2;
    }
    
    
    
}
