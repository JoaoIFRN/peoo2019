/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.correcao_teste_unidade2;

import java.util.Random;

/**
 *
 * @author joaon
 */
public class Q9 {
    public static void main(String[] args) {
        for (int i=0;i<20;i++){
            int numero = 1 + (int)(Math.random() * 10);
            //System.out.println(numero);
        }
        Random random = new Random();
        System.out.println(random.nextInt(10) + 1);
    }
}
