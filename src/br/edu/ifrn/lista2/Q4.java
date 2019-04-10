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
public class Q4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        String letra = entrada.next();
        letra = letra.toLowerCase();
        switch(letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal");
            break;
            default:
                System.out.println("Consoante ou símbolo");
        }
        
        if ("aeiou".contains(letra)){
            System.out.println("Vogal");
        }else{
            System.out.println("Consoante ou símbolo");
        }
        
        if (letra.equals("a") || letra.equals("e") ||
            letra.equals("i") || letra.equals("o") ||
            letra.equals("u"))
            System.out.println("Vogal");
        else
            System.out.println("Consoante ou símbolo");
    }
}
