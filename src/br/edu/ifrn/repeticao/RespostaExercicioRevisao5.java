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
public class RespostaExercicioRevisao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de termos: ");
        int numeroTermos = scanner.nextInt();
        //S = 1/1 + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m
        double numerador = 1;
        double denominador = 1;
        double soma = 0.0;
        for (int i=0;i<numeroTermos;i++){
            soma = soma + numerador/denominador;
            numerador+=1;
            denominador = denominador + 2;
        }
        System.out.printf("Soma: %.2f", soma);
    }
}
