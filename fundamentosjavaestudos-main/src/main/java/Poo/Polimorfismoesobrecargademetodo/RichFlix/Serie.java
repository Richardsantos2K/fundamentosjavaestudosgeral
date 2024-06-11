package Poo.Polimorfismoesobrecargademetodo.RichFlix;

public class Serie extends Filme{
    private int temporadas;
    private int episodiosPorTemporada;
    private int temporadaAtual;
    private int epAtual;



    public Serie(String nome, int temporadas, int episodiosPorTemporada) {
        super(nome);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadaAtual = 1;
        this.epAtual = 1;
    }

    public void play(int temporada, int episodio) {
        if(validarEpsodio(temporada, episodio) == true){
            this.temporadaAtual = temporada;
            this.epAtual = episodio;
            System.out.println("Play: " + toString());
        } else {
            System.out.println("Episodio invalido");
        }
    }

    private boolean validarEpsodio(int temporada, int episodio){
        if (temporada == 0 || episodio == 0){
            return false;
        }
        if (temporada > temporadas || episodio > episodiosPorTemporada){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //Serie <nome> <temporada>x0<episodio>
        //Serie The Last of Us 1x15

        String informacao = String.format("Serie: %s %dx%02d(audio: %s -> legenda: %s)",
                getNome(),
                temporadaAtual,
                epAtual,
                getAudio(),
                getLegenda());
        return informacao;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadaAtual() {
        return temporadaAtual;
    }

    public void setTemporadaAtual(int temporadaAtual) {
        this.temporadaAtual = temporadaAtual;
    }

    public int getEpAtual() {
        return epAtual;
    }

    public void setEpAtual(int epAtual) {
        this.epAtual = epAtual;
    }
}
