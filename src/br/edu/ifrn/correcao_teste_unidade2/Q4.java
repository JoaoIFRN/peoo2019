/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.correcao_teste_unidade2;

/**
 *
 * @author joaon
 */
public class Q4 {
    public static void main(String[] args) {
        for (int i=0;i<=1000;i++){
            String numero = String.valueOf(i);
            if (numero.contains("3") || numero.contains("6"))
                continue;
            System.out.print(i + " ");
        }
    }
}
