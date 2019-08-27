/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo;

/**
 *
 * @author joaon
 */
public class Principal {
    public static void main(String[] args) {
        /*
        Endereco primeiroEndereco = new Endereco();
        System.out.println(primeiroEndereco.getRua());
        System.out.println(primeiroEndereco.getNumero());
        primeiroEndereco.setRua("Rua Girassol");
        System.out.println(primeiroEndereco.getRua());
        primeiroEndereco.setEnderecoTrabalho(true);
        System.out.println(primeiroEndereco.isEnderecoTrabalho());
        */
        
        /*
        Endereco end1 = new Endereco();
        Endereco end2 = new Endereco("Rua Girassol","Jardim Planalto",250);
        Endereco end3 = new Endereco("Sem rua", "", "", 0, 
                                     "Parnamirim", "RN", "00000-000", true);
        System.out.println(end1);
        System.out.println(end2);
        System.out.println(end3);
        */
        /*
        Curso.exibirTextoQualquer();
        Curso.contador  = 10;
        
        Curso curso = new Curso();
        
        new Curso().contador = 11;
        
        new Curso().exibirTexto();
        Curso info = curso;
        curso = null;
        System.out.println(Curso.contador);
        */
        
        Curso informatica = new Curso();
        informatica.setNome("Informática");
        
        Curso mecatronica = new Curso();
        mecatronica.setNome("Mecatrônica");
        
        Aluno alunoI = new Aluno();
        alunoI.setMatricula(87979685l);
        alunoI.setNome("Milena");
        alunoI.setCurso(informatica);
        alunoI.setEndereco(new Endereco());
        alunoI.getEndereco().setRua("Rua João da Silva");
        
        
    }
}
