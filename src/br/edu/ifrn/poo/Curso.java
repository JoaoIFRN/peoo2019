/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo;

import java.util.List;

/**
 *
 * @author joaon
 */
public class Curso {
   private String nome;
   public static int contador;
   private List<Aluno> alunos;
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public String getNome(){
       return nome;
   }
}
