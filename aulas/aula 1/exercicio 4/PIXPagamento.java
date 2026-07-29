/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class PIXPagamento extends MetodoPagamento{
    public PIXPagamento() {
        super("PIX");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.printf("Processando pagamento via %s no valor de R$ %.2f...\n", nomeMetodo, valor);
        System.out.println("QR Code gerado! Pagamento PIX recebido instantaneamente.");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("--- Detalhes da Transação ---");
        System.out.println("Método: " + nomeMetodo);
        System.out.println("ID do Pagamento: " + idPagamento);
        System.out.println("-----------------------------");
    }
}
