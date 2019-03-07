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
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        Cliente cliente = new Cliente("João");
        System.out.println(cliente.nome);
        Cliente cliente2 = new Cliente();
        System.out.println(cliente2.nome);
        */
        System.out.print("Raio: ");
        double raio = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raio, 2.0);
        System.out.printf("Área: %.2f",areaCirculo);
    }
}

class Cliente {
    public String nome;
    public Cliente(){
        nome = "Sem nome";
    }
    public Cliente(String nomeCliente){
        nome = nomeCliente;
    }
}
