package Poo.Polimorfismoesobrecargademetodo;

import Poo.Polimorfismoesobrecargademetodo.RichFlix.Filme;
import Poo.Polimorfismoesobrecargademetodo.RichFlix.Serie;
import Poo.Polimorfismoesobrecargademetodo.RichFlix.Video;

public class App {
    public static void main(String[] args) {
        // Polimorfismo
        // Poli -> muitas
        // morfo -> múltiplas formas
        /*Permite que o mesmo nome, represente varios
         comportamentos diferentes*/


        // um unico nome -> pode ter comportamentos diferentes
        Filme filme = new Filme("Avengers");
        filme.play(); //exemplo
        System.out.println();
        filme.play("ing-usa");//exemplo Sobrecarga
        System.out.println();
        filme.play("japônes", "arabê");
        System.out.println();

        Serie serie = new Serie("The Last of Us", 2, 10);
        serie.play(2, 8);
        System.out.println();
        System.out.println(serie);
    }
}
