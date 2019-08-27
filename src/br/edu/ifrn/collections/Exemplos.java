/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.collections;

import java.util.*;
import javax.naming.ldap.HasControls;


/**
 *
 * @author joaon
 */
public class Exemplos {
    public static void main(String[] args) {
        List<Integer> inteiros = new LinkedList();
        System.out.println(inteiros.size());
        inteiros.add(56);
        inteiros.add(45);
        System.out.println(inteiros.get(0));
        if (inteiros.contains(34))
            System.out.println("Verdade");
        System.out.println(inteiros.indexOf(45));
        
        Set<Integer> numeros = new HashSet();
        numeros.add(56);
        numeros.add(56);
        numeros.add(34);
        System.out.println(numeros.size());
        
        Map<Integer, String> jogadores = new HashMap();
        jogadores.put(10, "Pato");
        jogadores.put(13, "Daniel Alves");
        jogadores.put(15, "Juanfran");
        System.out.println(jogadores.get(10));
        for (Integer numero : jogadores.keySet()){
            System.out.println(jogadores.get(numero));            
        }
        System.out.println(jogadores.containsKey(15));
        System.out.println(jogadores.containsValue("Henrique"));
        for (String jogador : jogadores.values()){
            System.out.println(jogador);
        }
    }
}
