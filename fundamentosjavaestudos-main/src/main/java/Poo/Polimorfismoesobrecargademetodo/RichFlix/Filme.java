package Poo.Polimorfismoesobrecargademetodo.RichFlix;

public class Filme extends Video{

    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "Pt-br";
        this.legenda = "Nenhuma";
    }

    public void play(String audio, String legenda){ //para sobrecarregar é preciso de parametros obrigatoriamente
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("Play: " + toString());
    }


    @Override
    public void play() {
        System.out.println("Play: filme " + getNome());
    }

    public void play(String audio){ //sobrecarga
        this.audio = audio;
        if (audio == "português"){
            this.legenda = "Nenhuma";
        } else{
            this.legenda = "português";
        }
        System.out.println("Play: " + toString());
    }

    @Override
    public String toString() {
        String informacao = String.format("Filme %s (audio: %s -> legenda: %s)", getNome(), audio, legenda);
        return informacao;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }
}
