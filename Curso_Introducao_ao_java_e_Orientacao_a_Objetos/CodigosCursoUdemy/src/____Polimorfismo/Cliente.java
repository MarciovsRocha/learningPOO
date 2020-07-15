/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ____Polimorfismo;

/**
 *
 * @author marcio.rocha
 */
public class Cliente {
    
    private String nome, sobrenome, endereco;
    private int codigo;
    
    public Cliente(int codigo, String nome, String sobrenome,String endereco){
        this.codigo = codigo;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setNome(String nomeNovo){
        this.nome = nomeNovo;
    }

    public void setSobreNome(String sobrenomeNovo){
        this.sobrenome = sobrenomeNovo;
    }
    
    public void setEndereco(String enderecoNovo){
        this.endereco = enderecoNovo;
    }
    
    public String getCliente(){
        return "Cliente: "+codigo+" - "+nome+" "+sobrenome+" residente em: "+endereco;
    }
    
}// Class Cliente
