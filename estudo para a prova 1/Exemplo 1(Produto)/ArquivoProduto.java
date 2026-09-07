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
public class ArquivoProduto {
    
    private FileWriter arqW;
    private BufferedWriter escritor;

    private FileReader arqR;
    private BufferedReader leitor;

    private List<Produto> listaProdutos;

    public String nomeArquivo;

    public ArquivoProduto (String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaProdutos = new ArrayList<>();
    }

    /**
     * Lê o arquivo texto e reconstrói a lista de alunos.
     * Cada linha do arquivo é separada por ";" na seguinte ordem:
     * nome;dataNascimento;sexo;matricula;curso;cpf;endereco;estado;telefone
     */
    public List<Produto> leArquivo() {

        listaProdutos.clear();

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
                String codigo = campos[1];
                float preco = Float.parseFloat(campos[2]);
                float quantidade = Float.parseFloat(campos[3]);
                int ativo = Integer.parseInt(campos[4]);
                String fornecedor = campos[5];

                Produto a = new Produto(
                        nome,
                        codigo,
                        preco,
                        quantidade,
                        ativo,
                        fornecedor
                );

                listaProdutos.add(a);
            }

            leitor.close();
            arqR.close();

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo ainda não existe!");

        } catch (IOException e) {

            e.printStackTrace();
        }

        return listaProdutos;
    }

    public List<Produto> getLista() {
        return listaProdutos;
    }

    /**
     * Grava a lista inteira de alunos no arquivo texto, sobrescrevendo o conteúdo anterior.
     */
    public void gravaArquivo() {

        try {

            arqW = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqW);

            for (Produto p : listaProdutos) {

                escritor.write(
                        p.getNome() + ";" +
                        p.getCodigo() + ";" +
                        p.getPreco() + ";" +
                        p.getQuantidade() + ";" +
                        p.getAtivo() + ";" 

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
    public boolean matriculaExiste(String codigo) {
        for (Produto a : listaProdutos) {
            if (a.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
}
