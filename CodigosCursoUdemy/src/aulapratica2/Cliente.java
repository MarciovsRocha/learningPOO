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
public class Cliente {
    
    private String nome;
    private int codigo;
    private String endereco;
    
    public Cliente(String nome, String endereco, int codigo){
        this.nome = nome;
        this.endereco = endereco;
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public int getCodigo(){
        return codigo;
    }
}
