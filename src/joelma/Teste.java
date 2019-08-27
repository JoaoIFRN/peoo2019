/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joelma;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Teste {
    public static void main(String[] args) {
double cont = 4;
        int esp = 4;
        int esp2 = 6;
        int qnum = 1;
        int qnum2 = 1;
        int num = 1;
        String espa = "   ";
        String numero = "";
        while (esp2 > 1){
            while(esp>3){
                espa = espa+" ";
                esp--;
            }
            while(qnum>0){
                numero = numero + Integer.toString(num);
                qnum--;
            }
            
            System.out.print(espa + numero+"\n");
            espa = "";
            qnum2 = qnum2 + 2;
            qnum = qnum2;
            numero = "";
            esp=esp2;
            esp2--;
            num++;
        }
        
    }
}
