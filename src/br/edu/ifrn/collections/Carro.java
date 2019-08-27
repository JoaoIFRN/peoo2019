/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.collections;

/**
 *
 * @author joaon
 */
public class Carro implements Motorizado {
    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }
    @Override
    public void desligar() {
        System.out.println("Desligado");
    }
    @Override
    public void ligar() {
        System.out.println("Ligado");
    }    
    public void parar(){
        System.out.println("Parando");
    } 
    
}
