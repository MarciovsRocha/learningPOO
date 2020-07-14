/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica2;

/**
 *
 * @author marcio.rocha
 */
public class ClientePJ extends Cliente{
    
    private String cnpj;
    
    public ClientePJ(int codigo,String nome, String cnpj, String endereco){
        super(nome,endereco,codigo);
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
}
