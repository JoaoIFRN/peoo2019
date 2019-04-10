/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista2;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = entrada.next();
        letra = letra.toUpperCase();
        if (letra.equals("M"))
            System.out.println("Masculino");
        else if (letra.equals("F"))
            System.out.println("Feminino");
        else
            System.out.println("Inválido");
            
        switch(letra){
            case "M":
                System.out.println("Masculino");
                break;
            case "F":
                System.out.println("Feminimo");
                break;
            default:
                System.out.println("Inválido");
        }
       
    }
}
