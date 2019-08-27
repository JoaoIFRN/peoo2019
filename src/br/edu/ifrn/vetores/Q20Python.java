/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q20Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList ou List<Tipo dos elementos> 
        //nome da Variável = new ArrayList();
        //Observação: pacote java.util
        List<Double> salarios = new ArrayList();
        while (true){
            System.out.print("Digite o salário (R$): ");
            double salario = scanner.nextDouble();
            if (salario == 0.0){
                break;
            }
            salarios.add(salario);
        }
        final double PERCENTUAL_ABONO = 0.20;
        final double ABONO_MINIMO = 100.0;
        int numeroAbonosMinimos = 0;
        double totalAbono = 0.0;
        double maiorAbono = Double.MIN_VALUE;
        for (int i=0;i<salarios.size();i++){
            double salario = salarios.get(i);
            double abono = salario * PERCENTUAL_ABONO;
            if (abono <= ABONO_MINIMO){
                abono = ABONO_MINIMO;
                numeroAbonosMinimos++;
            }
            if (abono > maiorAbono){
                maiorAbono = abono;
            }
            totalAbono += abono;
            System.out.printf("R$ %.2f - R$ %.2f\n",salario,abono);            
        }
        
        System.out.println("Núm colaboradores: " + salarios.size());
        System.out.println("Número de abonos mínimos: " 
                + numeroAbonosMinimos);
        System.out.println("Total de abonos: " + totalAbono);
        System.out.println("Maior abono: " + maiorAbono);
        
    }
}
