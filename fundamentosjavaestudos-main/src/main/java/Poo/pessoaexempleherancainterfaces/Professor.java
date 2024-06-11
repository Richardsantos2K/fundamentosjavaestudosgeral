package Poo.pessoaexempleherancainterfaces;

public class Professor extends Pessoa implements Dados{

    private double salario;
    private String materia;


    public Professor(String nome, String cpf, int idade, double salario, String materia) {
        super(nome, cpf, idade);
        this.salario = salario;
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void imprimirDados() {
        System.out.println("<------DADOS DA PESSOA------>");
        System.out.println("|Nome: " + getNome());
        System.out.println("|CPF: " + getCpf());
        System.out.println("|Idade: " + getIdade());
        System.out.println("|Salário: " + salario);
        System.out.println("|Matéria: " + materia);
        System.out.println("<---------------------------->");
    }

}
