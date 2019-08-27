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
public class RespostaExercicioRevisao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor de n: ");
        int n = scanner.nextInt();
        int primeiro = 0;
        int segundo = 1;
        if (n == 1)
            System.out.print(primeiro);
        if (n >= 2)
            System.out.print(primeiro + " " + segundo + " ");
        for (int i = 0;i < n - 2 ;i++){
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            System.out.print(proximo + " ");
        }
        System.out.println();
    }
}
