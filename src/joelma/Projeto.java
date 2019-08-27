/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joelma;

/**
 *
 * @author joaon
 */
public class Projeto {
    
    private Funcionario gerente;

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Projeto{" + "gerente=" + gerente + '}';
    }
    
    
    
    
}
