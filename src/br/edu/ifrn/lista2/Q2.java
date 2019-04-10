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
public class Q2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        if (numero == 0)
            System.out.println("Número zero");
        else if (numero > 0)
            System.out.println("Positivo");
        else
            System.out.println("Negativo");
        
        //Outra forma de resolver        
        switch(Integer.signum(numero)){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Positivo");
                break;
            default:
                System.out.println("Negativo");
        }
    }
}
