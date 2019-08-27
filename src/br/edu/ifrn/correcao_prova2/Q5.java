/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.correcao_prova2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaon
 */
public class Q5 {
    public static void main(String[] args) throws ParseException {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        
        animal1.setId(1);
        animal1.setNome("Hulk");
        String data = "12/05/2017";
        SimpleDateFormat formato = 
                new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = formato.parse(data);        
        animal1.setDataNascimento(dataNascimento);
        animal1.setSexo("Masculino");
        animal1.setCastrado(true);
        animal1.setVacinado(false);
        
        animal2.setId(2);
        animal2.setNome("Laika");
        animal2.setDataNascimento(formato.parse("09/04/2015"));
        animal2.setSexo("Feminino");
        animal2.setVacinado(true);
        
        Raca raca1 = new Raca();
        Raca raca2 = new Raca();
        
        raca1.setId(1);
        raca1.setOrigem("Chinês");
        raca1.setTamanhoMaximo(14.0);
        raca1.setTamanhoMinimo(10.0);
        raca1.setExpectativaVida(13);
        raca1.setTemperamento(2);
        
        raca2.setId(2);
        raca2.setOrigem("Inglês");
        raca2.setTamanhoMaximo(18.0);
        raca2.setTamanhoMinimo(13.0);
        raca2.setExpectativaVida(17);
        raca2.setTemperamento(6);
        
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setLogin("Naruto");
        usuario.setSenha("123");
        
        Adotante adotante1 = new Adotante();
        Adotante adotante2 = new Adotante();
        
        adotante1.setId(1);
        adotante1.setNome("Saitama");
        adotante1.setTelefone("");
        adotante2.setId(2);
        adotante2.setNome("Goku");
        adotante2.setTelefone("89797-8797");
        
        Endereco endereco1 = new Endereco();
        endereco1.setId(1);
        
        animal1.setRaca(raca2);
        animal2.setRaca(raca1);
        
        adotante1.setEndereco(endereco1);
        adotante2.setEndereco(new Endereco());
        
        Adocao adocao1 = new Adocao();
        adocao1.setAdotante(adotante1);
        
        adocao1.getAdotante().getEndereco().setRua("Santa Luzia");
        
        
        
        
        
    }
}
