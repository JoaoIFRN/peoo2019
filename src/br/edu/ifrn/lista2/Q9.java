/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista2;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número 1: ");
        int n1 = entrada.nextInt();
        System.out.print("Número 2: ");
        int n2 = entrada.nextInt();
        System.out.print("Número 3: ");
        int n3 = entrada.nextInt();
        
        if (n1 >= n2 && n1 >= n3){
            if (n2 >= n3)
                System.out.println(n1 + "," + n2 +"," + n3);
            else
                System.out.println(n1 + "," + n3 +"," + n2);
        }else if (n2 >= n1 && n2 >= n3){
            if (n3 >= n1)
                System.out.println(n2 + "," + n3 +"," + n1);
            else
                System.out.println(n2 + "," + n1 +"," + n3);
        }else{
           if (n2 >= n1)
               System.out.println(n3 + "," + n2 +"," + n1);
            else
                System.out.println(n3 + "," + n1 +"," + n2);
        }
    }
}
