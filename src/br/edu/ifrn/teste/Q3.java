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
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = scanner.nextDouble();
        double volume = (4.0 * Math.PI * Math.pow(raio, 3.0))/3.0;
        System.out.printf("Volume: %.2f\n",volume);
    }
}
