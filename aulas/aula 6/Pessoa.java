/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

/**
 *
 * @author laboratorio
 */
public class Pessoa {

    public String nome;
    public char sexo;
    public String idioma;

    public boolean tecnologia;
    public boolean astronomia;
    public boolean esportes;

    public Pessoa(
            String nome,
            char sexo,
            String idioma,
            boolean tecnologia,
            boolean astronomia,
            boolean esportes) {

        this.nome = nome;
        this.sexo = sexo;
        this.idioma = idioma;
        this.tecnologia = tecnologia;
        this.astronomia = astronomia;
        this.esportes = esportes;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome=" + nome +
                ", sexo=" + sexo +
                ", idioma=" + idioma +
                ", tecnologia=" + tecnologia +
                ", astronomia=" + astronomia +
                ", esportes=" + esportes +
                '}';
    }
    
    public Object[] obterDados() {
    return new Object[]{
        nome,
        sexo,
        idioma,
        tecnologia,
        astronomia,
        esportes
    };
}
}
