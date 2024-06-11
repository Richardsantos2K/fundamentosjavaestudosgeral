package Poo.Agregacao.telefone;

public class Ligacao {
    private String horarioLigacao;
    private ListaDeContatos listaDeContatos;

    public Ligacao(ListaDeContatos listaDeContatos) {
        this.listaDeContatos = listaDeContatos;;
    }


    public void ligar(String nomeOuNumero) {
        boolean contatoEncontrado = false;

        // Procurar na lista de contatos pelo nome ou pelo número
        for (Contato contato : listaDeContatos.getListaContatos()) {
            if (contato.getNome().equalsIgnoreCase(nomeOuNumero) || contato.getNumero().equals(nomeOuNumero)) {
                System.out.printf("Chamando o número associado ao contato: %s - Número: %s\n",
                        contato.getNome(),
                        contato.getNumero());
                contatoEncontrado = true;
                break;
            }
        }

        // Se o contato não foi encontrado, exibir mensagem
        if (!contatoEncontrado) {
            System.out.printf("O contato associado ao nome ou número '%s' não se encontra na lista de contatos\n", nomeOuNumero);
        }

        // Obter e imprimir o horário da ligação
        String horarioLigacao = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"));
        System.out.println("Horário da ligação: " + horarioLigacao);
    }


    public String getHorarioLigacao() {
        return horarioLigacao;
    }

    public void setHorarioLigacao(String horarioLigacao) {
        this.horarioLigacao = horarioLigacao;
    }

    public ListaDeContatos getListaDeContatos() {
        return listaDeContatos;
    }

    public void setListaDeContatos(ListaDeContatos listaDeContatos) {
        this.listaDeContatos = listaDeContatos;
    }


    /*@Override
    public String toString() {
        String info = String.format("Origem: %s\tDestino: %s\tHorário: %s",
                numeroOrigem,
                numeroDestino,
                horarioLigacao);
        return info;

    }*/
}
