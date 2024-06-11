package Poo.seriesexemplesobreescritas;

public class Serie {
    private String nome;
    private int temporada;
    private int ano;

    public Serie(String nome, int temporada, int ano) {
        this.nome = nome;
        this.temporada = temporada;
        this.ano = ano;
    }


    public String pegarInformações(){
        String informacoes = String.format("Nome: %s (%d) - %d temporadas(s).", nome, ano, temporada);
        return informacoes;
    }

    @Override// isso diz que é uma sobre escrita
    public String toString() {
        String informacoes = String.format("Nome: %s (%d) - %d temporadas(s).", nome, ano, temporada);
        return informacoes;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}
