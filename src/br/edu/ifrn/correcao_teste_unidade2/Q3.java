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
public class Q3 {
    public static void main(String[] args) {
        
        System.out.println(pythonString(3,"João "));
        
        for (int i=1;i<=7;i++){
            for (int j=1;j<=7;j++){
                if ((i == 1 || i == 7) || (i == 2 && j == 6) ||
                    (i == 3 && j == 5) || (i == 4 && j == 3) ||
                    (i == 5 && j == 2) || (i == 6 && j == 1)){
                    System.out.print("*");                    
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static String pythonString(int numero, String valor){
        String resultado = "";
        if (numero < 0)
            return "";
        for (int i=0;i<numero;i++){
            resultado += valor;
        }
        return resultado;
    }
}
