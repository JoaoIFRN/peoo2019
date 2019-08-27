/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.revisaopeoo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaon
 */
public class Teste {
    public static void main(String[] args) {
        //Criar dois objetos computadores
        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        /*O computador 1 tem as seguintes 
         características:
         - Processador de 2 núcleos com clock de 2.9 GHz
         - Fabricante: Miranda computação
         - Cliente: 
            - Nome: Israel
            - Enndereço: Parnamirim
        */
        Processador processador = new Processador();
        processador.setClock(2.9);
        processador.setNumeroNucleos(2);
        processador.setFabricante("Intel");
        
        computador1.setProcessador(processador);
        
        computador1.setCliente(new Cliente());
        computador1.getCliente().setNome("Israel");
        computador1.getCliente().setEndereco("Parnamirim");
        
        System.out.println(computador1.getCliente().getNome());
        
        
        computador2.setProcessador(new Processador());
        computador2.getProcessador().setNumeroNucleos(4);
        computador2.getProcessador().setClock(3.5);
        computador2.getProcessador().setFabricante("AMD");
        computador2.setDataVenda(new Date());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dataVenda = formato.parse("04/12/2018");
        } catch (ParseException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
        
        
        
        

        
    }
}
