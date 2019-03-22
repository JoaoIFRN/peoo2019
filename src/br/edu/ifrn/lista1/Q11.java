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
public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inteiro 1: ");        
        int inteiro1 = scanner.nextInt();
        System.out.print("Inteiro 2: ");        
        int inteiro2 = scanner.nextInt();
        System.out.print("Real: ");        
        double real = scanner.nextDouble();
        int letraA = (inteiro1*2) * (inteiro2/2);
        double letraB = (inteiro1*3) + real;
        double letraC = Math.pow(real,3.0);
        System.out.printf("A: %d",letraA);
        System.out.printf("B: %.2f",letraB);
        System.out.printf("C: %.2f",letraC);               
    }
}
