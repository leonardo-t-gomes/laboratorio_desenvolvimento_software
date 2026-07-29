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
    ICalculadora calc = new Calculadora();

        System.out.println("Soma (5 + 3): " + calc.somar(5, 3));
        System.out.println("Subtração (10 - 4): " + calc.subtrair(10, 4));
        System.out.println("Multiplicação (6 * 7): " + calc.multiplicar(6, 7));
        System.out.println("Divisão (20 / 4): " + calc.dividir(20, 4));
        System.out.println("Raiz Quadrada de 16: " + calc.raizquadrada(16));
        System.out.println("Potência (2^3): " + calc.elevarPotencia(2, 3));
        System.out.println("Logaritmo base 10 de 100: " + calc.logaritmo10(100));

    }       
}
