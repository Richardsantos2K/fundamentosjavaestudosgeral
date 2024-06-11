package Poo.joguinhoexemplemodificadores;

/*assim como uma interface
você sera obrigado a colocar os mesmos metodos
ao extender a classe Personagem em modo abstract*/
public final class Atirador extends Personagem{

    private String arma;


    public Atirador(String nome) {
        super(nome);
        this.setClasse("Atirador");
        this.setNivel(2);
        this.arma = "Rifle de precisão";
    }

    @Override
    public String toString() {
        String informacaoPersonagem = super.toString();//super: puxa informações da classe mae, (Classe superior)

        String informacaoAtirador = String.format(" - Arma: %s", arma);//forma de utilizar codigos feitos pela classe mae
        //String resultado = informacaoPersonagem + informacaoAtirador;
        return informacaoPersonagem + informacaoAtirador;//forma de concatenar diretamente no return

        /*String informacoes = String.format("%s (Nivel: %d) - Classe: %s - Arma: %s", getNome(), getNivel(), getClasse(), arma);
        return informacoes;*/
    }

    @Override
    public void atacar() {
        System.out.printf("O atirador Atirou com sua arma do tipo: %s", arma);
    }

    @Override //metodo abstrato
    public void atacarComArma() {
        System.out.printf("O atirador atacou com sua Arma do tipo: %s", arma);
    }
}
