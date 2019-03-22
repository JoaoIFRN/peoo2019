/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista1;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Celcius (°C): ");        
        double celcius = scanner.nextDouble();
        double farenheit = (celcius/5.0)*9.0 + 32.0;
        System.out.printf("Farenheit (°F): %.2f",farenheit);
    }
}
