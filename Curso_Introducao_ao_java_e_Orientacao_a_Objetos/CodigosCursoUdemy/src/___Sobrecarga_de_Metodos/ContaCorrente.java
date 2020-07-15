/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ___Sobrecarga_de_Metodos;

/**
 *
 * @author marcio.rocha
 */
public class ContaCorrente {
    private int agencia, codigo;
    private float limite;
    
    public ContaCorrente(int agencia, int codigo){
        this.codigo = codigo;
        this.agencia = agencia;
    }
    
    public ContaCorrente(int agencia, int codigo, float limite){
        this.codigo = codigo;
        this.agencia = agencia;
        this.limite = limite;
    }
    
}
