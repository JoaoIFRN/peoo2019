/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.arrays;

/**
 *
 * @author joaon
 */
public class Teste1 {
    public static void main(String[] args) {
        int [] inteiros = new int[10];
        
        for (int i = 0 ;i < inteiros.length; i++){
            System.out.println(inteiros[i]);
        }
        
        for (int elemento : inteiros){
            System.out.println(elemento);
        }
        
        int [] inteiros2 = {23, 45, 64, 0xff, 07};
        
        for (int i : inteiros2){
            System.out.println(i);
        }
        
        inteiros2[2] = 3455;
        
        //System.out.println(inteiros2[6]);
        
    }
}
