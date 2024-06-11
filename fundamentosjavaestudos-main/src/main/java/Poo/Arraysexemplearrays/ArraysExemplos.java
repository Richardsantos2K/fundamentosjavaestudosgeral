package Poo.Arraysexemplearrays;

import java.util.ArrayList;

public class ArraysExemplos {

    public static void main(String[] args) {
        //Arrays Estaticas:

        String[] nome = new String[6];
        nome[0] = "José";
        nome[1] = "Carlos";
        nome[2] = "Igor";
        nome[3] = "Gabriel";
        nome[4] = "Valdeir";

        System.out.println(nome[1]); //PARA TRAZER UM ARRAY ESTATICO
        System.out.println();
        System.out.println();//espaço para não ficar tudo amontuado
        //Arrays Dinamicas
        //exemplo: ArrayList<Tipo> nome = new ArrayList<Tipo>();
        ArrayList<String> nome2 = new ArrayList<String>();
        nome2.add("Josué");//0
        nome2.add("Cachorro");//1
        nome2.add("Robertao");//2
        nome2.add("Vitor");//3
        nome2.add("Waldeir");//4

        System.out.println(nome2.get(0));//PARA TRAZER UM ARRAY DINAMICO

        /*
         for (Tipo elemento : coleção) {
            // código que usa elemento
          }*/
        System.out.println();//espaço para não ficar tudo amontuado
        System.out.println();


        //PERCORRENDO AS ARRAYS

        /*
            Modo dinamico:
        * for(int indice = 0; indice < "nome da array".size(); indice ++){
        *   System.out.println("nome da array".get(indice));
        * }
        *
            Modo estatico:
        *   for(int indice = 0; indice < "nome da array".length; indice ++ ){
            System.out.println("nome da array"[indice]);
        }
        *
        * */
           /*
         for (Tipo elemento : coleção) {
            // código que usa elemento
          }*/


        for(int indice = 0; indice < nome.length; indice ++ ){//percorrendo no array estatico
            //length = tamanho do array, ele sabe quantos indices este array possue
            System.out.println(nome[indice]);
        }


        System.out.println();
        System.out.println();

        for (int indice2 = 0; indice2 < nome2.size(); indice2 ++){//Percorrendo um Array Dinamico
            //size, ele sabe quantos indices este array possue
            System.out.println(nome2.get(indice2));
        }


        for (String nomes:nome2){
            System.out.println(nomes);
        }

        System.out.println();
        System.out.println();


        //Removendo indices
        System.out.println(nome2);
        nome2.remove(2);
        System.out.println(nome2);

    }
}
