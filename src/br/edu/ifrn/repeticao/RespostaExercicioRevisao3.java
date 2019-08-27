/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.repeticao;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class RespostaExercicioRevisao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        System.out.println(calcularFatorial(scanner.nextInt()));
    }

    static int calcularFatorial(int numero) {
        if (numero <= 1) 
            return 1;
        else 
            return numero * calcularFatorial(numero - 1);        
    }
}
