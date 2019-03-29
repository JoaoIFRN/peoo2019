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
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X1: ");
        int x1 = scanner.nextInt();
        System.out.print("Y1: ");
        int y1 = scanner.nextInt();
        System.out.print("X2: ");
        int x2 = scanner.nextInt();
        System.out.print("Y2: ");
        int y2= scanner.nextInt();
        double distancia = Math.sqrt(Math.pow(x2-x1, 2) 
                                   + Math.pow(y2-y1, 2));
        System.out.printf("Distância: %.2f\n",distancia);
    }
}
