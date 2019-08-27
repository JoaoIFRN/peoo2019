/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author joaon
 */
public class TesteList {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(1,"Israel");
        Cliente cliente2 = new Cliente(1,"Israel");
        if (cliente1.equals(cliente2)){
            System.out.println("Iguais");
        }
        
        
        
        //List é uma interface
        List<String> nomes = new LinkedList();
        //Tamanho
        int tamanho = nomes.size();
        //Inserir
        nomes.add("Arnaldo");nomes.add("Ana");nomes.add("Zé");
        //Acessar elementos
        String nome = nomes.get(0);
        //Remover
        nomes.remove("Arnaldo");
//      //Java 8 (Programação funcional)
        nomes.forEach(System.out::println);
        //Obter o índice de um elemento
        int indice = nomes.indexOf("Alvaro");
        //Verificar se um elemento está na lista
        boolean achou = nomes.contains(nome);
        //Classsificar (ordem alfabética)
        Collections.sort(nomes);
        
    }
    
}
