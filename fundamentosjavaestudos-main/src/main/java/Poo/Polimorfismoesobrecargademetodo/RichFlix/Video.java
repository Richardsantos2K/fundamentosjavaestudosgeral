package Poo.Polimorfismoesobrecargademetodo.RichFlix;

public class Video {
    private String nome;


    public Video(String nome) {
        this.nome = nome;
    }

    public void play(){
        System.out.println("Play video qualquer");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
