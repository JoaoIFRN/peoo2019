/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.inicio;

import br.edu.ifrn.model.Aluno;

/**
 *
 * @author joaon
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Início");
        int valor = 10;
        int total;
        Aluno novoAluno = new Aluno();
        novoAluno.matricula = 6757;
        novoAluno.nome = "João";
        System.out.println(novoAluno.exibir());              
    }  
}
