/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.revisaopeoo;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos: ");
        int n = scanner.nextInt();
        double h = 0.0;
        for (int i=1;i<=n;i++){
            h = h + 1.0/i;
        }
        System.out.println("H: " + h);
        
    }
}
