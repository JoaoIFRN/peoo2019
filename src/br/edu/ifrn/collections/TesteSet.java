/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author joaon
 */
public class TesteSet {
    public static void main(String[] args) {
        Set<Cliente> clientes = new HashSet();        
        clientes.add(new Cliente(1, "Ana"));
        boolean res = clientes.add(new Cliente(1, "José"));
        System.out.println(res);
        System.out.println(clientes.size());
        int tamanho = clientes.size();
        boolean estaVazio = clientes.isEmpty();
        System.out.println(clientes.remove(new Cliente(1,"")));
    }
}
