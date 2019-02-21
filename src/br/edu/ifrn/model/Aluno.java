/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.model;

/**
 *
 * @author joaon
 */
public class Aluno {

    public int matricula;
    public String nome;

    public String exibir() {
        return nome + " - " + matricula;
    }

}
