package Poo.personagemexempleprotected.jogocodigo;


import java.util.Random;

public abstract class Personagem {

    public abstract void atacar();

    protected int rolarDado(){
        Random gerador = new Random();
        int numero = 1 + gerador.nextInt(6);
        return numero;
    }
    /*
    * Para o metodo rolarDado ser acessivel somente para as classes que o extender e não para o guerreiro usa o rolarDado();
    * dizemos que o metodo é protegido(protected)
    * */
}
