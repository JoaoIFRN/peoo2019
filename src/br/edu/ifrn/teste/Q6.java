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
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cateto 1: ");
        int a = scanner.nextInt();
        System.out.print("Cateto 2: ");
        int b = scanner.nextInt();
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("Hipotenusa: %.2f\n",c);
    }
}
