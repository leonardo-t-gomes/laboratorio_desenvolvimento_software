/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package source;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Arquivo {

    private FileWriter arqW;
    private BufferedWriter escritor;

    private FileReader arqR;
    private BufferedReader leitor;

    private List<Aluno> listaAlunos;

    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaAlunos = new ArrayList<>();
    }

    /**
     * Lê o arquivo texto e reconstrói a lista de alunos.
     * Cada linha do arquivo é separada por ";" na seguinte ordem:
     * nome;dataNascimento;sexo;matricula;curso;cpf;endereco;estado;telefone
     */
    public List<Aluno> leArquivo() {

        listaAlunos.clear();

        try {

            arqR = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqR);

            String linha;

            while ((linha = leitor.readLine()) != null) {

                // -1 no split garante que campos vazios no final não sejam descartados
                String[] campos = linha.split(";", -1);

                if (campos.length < 9) {
                    // Linha corrompida ou incompleta: ignora e segue para a próxima
                    continue;
                }

                String nome = campos[0];
                String dataNascimento = campos[1];
                char sexo = campos[2].isEmpty() ? ' ' : campos[2].charAt(0);
                String matricula = campos[3];
                String curso = campos[4];
                String cpf = campos[5];
                String endereco = campos[6];
                String estado = campos[7];
                String telefone = campos[8];

                Aluno a = new Aluno(
                        nome,
                        dataNascimento,
                        sexo,
                        matricula,
                        curso,
                        cpf,
                        endereco,
                        estado,
                        telefone
                );

                listaAlunos.add(a);
            }

            leitor.close();
            arqR.close();

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo ainda não existe!");

        } catch (IOException e) {

            e.printStackTrace();
        }

        return listaAlunos;
    }

    public List<Aluno> getLista() {
        return listaAlunos;
    }

    /**
     * Grava a lista inteira de alunos no arquivo texto, sobrescrevendo o conteúdo anterior.
     */
    public void gravaArquivo() {

        try {

            arqW = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqW);

            for (Aluno a : listaAlunos) {

                escritor.write(
                        a.getNome() + ";" +
                        a.getNascimento() + ";" +
                        a.getSexo() + ";" +
                        a.getMatricula() + ";" +
                        a.getCurso() + ";" +
                        a.getCPF() + ";" +
                        a.getEndereco() + ";" +
                        a.getEstado() + ";" +
                        a.getTelefone()
                );

                escritor.newLine();
            }

            escritor.close();
            arqW.close();

            System.out.println("Lista de alunos salva no arquivo!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Verifica se já existe um aluno cadastrado com a matrícula informada.
     * Útil para garantir que a matrícula seja única antes de adicionar um novo aluno.
     */
    public boolean matriculaExiste(String matricula) {
        for (Aluno a : listaAlunos) {
            if (a.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }
}
