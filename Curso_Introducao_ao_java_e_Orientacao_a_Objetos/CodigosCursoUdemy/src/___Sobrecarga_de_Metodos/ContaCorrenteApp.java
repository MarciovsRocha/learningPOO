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
public class ContaCorrenteApp {
    public static void main(String[] args){
        ContaCorrente contacomum = new ContaCorrente(124,2345);
        ContaCorrente contaespecial = new ContaCorrente(124,654,5000.00f);
    }
}
