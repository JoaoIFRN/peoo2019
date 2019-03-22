/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.tipos_operadores;

/**
 *
 * @author joaon
 */
public class Exemplo1 {
    
    public static void main(String[] args) {
        //Tipos que armazenam valores inteiros
        int valorInt = 78; //(int) (35 + 34L);
        short valorShort = 7;
        long valorLong = 34L;
        byte valorByte = 125; //-128 até 127
        char valorChar = 'b';
        char valorCharII = 67;
        //Tipos que armazenam valores reais
        float valorFloat = 786.77F;
        double valorDouble = 8766.868;
        //Tipo lógico
        boolean valorLogico = true; //false
        
        //int  - Integer
        Integer valor = 879;        
        int maximo = Integer.max(56,102);
        //Float, Double, Char, Short, Boolean
        Integer valorAPartirInteger = 23;
        
        Atleta atleta1 = new Atleta();
        Atleta atleta2 = new Atleta();
        atleta1.nome = "Rafaela";
        atleta2.nome = "Sandro";
        atleta2.scoreTotal = 34;
        System.out.println(atleta1.scoreTotal);
        System.out.println(atleta1.nome);
        System.out.println(atleta2.nome);
        System.out.println(Atleta.scoreTotal);
        Atleta atleta3 = atleta1;
        atleta1 = null;
        
        
    }
    
}//Final da classe

class Atleta {
    String nome; //Variável de instância
    static int scoreTotal = 0; //Variável da classe
    
    //Método chamado correr sem retorno e com um parâmetro
    void correr(int velocidade /* Parâmetro */){
        //Variável local
        int velocidadeNova = velocidade + 3; 
    }
    
    //Método chamado max com retorno inteiro e dois parâmetros
    int max(int a, int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
    
    //Método chamado teste com retorno inteiro e sem parâmetros
    int teste(){
        return 0;
    }
    
}




