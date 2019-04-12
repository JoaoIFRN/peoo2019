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
public class Q6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número 1: ");
        int n1 = entrada.nextInt();
        System.out.print("Número 2: ");
        int n2 = entrada.nextInt();
        System.out.print("Número 3: ");
        int n3 = entrada.nextInt();
        int maior = n1;
        if (n2 > maior)
            maior = n2;
        if (n3 > maior)
            maior = n3;
        System.out.println("Maior: " + maior);
        
        //Extra - Exemplo com vetor
        int [] vetor = {3,7,89,23,101,34};
        int [] vetor2 = new int[100];
        maior = Integer.MIN_VALUE;
        for (int valor : vetor){
            if (valor > maior)
                maior = valor;
        }
        System.out.println(maior);
    }
    
}
