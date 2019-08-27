/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.vetores;

/**
 *
 * @author joaon
 */
public class Lista {
    
    private NoElemento primeiro;
    private int tamanho;
    
    void inserir(Object valor){
        if (primeiro == null){
            primeiro = new NoElemento(valor, null);            
        }else{
            NoElemento auxiliar = primeiro;
            while(auxiliar.getProximoElemento() != null){
                auxiliar = auxiliar.getProximoElemento();
            }
            auxiliar.setProximoElemento(new NoElemento(valor, null));
        }
        tamanho++;
    }
    
    Object get(int indice){
        if (primeiro == null)
            return null;
        
        if (indice == 0){
            return primeiro.getValor();
        }else{
            int i = 1;
            NoElemento auxiliar = primeiro;
            while(auxiliar.getProximoElemento() != null){
                auxiliar = auxiliar.getProximoElemento();
                if (i == indice)
                    return auxiliar.getValor();
                i++;
            }            
        }
        return null;
    }
    
    int getTamanho(){
        return tamanho;
    }
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir("1");
        lista.inserir("2");
        lista.inserir("3");
        System.out.println(lista.get(2));
        System.out.println(lista.getTamanho());
    }
}
