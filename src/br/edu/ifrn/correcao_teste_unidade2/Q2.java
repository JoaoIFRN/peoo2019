/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.correcao_teste_unidade2;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidade = 0;        
        System.out.println("Digite 0 (zero) para encerrar o programa.");
        while (true){
            System.out.print("Digite um valor: ");
            int valor = scanner.nextInt();
            if (valor == 0)
                break;
            soma += valor;
            quantidade++;
        }
        if (quantidade == 0){
            System.out.println("Quantidade inválida.");
        }else{
            System.out.println("Soma: " + soma);
            double media = ((double) soma)/quantidade;
            System.out.printf("Média: %.2f",media);
            System.out.println();
        }
    }
}
