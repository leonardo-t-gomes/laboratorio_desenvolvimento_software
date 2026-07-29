/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;
import java.util.Random;
/**
 *
 * @author laboratorio
 */
abstract class MetodoPagamento {
   protected String nomeMetodo;
   protected int idPagamento;

public MetodoPagamento(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
        Random random = new Random();
        this.idPagamento = random.nextInt(900000) + 100000; // Gera um ID de 6 dígitos
    }
   
public abstract void processaPagamento(double valor);
public abstract void mostraDetalhesPagamento();
   
   
}
