package Poo.Arraysexemplearrays;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;



    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static ArrayList<Integer> obterIdades(ArrayList<Pessoa> pessoas){
        ArrayList<Integer> idades = new ArrayList<>();
        for (Pessoa pessoa : pessoas){
            idades.add(pessoa.getIdade());
        }
        return idades;
    }

}
