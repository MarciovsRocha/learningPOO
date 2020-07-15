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
public class ClientePF extends Cliente{
    private String cpf;
    
    public ClientePF(int codigo, String nome, String sobrenome, String endereco, String cpf){
        super(codigo,nome,sobrenome,endereco);
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCliente(){
        return super.getCliente()+" CPF: "+cpf;
    }
    
}// class ClientePF
