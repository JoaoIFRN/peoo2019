/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista1;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Número 1: ");
        int numero1 = scanner.nextInt();
        System.out.print("Número 2: ");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);    
    }
}

