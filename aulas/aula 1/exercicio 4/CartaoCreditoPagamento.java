/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class CartaoCreditoPagamento extends MetodoPagamento{
    public CartaoCreditoPagamento() {
        super("Cartão de Crédito");
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.printf("Processando pagamento via %s no valor de R$ %.2f...\n", nomeMetodo, valor);
        System.out.println("Pagamento com Cartão de Crédito aprovado!");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("--- Detalhes da Transação ---");
        System.out.println("Método: " + nomeMetodo);
        System.out.println("ID do Pagamento: " + idPagamento);
        System.out.println("-----------------------------");
    }
}
