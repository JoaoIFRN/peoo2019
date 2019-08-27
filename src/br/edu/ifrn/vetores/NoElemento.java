/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

/**
 *
 * @author joaon
 */
public class NoElemento {
    
    private Object valor;
    private NoElemento proximoElemento;

    public NoElemento(Object valor, NoElemento proximoElemento) {
        this.valor = valor;
        this.proximoElemento = proximoElemento;
    }
    
    

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public NoElemento getProximoElemento() {
        return proximoElemento;
    }

    public void setProximoElemento(NoElemento proximoElemento) {
        this.proximoElemento = proximoElemento;
    }
    
}
