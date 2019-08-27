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
public class Endereco {

    private String rua;
    private String complemento;
    private String bairro;
    private Integer numero;
    private String cidade;
    private String estado;
    private String cep;
    private boolean enderecoTrabalho;

    public Endereco() {
    }

    public Endereco(String rua, String bairro, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public Endereco(String rua, String complemento, String bairro, int numero, String cidade, String estado, String cep, boolean enderecoTrabalho) {
        this.rua = rua;
        this.complemento = complemento;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.enderecoTrabalho = enderecoTrabalho;
    }

    public void setEnderecoTrabalho(boolean enderecoTrabalho) {
        this.enderecoTrabalho = enderecoTrabalho;
    }

    public boolean isEnderecoTrabalho() {
        return enderecoTrabalho;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", complemento=" + complemento + ", bairro=" + bairro + ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", enderecoTrabalho=" + enderecoTrabalho + '}';
    }

}
