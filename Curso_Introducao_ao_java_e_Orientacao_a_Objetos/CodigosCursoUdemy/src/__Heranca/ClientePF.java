/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package __Heranca;

/**
 *
 * @author marcio.rocha
 */
public class ClientePF extends Cliente{
    private String cpf;
    
    public ClientePF(int codigo, String nome, String cpf, String endereco){
        super(nome,endereco,codigo);
        this.cpf = cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return cpf;
    }
}
