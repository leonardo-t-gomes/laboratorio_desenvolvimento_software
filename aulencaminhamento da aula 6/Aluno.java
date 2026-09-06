/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package source;

/**
 *
 * @author User
 */
public class Aluno {
    public String Nome;
    public String Nascimento;
    public char Sexo;
    public String Matricula;
    public String Curso;
    public String CPF;
    public String Endereco;
    public String Estado;
    public String telefone;

    public Aluno(String Nome, String Nascimento, char Sexo, String Matricula, String Curso, String CPF, String Endereco, String Estado, String telefone) {
        this.Nome = Nome;
        this.Nascimento = Nascimento;
        this.Sexo = Sexo;
        this.Matricula = Matricula;
        this.Curso = Curso;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Estado = Estado;
        this.telefone = telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome=" + Nome + ", Nascimento=" + Nascimento + ", Sexo=" + Sexo + ", Matricula=" + Matricula + ", Curso=" + Curso + ", CPF=" + CPF + ", Endereco=" + Endereco + ", Estado=" + Estado + ", telefone=" + telefone + '}';
    }
    
    
}
