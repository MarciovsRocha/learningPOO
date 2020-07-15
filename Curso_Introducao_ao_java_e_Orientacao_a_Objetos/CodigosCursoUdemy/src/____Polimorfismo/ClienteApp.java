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
public class ClienteApp {
    public static void main(String[] args){
        ClientePF clientepf1 = new ClientePF(1,"nome","sobrenome","mora na rua tal","15487");
        
        ClientePJ clientepj1 = new ClientePJ(2,"nome Fantasia","Razao Social","Endereco da Empresa","5454151");
        
        System.out.println(clientepf1.getCliente());
        System.out.println(clientepj1.getCliente());
    }
}
