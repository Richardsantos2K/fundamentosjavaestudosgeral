package Poo.personagemexempleprotected.jogocodigo;

public class Guerreiro extends Personagem {

    @Override
    public void atacar() {
        int valorDado6Faces = this.rolarDado();
        System.out.printf("Você tirou: %d do dado \n", valorDado6Faces);
        if (valorDado6Faces < 3){
            System.out.println("O Guerreiro errou o ataque");
        } else if(valorDado6Faces == 6){
            System.out.println("O guerreiro acertou um Golpe especial");
        } else{
            System.out.println("O Guerreiro acertou o inimigo");
        }
    }
}
