/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joelma;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String consoantes = "bcdfghjklmnpqrstvxwyz";
        String [] vetor = new String[10]; 
        int numConsoantes = 0;
        String consoantesDigitadas = "";
        for (int i=0;i<vetor.length;i++){
            System.out.print("Digite uma letra: ");
            vetor[i] = scanner.next();
            if (consoantes.contains(vetor[i])){
                numConsoantes = numConsoantes + 1;
                consoantesDigitadas = consoantesDigitadas + vetor[i] + " ";
            }
        }
        System.out.println("Número de consoantes: " 
                + numConsoantes);
        System.out.println("Consoantes digitadas: " + consoantesDigitadas);
        
        
    }
}
