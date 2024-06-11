package Poo.pessoaexempleherancainterfaces;

public class Pessoa implements Dados {

    private String nome;
    private int idade;
    private String cpf;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    @Override
    public void imprimirDados() {
        System.out.println("<------DADOS DA PESSOA------>");
        System.out.println("|Nome: " + nome);
        System.out.println("|CPF: " + cpf);
        System.out.println("|Idade: " + idade);
        System.out.println("<---------------------------->");
    }
}
