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
public class ArquivoEspecie {
    private FileWriter arqW;
    private BufferedWriter escritor;

    private FileReader arqR;
    private BufferedReader leitor;

    private List<Especie> listaEspecie;

    public String nomeArquivo;

    public ArquivoEspecie (String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaEspecie = new ArrayList<>();
    }

    /**
     * Lê o arquivo texto e reconstrói a lista de alunos.
     * Cada linha do arquivo é separada por ";" na seguinte ordem:
     * nome;dataNascimento;sexo;matricula;curso;cpf;endereco;estado;telefone
     */
    public List<Especie> leArquivo() {

        listaEspecie.clear();

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

                String nomeCientifico = campos[0];
                String apelido = campos[1];
                float peso = Float.parseFloat(campos[2]);
                float altura = Float.parseFloat(campos[3]);
                String grupo = campos[4];
                String sexo = campos[5];

                Especie e = new Especie(
                        nomeCientifico,
                        apelido,
                        peso,
                        altura,
                        grupo,
                        sexo
                );

                listaEspecie.add(e);
            }

            leitor.close();
            arqR.close();

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo ainda não existe!");

        } catch (IOException e) {

            e.printStackTrace();
        }

        return listaEspecie;
    }

    public List<Especie> getLista() {
        return listaEspecie;
    }

    /**
     * Grava a lista inteira de alunos no arquivo texto, sobrescrevendo o conteúdo anterior.
     */
    public void gravaArquivo() {

        try {

            arqW = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqW);

            for (Especie e : listaEspecie) {

                escritor.write(
                        e.getNomeCientifico() + ";" +
                        e.getApelido() + ";" +
                        e.getPeso() + ";" +
                        e.getAltura() + ";" +
                        e.getGrupo() + ";" +
                        e.getSexo() + ";" 

                );

                escritor.newLine();
            }

            escritor.close();
            arqW.close();

            System.out.println("Lista de Especies salva no arquivo!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Verifica se já existe um aluno cadastrado com a matrícula informada.
     * Útil para garantir que a matrícula seja única antes de adicionar um novo aluno.
     */
    public boolean matriculaExiste(String nomeCientifico) {
        for (Especie e : listaEspecie) {
            if (e.getNomeCientifico().equals(nomeCientifico)) {
                return true;
            }
        }
        return false;
    } 
}
