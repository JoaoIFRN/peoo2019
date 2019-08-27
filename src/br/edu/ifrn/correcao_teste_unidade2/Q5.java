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
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scanner.next();
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        for (int i=0;i<numero;i++){
            System.out.println(texto);
        }
    }
}
