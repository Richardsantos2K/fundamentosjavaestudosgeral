package Poo.Agregacao.telefone;


public class Telefone{
    private String numeroChip;
    private ListaDeContatos listaDeContatos;


    public Telefone(String numeroChip){
        this.numeroChip = numeroChip;
        this.listaDeContatos = new ListaDeContatos();
    }

    public String getNumeroChip() {
        return numeroChip;
    }

    public ListaDeContatos getListaDeContatos() {
        return listaDeContatos;
    }

    @Override
    public String toString() {
        String info = String.format("Seu Telefone: %s\t", numeroChip);
        return info;
    }


}
