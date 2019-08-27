/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaon
 */
public class TesteDeInteface {
    public static void main(String[] args) {
        /*Motorizado carro = new Carro();
        carro.acelerar();
        carro.desligar();
        carro.ligar();
        
        System.out.println(carro instanceof Carro);
        Carro carro2 = (Carro) carro;
        ((Carro) carro).parar();*/
        
        List<Motorizado> veiculos = new ArrayList();
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        veiculos.add(new Moto());
        veiculos.add(new Carro());
        veiculos.stream().map((motorizado) -> {
            motorizado.ligar();
            return motorizado;
        }).filter((motorizado) -> (motorizado instanceof Carro)).forEachOrdered((motorizado) -> {
            ((Carro) motorizado).parar();
        });
        
    }
}
