package Poo.Agregacao;

import Poo.Agregacao.telefone.Contato;
import Poo.Agregacao.telefone.Ligacao;
import Poo.Agregacao.telefone.ListaDeContatos;
import Poo.Agregacao.telefone.Telefone;

public class AppTell {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("4002-8922");


        Contato contato1 = new Contato("Richard", "4002007");
        Contato contato2 = new Contato("Cleber", "1004005");
        Contato contato3 = new Contato("Rogerio", "778334");
        Contato contato4 = new Contato("Ricardo", "3332897");
        Contato contato5 = new Contato("Roberta", "4430178");
        Contato contato6 = new Contato("Claudio", "3872654");
        Contato contato7 = new Contato("Amanda", "0017384");
        Contato contato8 = new Contato("Amaral", "1738236");
        Contato contato9 = new Contato("Sergio", "4637829");
        Contato contato10 = new Contato("Seralinda", "9857623");
        Contato contato11 = new Contato("Rosa", "2041782");
        Contato contato12 = new Contato("Ratinho", "7654329");



        ListaDeContatos telefoneContatos = telefone.getListaDeContatos();
        telefone.getListaDeContatos().adicionarContato(contato1);
        telefone.getListaDeContatos().adicionarContato(contato2);
        telefone.getListaDeContatos().adicionarContato(contato3);
        telefone.getListaDeContatos().adicionarContato(contato4);
        telefone.getListaDeContatos().adicionarContato(contato5);
        telefone.getListaDeContatos().adicionarContato(contato6);
        telefone.getListaDeContatos().adicionarContato(contato7);
        telefone.getListaDeContatos().adicionarContato(contato8);
        telefone.getListaDeContatos().adicionarContato(contato9);
        telefone.getListaDeContatos().adicionarContato(contato10);
        telefone.getListaDeContatos().adicionarContato(contato11);
        telefone.getListaDeContatos().adicionarContato(contato12);
        System.out.println(telefoneContatos);

        System.out.println("<-----Contatos filtrados----->");
        System.out.println(telefoneContatos.buscarContatos("r"));
        System.out.println("<---------------------------->");

        Ligacao ligacao = new Ligacao(telefoneContatos);

        ligacao.ligar("cleber");



    }
}
