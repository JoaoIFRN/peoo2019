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
public class Moto implements Motorizado{

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligando");
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligando");
    }
    
}
