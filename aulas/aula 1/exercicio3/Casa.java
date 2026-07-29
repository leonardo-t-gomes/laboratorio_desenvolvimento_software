/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class Casa {
    public float calcularPreco(int tamanho){
       return tamanho * 2000;
    }
    
    public float calcularPreco(int tamanho,int quartos){
       return (tamanho * 2000)+(quartos * 2500);
    }
}
