package Poo.bancoexemplearraysandmetodos;

import java.util.ArrayList;

public class Conta {
    private String nome;
    private String cpf;
    private String numconta;
    private int idade;
    private boolean statusconta;

    //sacar e depositar
    private float saldoconta;
    private ArrayList<String> historicoTransacoes;

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumconta() {
        return numconta;
    }

    public void setNumconta(String numconta) {
        this.numconta = numconta;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isStatusconta() {
        return statusconta;
    }

    public void setStatusconta(boolean statusconta) {
        this.statusconta = statusconta;
    }

    public float getSaldoconta() {
        return saldoconta;
    }

    public void setSaldoconta(float saldoconta) {
        this.saldoconta = saldoconta;
    }

    public Conta() {

        this.historicoTransacoes = new ArrayList<>();

        this.nome = null;
        this.cpf = null;
        this.numconta = null;
        this.idade = 0;
        this.statusconta = false;
        this.saldoconta = 0;
    }

    public void criarConta(){
        if (!isStatusconta()){
            if (idade == 15 || idade >= 18){
                this.statusconta = true;
                this.saldoconta = 150;
                System.out.println("Conta criada com sucesso");
                exibirConta();
            }else{
                System.out.println("Idade invalida para criar conta");
            }
        }
    }

    public void excluirConta(){
        if (!isStatusconta()){
            System.out.println("conta não consta nos registros");
        }else{
            setCpf(null);
            setNumconta(null);
            setIdade(0);
            setStatusconta(false);
            setNome(null);
            System.out.println("Conta excluida com sucesso");
            exibirConta();
        }
    }

    public void exibirConta(){
        if(isStatusconta() == true) {
            System.out.println("<-----Status da conta----->");
            System.out.println("|Nome: " + getNome());
            System.out.println("|Idade do titular: " + getIdade());
            System.out.println("|Cpf: " + getCpf());
            System.out.println("|Numero da conta: " + getNumconta());
            System.out.println("|Status da conta: " + isStatusconta());
            System.out.println("|Saldo da conta: R$" + getSaldoconta());
            System.out.println("<------------------------->");
        }else {
            setCpf(null);
            setNumconta(null);
            setIdade(0);
            setNome(null);
            setSaldoconta(0);
            System.out.println("Não consta nos registros");
            System.out.println("<-----Status da conta----->");
            System.out.println("|Nome: " + getNome());
            System.out.println("|Idade do titular: " + getIdade());
            System.out.println("|Cpf: " + getCpf());
            System.out.println("|Numero da conta: " + getNumconta());
            System.out.println("|Status da conta: " + isStatusconta());
            System.out.println("|Saldo da conta: R$" + getSaldoconta());
            System.out.println("<------------------------->");
        }
    }


    public void sacar(float valorsacar){
        if (!isStatusconta()){
            System.out.println("Você não consta nos registros para efetuar esta operação");
            exibirConta();
        }else{
            if (saldoconta >= valorsacar ){
                saldoconta = saldoconta - valorsacar;
                String transacao = "Saque de: R$" + valorsacar + " | Saldo atual: R$" + saldoconta;
                historicoTransacoes.add(transacao);
                System.out.println("valor sacado com sucesso");
                System.out.println(transacao);

            }else{
                System.out.println("Saldo insuficiente para saque");
                System.out.println("| Saldo da conta: " + saldoconta);
            }
        }

    }


    public void depositar(float valordepositar){

        if(isStatusconta() == true){
            saldoconta = saldoconta + valordepositar;
            String transacao = "Deposito de: R$" + valordepositar + " | Saldo atual: R$" + saldoconta;
            historicoTransacoes.add(transacao);
            System.out.println("Valor depositado com sucesso");
            System.out.println(transacao);
        }else{
            System.out.println("Você não consta nos registros para efetuar esta operação");
            exibirConta();
        }
    }

    public void depositarMultiplos(float[] valores){
        for(float valordepositar : valores){
            depositar(valordepositar);
        }
    }

    public void sacarMultiplos(float[] valores){
        for(float valorsacar : valores){
            sacar(valorsacar);
        }

         
    }

    public void exibirTrasacoes(){
        System.out.println("<-----Histórico de transações----->");
        for (String transacao : historicoTransacoes){
            System.out.println(transacao);
        }
        System.out.println("<--------------------------------->");
    }

    public void exibirSaldo(){
        if(isStatusconta() == true) {
            System.out.println("Seu saldo é de: R$" + saldoconta);
        }else {
            System.out.println("Você não consta nos registros para efetuar esta operação");
        }

    }

}
