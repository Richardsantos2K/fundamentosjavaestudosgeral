package Poo.joguinhoexemplemodificadores;

/*
* Modificadores de acesso:
*
* private, public, protected -> modificadores de acesso
*
* final, abstract -> modificadores sem acesso
*
* */

//so podera ter metodos abstratos em classes abstratas
public abstract class Personagem {
    private String nome;
    private String classe;
    private int nivel;

    public Personagem(String nome) {
        this.nome = nome;
        this.classe = "Nenhuma";
        this.nivel = 1;
    }

    @Override
    public String toString() {
        String informacoes = String.format("%s (Nivel: %d) - Classe: %s", nome, nivel, classe);
        return informacoes;
    }
    // <modificadorAcesso> <modificadorsemAcesso> <retornoMetodo> nomeDoMetedo() caso não queira sobreescrever
    public final void atacarSemArma(){//nem uma classe que herda de personagem vai sobreescrever este metodo
        System.out.println("O personagem atacou");
    }

    // <modificadorAcesso> <retornoMetodo> nomeDoMetedo()// caso queira sobreescrever
    public void atacar(){
         System.out.println("O personagem atacou");
    }

    //quando é um matedo abstract não pode ter implementação
    //pode pode ter corpo de metodo, ou as chaves ("{}").
    public abstract void atacarComArma();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}

