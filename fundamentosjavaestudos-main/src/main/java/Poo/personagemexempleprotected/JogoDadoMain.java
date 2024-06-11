package Poo.personagemexempleprotected;

import Poo.personagemexempleprotected.jogocodigo.Guerreiro;

public class JogoDadoMain {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro();
        guerreiro.atacar();

        //System.out.println(guerreiro.rolarDado());
        /*
        * não é permitido o guerreiro rolar os dados pois o rolarDado()
        * é usado apenas pelas classes que herdam personagem
        * e porque estas duas classes estão em outro pacote
        * */

    }
}
