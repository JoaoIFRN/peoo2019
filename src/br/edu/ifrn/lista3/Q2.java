/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista3;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Senha: ");
            String senha = scanner.next();
            if (!nome.equals(senha))
                break;
            System.out.println("Nome não pode ser igual a senha");
        }
    }
}
