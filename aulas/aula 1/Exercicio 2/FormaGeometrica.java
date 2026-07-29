/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class FormaGeometrica {
    private float lado;
    protected float area;

    public float getLado() {
        return lado;
    }

    public float getArea() {
        return area;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
    public float calcularArea(){
        area = lado * lado;
        return area;
    }
}
