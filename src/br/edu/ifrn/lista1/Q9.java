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
public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Farenheit (°F): ");        
        double farenheit = scanner.nextDouble();
        double celcius = (5.0 * (farenheit-32.0) / 9.0);
        System.out.printf("Celcius (°C): %.2f",celcius);
    }
}
