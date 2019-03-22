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
public class OperadoresRelacionais {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(!a);
        int c = 10;
        int d = 20;
        System.out.println(c >= d);
        System.out.println(!(c == d));
    }
}
