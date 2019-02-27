/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sequencia;

import java.util.Scanner;



/**
 *
 * @author 1724026
 */
public class ProgramaCalculaIMC {
    
    public static void main(String[] args) {
        Scanner scanner =  
                new Scanner(System.in);
        System.out.print("Massa (kg): ");
        double massa = scanner.nextDouble();
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        double imc = massa / altura * altura;
        System.out.printf("IMC = %.2f\n",imc); 
    }
    
}
