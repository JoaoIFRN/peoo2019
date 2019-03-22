/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.tipos_operadores;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author joaon
 */
public class TestesComProdutos {
    public static void main(String[] args) {
        Produto produto1 = 
        new Produto("Arroz",
                    Calendar.getInstance(),
                    3.50);
        Produto produto2 = 
        new Produto("Feijão",
                    Calendar.getInstance(),
                    4.67);
        
        SimpleDateFormat formato = 
                new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println(
        formato.format(produto1.dataValidade.getTime()));
        System.out.println(produto2.nome);
        System.out.println("uiy8y" + 7979);
        System.out.println(Produto.supermercado);
        //Produto.nome = "kjbk"; Erro
        
    }
}
