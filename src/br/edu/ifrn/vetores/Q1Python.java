/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q1Python {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<numeros.length;i++){
            System.out.print("Digite um valor: ");
            numeros[i] = scanner.nextInt();
        }
        
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
    }
}
