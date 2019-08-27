/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista3;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q1 {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       while (true){
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();  
            if (valor >= 0 && valor <= 10)
                break;
            System.out.println("Valor inválido");
       }
        System.out.println("Valor válido");
       
       
       /*System.out.print("Digite um valor: ");
       int valor = scanner.nextInt();
       while (valor < 0 || valor > 10){
           System.out.println("Valor inválido");
           System.out.print("Digite um valor: ");
           valor = scanner.nextInt();
       }
        System.out.println("Valor válido");*/
    }
    
}
