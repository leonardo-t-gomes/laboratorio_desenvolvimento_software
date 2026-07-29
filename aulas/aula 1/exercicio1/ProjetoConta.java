/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoconta;

import java.util.Scanner;

/**
 *
 * @author laboratorio
 */
public class ProjetoConta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente(0);
        
        //primeiro teste
        conta.definirSaldoInicial(1000);
        conta.sacar(500);
        conta.depositar(50);
        
        conta.mostrarSaldo();
        
        //segundo teste0
        conta.sacar(600);
        conta.mostrarSaldo();

//teste Pessoal
//        
//        System.out.println("Valor do deposito");
//        float deposito = teclado.nextFloat();
//        conta.depositar(deposito);
//        
//        System.out.println("Valor do saque");
//        float saque = teclado.nextFloat();
//        conta.sacar(saque);
//        
//        
//        conta.mostrarSaldo();
    }
}
