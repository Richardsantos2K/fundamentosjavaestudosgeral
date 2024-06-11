package Poo.joguinhoexemplemodificadores;

public class JogoMain {

    public static void main(String[] args) {

        //não podemos criar um abjeto de classes abstratas
        //não é algo concreto, por isso não criamos objetos personagem
        //vai ser uma classe abstrata
        //que vai servir apenas para outras classes herdarem
        /*Personagem personagem = new Personagem("Carlito");
        System.out.println(personagem);*/
        /*por isso criaremos apenas Classes não abstratas como
        obrigatoriedade*/
        Atirador atirador = new Atirador("John");
        System.out.println(atirador);

        atirador.atacar();
        System.out.println();
        atirador.atacarSemArma();
        System.out.println();
        atirador.atacarComArma();




    }

}
