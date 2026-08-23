/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author User
 */
public class Aluno {
    private String nome;
    private String dataNascimento;
    private char sexo;
    private String matricula;
    private String curso;
    private String cpf;
    private String endereco;
    private String estado;
    private String telefone;

    public Aluno(String nome, String dataNascimento, char sexo, String matricula, 
                 String curso, String cpf, String endereco, String estado, String telefone) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estado = estado;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return nome + ";" + dataNascimento + ";" + sexo + ";" + matricula + ";" 
             + curso + ";" + cpf + ";" + endereco + ";" + estado + ";" + telefone + "\n";
    }
}
