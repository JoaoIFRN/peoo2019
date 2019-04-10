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
public class Q10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma letra M-matutino ou V-Vespertino ou N- Noturno: ");
        String letra = entrada.next();
        letra = letra.toLowerCase();
        switch(letra){
            case "m":
                System.out.println("Bom dia");
                break;
            case "v":
                System.out.println("Boa tarde");
                break;
            case "n":
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Turno inválido");
        }
    }
}
