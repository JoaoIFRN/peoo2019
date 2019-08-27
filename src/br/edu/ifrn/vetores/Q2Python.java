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
public class Q2Python {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] numeros  = new double[10];
        for (int i=0;i<numeros.length;i++){
            System.out.print("Valor: ");
            numeros[i] = sc.nextDouble();
        }
        for (int i=numeros.length-1;i>=0;i--){
            System.out.println(numeros[i]);
        }
    }
}
