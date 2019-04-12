/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista2;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota 1 (0-100): ");
        int nota1 = entrada.nextInt();
        System.out.print("Nota 2 (0-100): ");
        int nota2 = entrada.nextInt();
        int media = (nota1 + nota2) / 2;
        if (media == 100){
            System.out.println("Aprovado com distinção");
        }else if (media >= 70){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
    }
}
