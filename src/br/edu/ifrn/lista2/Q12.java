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
public class Q12 {
    public static void main(String[] args) {
        final double SINDICATO = 0.03;
        final double FGTS = 0.11;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número de horas trabalhadas: ");
        int horas = entrada.nextInt();
        System.out.print("Valor da hora: ");
        double valorHora = entrada.nextDouble();
        double salarioBruto = horas * valorHora;
        double IR = 0.0;
        if (salarioBruto <= 900)
            IR = 0.0;
        else if (salarioBruto <= 1500)
            IR = 0.05;
        else if (salarioBruto <= 2500)
            IR = 0.10;
        else
            IR = 0.20;
        double valorIR = salarioBruto * IR;
        double valorSindicato = salarioBruto * SINDICATO;
        double valorFGTS = salarioBruto * FGTS;
        double salarioLiquido = salarioBruto - valorIR -
                valorSindicato - valorFGTS;
        System.out.printf("Salário bruto: R$ %.2f\n",salarioBruto);
        System.out.printf("Percentual do IR: %.2f %%\n",IR);
        System.out.printf("Valor FGTS: R$ %.2f\n",valorFGTS);
        System.out.printf("Salário líquido: R$ %.2f\n",salarioLiquido);
    }
    
}
