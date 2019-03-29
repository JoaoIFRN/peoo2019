/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.teste;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = entrada.next();
        System.out.print("Sobrenome: ");
        String sobreNome = entrada.next();    
        System.out.println(sobreNome + " " + nome);
    }
}
