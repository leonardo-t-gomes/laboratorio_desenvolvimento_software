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
        Casa c = new Casa();
        
        System.out.println("Valor da casa com base no tamanho: "+c.calcularPreco(50));
        
        System.out.println("Valor da casa com base no tamanho e quantidade de quartos: "+c.calcularPreco(50,4));

    }       
}
