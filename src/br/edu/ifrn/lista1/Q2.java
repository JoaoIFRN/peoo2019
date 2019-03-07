/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 1724026
 */
public class Q2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.println("Número digitado: " + numero);
        System.out.printf("Número digitado: %d", numero);
        
        //Outra maneira de entrada de dados
        String valor = 
        JOptionPane.showInputDialog("Número: ");
        int valorInteiro = Integer.parseInt(valor);
        JOptionPane.showMessageDialog(null,
                valorInteiro);
        
    }
    
}
