package cursojavathread.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
    public static void main(String[] args) throws IOException {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setEmail("pessoa1@gamil.com");
        pessoa1.setIdade(25);
        pessoa1.setNome("carlos");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setEmail("pessoa2@gamil.com");
        pessoa2.setIdade(40);
        pessoa2.setNome("Nilce");

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setEmail("pessoa2@gamil.com");
        pessoa3.setIdade(30);
        pessoa3.setNome("Rogerio");


        //Pode vir de algum banco de dados
        List<Pessoa> pessoasGeral = new ArrayList<Pessoa>();

        pessoasGeral.add(pessoa1);
        pessoasGeral.add(pessoa2);
        pessoasGeral.add(pessoa3);


        File arquivo = new File("C:\\fundamentosjavaestudos-main\\fundamentosjavaestudos-main\\src\\main\\java\\cursojavathread\\arquivos\\arquivos.txt");

        if(!arquivo.exists()){
            arquivo.createNewFile();
        }

        FileWriter escrever_no_arquivo = new FileWriter(arquivo);

        /*escrever_no_arquivo.write("Meu texto do arquivo");
        escrever_no_arquivo.write("\n");
        escrever_no_arquivo.write("Minha segunda Linha");*/

        /*for(int i = 1; i <= 10; i++){
            escrever_no_arquivo.write("\nMeu texto do arquivo: " + i + "\n");
        }*/

        for (Pessoa p:pessoasGeral) {
            escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" +
                    p.getIdade() + "\n");
        }

        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();

    }
}
