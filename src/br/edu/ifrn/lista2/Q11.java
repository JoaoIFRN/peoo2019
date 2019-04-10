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
public class Q11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do salário (R$):/ ");
        double salario = entrada.nextDouble();        
        double percentual = 0.0;
        if (salario <= 280.0)
            percentual = 0.2;
        else if (salario <= 700.0)
            percentual = 0.15;
        else if (salario <= 1500.0)
            percentual = 0.10;
        else 
            percentual = 0.05;
        double aumento = salario * percentual;
        double novoSalario = salario + aumento;
        System.out.printf("Salário atual: R$ %.2f\n",salario);
        System.out.printf("Percentual do aumento: %.2f%%\n",percentual*100.0);
        System.out.printf("Aumento: %.2f\n",aumento);
        System.out.printf("Novo salário: R$ %.2f",novoSalario);
    }
}
