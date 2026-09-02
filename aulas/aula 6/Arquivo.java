/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto;

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
 * @author laboratorio
 */
public class Arquivo {
    private FileWriter arqW;
    private BufferedWriter escritor;
    
    private FileReader arqR;
    private BufferedReader leitor;
    
    private List<Pessoa> listaPessoas;
    
    public String nomeArquivo;
    
    public Arquivo (String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaPessoas = new ArrayList<>();
    }
    
   public List<Pessoa> leArquivo() {

    listaPessoas.clear();

    try {

        arqR = new FileReader(nomeArquivo + ".txt");
        leitor = new BufferedReader(arqR);

        String linha;

        while ((linha = leitor.readLine()) != null) {

            String[] campos = linha.split(";");

            String nome = campos[0];
            char sexo = campos[1].charAt(0);
            String idioma = campos[2];

            boolean tecnologia = Boolean.parseBoolean(campos[3]);
            boolean astronomia = Boolean.parseBoolean(campos[4]);
            boolean esportes = Boolean.parseBoolean(campos[5]);

            Pessoa p = new Pessoa(
                    nome,
                    sexo,
                    idioma,
                    tecnologia,
                    astronomia,
                    esportes
            );

            listaPessoas.add(p);
        }

        leitor.close();
        arqR.close();

    } catch (FileNotFoundException e) {

        System.out.println("Arquivo ainda não existe!");

    } catch (IOException e) {

        e.printStackTrace();
    }

    return listaPessoas;
}
    
    public List<Pessoa> getLista() {
        return listaPessoas;
    }
    
    public void gravaArquivo() {

    try {

        arqW = new FileWriter(nomeArquivo + ".txt", false);
        escritor = new BufferedWriter(arqW);

        for (Pessoa p : listaPessoas) {

            escritor.write(
                    p.nome + ";" +
                    p.sexo + ";" +
                    p.idioma + ";" +
                    p.tecnologia + ";" +
                    p.astronomia + ";" +
                    p.esportes
            );

            escritor.newLine();
        }

        escritor.close();
        arqW.close();

        System.out.println("Lista salva no arquivo!");

    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
