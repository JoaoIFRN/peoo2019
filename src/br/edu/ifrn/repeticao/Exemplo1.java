/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.repeticao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) 
            System.out.println(i);
        
        for (int valor = 1; valor < 100; valor +=5)
            System.out.println(valor);
        
        for (int i = 0; ; i++) {
            System.out.println(i);
            if (i == 1000)
                break;
        }
        
        Scanner scanner = new Scanner(System.in);
        for (;;){
            System.out.println("Programa de bolsas");
            System.out.println("1 - Cadastro de alunos;");
            System.out.println("2 - listar alunos;");
            System.out.println("3 - Para encerrar.");
            System.out.print("Digite uma opção: ");
            int opcao = scanner.nextInt();
            boolean sair = false;
            switch(opcao){
                case 1:
                    System.out.println("Cadastro de alunos");
                    break;
                case 2:
                    System.out.println("Listagem de alunos");
                    break;
                case 3: 
                    sair = true;
                    break;
            }
            if (sair)
                break;            
        }
    }
}
