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
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor da hora (R$): ");
        double valorHora = scanner.nextDouble();
        System.out.print("Número de horas: ");
        int numeroHoras = scanner.nextInt();
        double salario = numeroHoras * valorHora;
        System.out.printf("Salário: R$ %.2f",salario);
    }
}
