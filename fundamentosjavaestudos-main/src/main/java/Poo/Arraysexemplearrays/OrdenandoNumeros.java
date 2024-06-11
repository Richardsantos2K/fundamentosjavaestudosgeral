package Poo.Arraysexemplearrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenandoNumeros {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(100);
        numeros.add(16);
        numeros.add(20);
        numeros.add(57);
        numeros.add(590);
        numeros.add(420);
        numeros.add(-300);
        numeros.add(-20);
        numeros.add(30);
        numeros.add(2);

        Collections.sort(numeros);//Ordem crescente

        for (Integer numero : numeros){
            System.out.println(numero);
        }

        System.out.println();

        Collections.sort(numeros, Collections.reverseOrder());//Ordem Decrescente

        for (Integer numero : numeros){
            System.out.println(numero);
        }

        System.out.println();
        System.out.println();




        //exemplo de pessoas
        ArrayList<Pessoa> pessoal = new ArrayList<>();

        pessoal.add(new Pessoa("João", 20));//indice 0
        pessoal.add(new Pessoa("Alice", 30));//indice 1
        pessoal.add(new Pessoa("Milton", 45));//indice 2
        pessoal.add(new Pessoa("Sena", 17));//indice 3

        /*definindo as idades
        pessoal.get(0).setIdade(20);
        pessoal.get(1).setIdade(30);
        pessoal.get(2).setIdade(17);
        pessoal.get(3).setIdade(26);*/

        //definir lista de idades usando metodo obterIdades
        ArrayList<Integer> idades = Pessoa.obterIdades(pessoal);

        //Exibir Idades
        System.out.println("Idades das Pessoas: ");
        for (int idade : idades){
            System.out.println(idade);
        }


        System.out.println();

        // Usando Scanner para obter o índice da pessoa

        Scanner chamarPessoa = new Scanner(System.in);
        System.out.println("Digite o índice da pessoa que deseja chamar:");

        int indice = chamarPessoa.nextInt();

        // Verificando se o índice é válido
        if (indice >= 0 && indice < pessoal.size()) {
            Pessoa pessoaChamada = pessoal.get(indice);
            System.out.println("A idade de " + pessoaChamada.getNome() + " é de " + pessoaChamada.getIdade() + " anos.");
        } else {
            System.out.println("Índice inválido. Por favor, digite um índice dentro do intervalo da lista.");
        }

    }
}
