package org.example;

import java.util.ArrayList;
import java.util.List;

public class estruturaDeDados {
    public static void main(String[] args) {
        //Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Daniel");
        nomes.add("José");
        nomes.add("Gabriel");
        nomes.add("Moises");
        nomes.add("Elias");

        for(String nome : nomes){ // para percorrer op array list
            System.out.println("O nome é: " + nome);
        }

    }

    // para definir um tipo abra "<>"
}
