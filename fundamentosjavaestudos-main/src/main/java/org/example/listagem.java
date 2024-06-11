package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listagem {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Daniel");
        nomes.add("Elias");
        nomes.add("José");
        nomes.add("Moises");




        //nomes.forEach(nome -> System.out.println(nomes));
        nomes.forEach(System.out::println);

        //System.out.println("A casa de numero " + indiceDoNumeremo + " é: " + numeroDesejado);

       /** for (int numero : numeros){
            System.out.println("casa " + numero + " com o numero: " + numeros);
        }**/
    }

}
