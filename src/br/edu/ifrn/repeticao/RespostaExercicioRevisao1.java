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
public class RespostaExercicioRevisao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPares = 0;
        int numeroImpares = 0;
        for (int i = 0;i < 10;i++){
            System.out.print("Digite um valor inteiro: ");
            int valor = scanner.nextInt();
            if (valor == 0)
                continue;
            if (valor % 2 == 0)
                numeroPares++;
            else
                numeroImpares++;
        }
    }
}
