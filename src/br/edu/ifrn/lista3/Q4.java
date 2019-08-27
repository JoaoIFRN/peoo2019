/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.lista3;

/**
 *
 * @author joaon
 */
public class Q4 {
    public static void main(String[] args) {
        double populacaoA = 80000;
        double populacaoB = 200000;
        double taxaA = 3;
        double taxaB = 1.5;
        int numeroAnos = 0;
        //while (populacaoA <= populacaoB){
        for (;populacaoA <= populacaoB;numeroAnos++){
            populacaoA = populacaoA * (1 + taxaA/100.0);
            populacaoB = populacaoB * (1 + taxaB/100.0);
            //numeroAnos++;
        }
        System.out.println("Número de anos: " + numeroAnos);
    }
}
