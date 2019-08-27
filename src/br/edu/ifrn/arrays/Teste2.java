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
public class Teste2 {
    public static void main(String[] args) {
        Animal [] animais = new Animal[5];
        animais[1] = new Animal("Hulk",6);
        animais[2] = new Cachorro();
        
        animais[2].setNome("Pluto");
        
        for (Animal animal : animais){
            System.out.println(animal);
        }
    }
}
