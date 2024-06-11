package Poo.Agregacao.telefone;

import java.util.ArrayList;

public class ListaDeContatos{
    private ArrayList<Contato> listaContatos;//listas de contatos

    public ListaDeContatos() {
        this.listaContatos = new ArrayList<Contato>();
    }

    public void adicionarContato(String nome, String numero){
        Contato novoContato = new Contato(nome, numero);
        listaContatos.add(novoContato);
    }

    public void adicionarContato(Contato novoContato) {
        listaContatos.add(novoContato);
    }

    public ArrayList<Contato> getListaContatos() {
        return listaContatos;
    }

    public ListaDeContatos buscarContatos(String palavraChave){
        //palavraChave = "Lu"
        //"Lucas" "Luana" "Lucas Mecanico"
        String palavraChaveMinusculo = palavraChave.toLowerCase();//para minusculo
        ListaDeContatos contatosFiltrados = new ListaDeContatos();
        for (Contato contato:listaContatos){
            String nomeContatoMinusculo = contato.getNome().toLowerCase();
            if (nomeContatoMinusculo.startsWith(palavraChaveMinusculo)){
                //starts = começa, with = com
                contatosFiltrados.adicionarContato(contato);

            }
        }
        return contatosFiltrados;

    }

    @Override
    public String toString() {
        String info = "Contatos:\n";
        for (Contato contato: listaContatos) {
            info = info + contato.toString() + "\n";
        }
        return info;
    }

}
