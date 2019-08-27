/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista3;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;
        boolean nomeOK = false;
        boolean idadeOK = false;
        boolean salarioOK = false;
        boolean sexoOK = false;
        boolean estadoCivilOk = false;
        while (true){
            if (!nomeOK){
                System.out.print("Nome: ");
                nome = scanner.next();
                if (nome.length() <= 3){
                    System.out.println("Nome inválido");
                    continue;
                }
                nomeOK = true;
            }
            if (!idadeOK){
                System.out.print("Idade: ");
                idade = scanner.nextInt();
                if (idade < 0 || idade > 150){
                    System.out.println("Idade inválida");
                    continue;
                }
                idadeOK = true;
            }
            if (!salarioOK){
                System.out.print("Salário: ");
                salario = scanner.nextDouble();
                if (salario <= 0){
                    System.out.println("Salário inválido");
                    continue;
                }
                salarioOK = true;
            }
            if (!sexoOK){
                System.out.print("Sexo: ");
                sexo = scanner.next();
                if (!sexo.toLowerCase().equals("f") &&
                    !sexo.toLowerCase().equals("m")){
                    System.out.println("Sexo inválido");
                    continue;
                }
                sexoOK = true;
            }
            if (!estadoCivilOk){
                System.out.print("Estado civil: ");
                estadoCivil = scanner.next();
                if (!estadoCivil.toLowerCase().equals("s") &&
                    !estadoCivil.toLowerCase().equals("c") &&
                    !estadoCivil.toLowerCase().equals("v") &&
                    !estadoCivil.toLowerCase().equals("d")){ 
                    System.out.println("Estado civil inválido");
                    continue;
                }
                estadoCivilOk = true;
            }
            break;
        }
    }
}
