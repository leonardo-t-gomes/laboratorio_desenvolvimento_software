/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class ContaCorrente {
    private float saldo;

    public ContaCorrente(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void definirSaldoInicial (float valor){
        this.saldo = valor;
    }
    
    public void depositar (float valor){
        saldo += valor;
    }
    
    public boolean sacar(float valor){
        if(saldo >= valor){
            System.out.println("Saque efetuado com sucesso");
            saldo-= valor;
            return true;
        }else {
            System.out.println("Saldo Insuficiente para o saque");
            return false;
        }
    }
           
    public void mostrarSaldo(){
        System.out.println("Saldo Disponivel "+ saldo);
    }
}
