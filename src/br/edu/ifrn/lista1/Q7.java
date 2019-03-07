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
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lado: ");
        double lado = scanner.nextDouble();
        double areaQuadrado = lado * lado;
        System.out.printf("Área: %.2f",areaQuadrado);
        System.out.printf("Dobro: %.2f",areaQuadrado*2.0);
    }
}
