/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.tipos_operadores;

import java.util.Calendar;

/**
 *
 * @author joaon
 */
public class Produto {
    String nome;
    Calendar dataValidade;
    double preco;
    static String supermercado = "Compra Bem";

    public Produto(String nome, Calendar dataValidade, double preco) {
        this.nome = nome;
        this.dataValidade = dataValidade;
        this.preco = preco;
    }

    
    
    
}
