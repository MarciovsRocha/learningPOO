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
public class ClientePJ extends Cliente{
    private String cnpj;
    
    public ClientePJ(int codigo, String nome, String sobrenome, String endereco, String cnpj){
        super(codigo,nome,sobrenome,endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCliente(){
        return super.getCliente()+" CNPJ: "+cnpj;
    }
    
}// Class ClientePJ
