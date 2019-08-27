/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.repeticao;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class RespostaExercicioRevisao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de eleitores: ");
        int numeroEleitores = scanner.nextInt();
        int votosCandidato1 = 0; int votosCandidato2 = 0;
        int votosCandidato3 = 0; int votosInvalidos = 0;
        for (int i = 0; i < numeroEleitores; i++){
            System.out.print("Vote 1, 2 ou 3: ");
            int voto = scanner.nextInt();
            switch(voto){
                case 1: votosCandidato1++;
                    break;
                case 2: votosCandidato2++;
                    break;
                case 3: votosCandidato3++;
                    break;
                default:votosInvalidos++;
            }
        }
        System.out.println("Candidato 1: " + votosCandidato1);
        System.out.println("Candidato 2: " + votosCandidato2);
        System.out.println("Candidato 3: " + votosCandidato3);
        System.out.println("Votos inválidos: " + votosInvalidos);
    }
}
