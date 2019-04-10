/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista2;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número:");
        int numero1 = entrada.nextInt();
        System.out.print("Digite um número:");
        int numero2 = entrada.nextInt();
        
        if (numero1 == numero2){
            System.out.println("Números iguais");
        }else if (numero1 > numero2){
            System.out.println("Número 1 é maior");
        }else{
            System.out.println("Número 2 é maior");
        }
        
        
    }
}
