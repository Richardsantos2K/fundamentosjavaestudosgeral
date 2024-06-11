package org.example;

public class condicoes {


    public static void main(String[] args) {
        
        int dadoInt = 11;
        
        if (dadoInt > 18){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("voce é menor de idade");
        }

        int valorInicial = 0;

        int valorFinal = 10;

        while(valorInicial <= valorFinal){
            System.out.println("Numero " + valorInicial);
            valorInicial++;
        }

        for(int i = 0; i < 4; i++){
            System.out.println("o valor do i é: " + i);

        }


        
        
    }

}
