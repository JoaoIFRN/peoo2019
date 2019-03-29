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
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("X: ");
        int x = scanner.nextInt();
        System.out.print("Y: ");
        int y = scanner.nextInt();
        int resultado = (x + y) * (x + y);
        System.out.println("Resultado: " + resultado);
    }
}
