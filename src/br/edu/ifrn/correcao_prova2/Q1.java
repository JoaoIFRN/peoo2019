/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.correcao_prova2;

/**
 *
 * @author joaon
 */
public class Q1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int numero = i;
            int centena = numero/100;
            int dezena = (numero - centena*100)/10;
            int unidade = (numero - (centena*100 + dezena*10));
            if (numero == (Math.pow(centena, 3)+Math.pow(dezena, 3)+Math.pow(unidade, 3))){
                System.out.println(numero);
            }
            /*
            System.out.println("Centena:" + centena);
            System.out.println("Dezena:" + dezena);
            System.out.println("Unidade:" + unidade);
            */
        }
    }
}
