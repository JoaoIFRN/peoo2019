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
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor em metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100.0;
        System.out.printf("Valor em centímetros: %.2f",centimetros );
    }
}
