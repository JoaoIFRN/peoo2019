/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joelma;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author joaon
 */
public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salarios = new ArrayList();
        
        while (true){
            System.out.print("Digite o valor do salário (R$): ");
            double salario = scanner.nextDouble();
            if (salario == 0.0){
                break;
            }
            salarios.add(salario);                        
        }
        double abonoTotal = 0.0;
        for (int i=0;i<salarios.size();i++){
           double abono = salarios.get(i) * 0.20;
            if (abono < 100.0){
                abono = 100.0;
            } 
            abonoTotal+=abono;
            System.out.printf("R$ %.2f\t-\tR$ %.2f",salarios.get(i),abono);
            System.out.println(); 
        }
        
        System.out.println("Número de colaboradores: " + salarios.size());
        System.out.println("Total gasto com abonos: " + abonoTotal);
        
    }
}
