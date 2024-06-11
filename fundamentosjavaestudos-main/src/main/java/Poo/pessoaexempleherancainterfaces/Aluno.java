package Poo.pessoaexempleherancainterfaces;

import java.util.Scanner;

public class Aluno extends Pessoa implements Dados{

    private String matricula;
    private boolean anlmatricula;
    private String serie;


    public Aluno(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.setMatricula(null);
        this.setAnlmatricula(false);
        this.setSerie(null);
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAnlmatricula() {
        return anlmatricula;
    }

    public void setAnlmatricula(boolean anlmatricula) {
        this.anlmatricula = anlmatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void matricular(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você será matriculado");
        setAnlmatricula(true);

        System.out.print("Digite a série onde deseja se matricular: ");
        String serie = scanner.nextLine();
        setSerie(serie);
        System.out.println("Você foi matriculado com sucesso");
        System.out.println("<-----STATUS DA MATRICULA---->");
        System.out.println("|Status " + isAnlmatricula());
        System.out.println("|Numero de Matricula: " + getMatricula());
        System.out.println("|Matriculado no: " + getSerie());
        System.out.println("<---------------------------->");
    }

    public void desmatricular(){
        if (anlmatricula == true){
            anlmatricula = false;
            matricula = null;
            serie = null;
            System.out.println("Aluno desmatriculado com sucesso");
            System.out.println("<-----STATUS DA MATRICULA---->");
            System.out.println("|Status " + anlmatricula);
            System.out.println("<---------------------------->");
        }else{
            System.out.println("Você não consta nos registros");
            System.out.println("<-----STATUS DA MATRICULA---->");
            System.out.println("|Status " + anlmatricula);
            System.out.println("| Matriculado no: " + serie);
            System.out.println("<---------------------------->");
        }
    }

    public void calcMedia() {
        if (isAnlmatricula() == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor, digite suas quatro médias: ");

            System.out.print("Média 1: ");
            double m1 = scanner.nextDouble();

            System.out.print("Média 2: ");
            double m2 = scanner.nextDouble();

            System.out.print("Média 3: ");
            double m3 = scanner.nextDouble();

            System.out.print("Média 4: ");
            double m4 = scanner.nextDouble();

            double media = (m1 + m2 + m3 + m4) / 4;

            if (media < 5){
                System.out.println("Reprovado");
            } else if (media == 5) {
                System.out.println("Recuperação");
            } else if (media > 5) {
                System.out.println("Aprovado");
            }

            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("O aluno não está matriculado.");
        }
    }

    @Override
    public void imprimirDados() {
        System.out.println("<-----INFORMAÇÕES DO(A) ALUNO(A)----->");
        super.imprimirDados();
        System.out.println("|Numero da Matricula: " + getMatricula());
        System.out.println("| Status da matricula: " + anlmatricula);
        System.out.println("| Serie: " + serie + " Ano");
    }

}
