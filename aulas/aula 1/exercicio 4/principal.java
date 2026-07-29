/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class principal {
    public static void main(String[] args) {
        //estanciando classes
        MetodoPagamento cartao = new CartaoCreditoPagamento();
        MetodoPagamento paypal = new PayPalPagamento();
        MetodoPagamento pix = new PIXPagamento();

        // Testando Cartão de Crédito
        cartao.processaPagamento(250.50);
        cartao.mostraDetalhesPagamento();
        System.out.println();

        // Testando PayPal
        paypal.processaPagamento(120.00);
        paypal.mostraDetalhesPagamento();
        System.out.println();

        // Testando PIX
        pix.processaPagamento(85.90);
        pix.mostraDetalhesPagamento();

    }       
}
