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
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de dois dígitos: ");
        int numero = scanner.nextInt();
        System.out.println(numero/10 + numero%10);
        
        //Outra forma mocoronga
        String n = String.valueOf(numero);
        int digito1 = Integer.parseInt(n.substring(0,1));
        int digito2 = Integer.parseInt(n.substring(1,1));
        int resultado = digito1 + digito2;               
    }
}
