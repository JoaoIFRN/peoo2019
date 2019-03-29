/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.teste;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um inteiro de um dígito: ");        
        int digito = scanner.nextInt();
        int resultado = digito + digito*11 + digito*111;
        System.out.println("Resultado: " + resultado);
        
        //Resposta mocoronga do João
        String numero = String.valueOf(digito);
        String numero2 = numero + numero;
        String numero3 = numero2 + numero;
        int resultadoJoao = Integer.parseInt(numero) + 
                         Integer.parseInt(numero2) + 
                         Integer.parseInt(numero3);
        
        
        
    }
    
}
