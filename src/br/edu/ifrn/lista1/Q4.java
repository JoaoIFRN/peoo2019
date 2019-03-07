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
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1 (0-100 sem casa decimal): ");
        int nota1 = scanner.nextInt();
        System.out.print("Nota 2 (0-100 sem casa decimal): ");
        int nota2 = scanner.nextInt();
        System.out.print("Nota 3 (0-100 sem casa decimal): ");
        int nota3 = scanner.nextInt();
        System.out.print("Nota 4 (0-100 sem casa decimal): ");
        int nota4 = scanner.nextInt();
        double media = (nota1 + nota2 + nota3 + nota4)/4.0;
        System.out.println("Média: " + Math.round(media));
    }
}
