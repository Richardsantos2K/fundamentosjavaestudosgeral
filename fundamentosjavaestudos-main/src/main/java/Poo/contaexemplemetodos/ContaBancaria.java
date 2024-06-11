package Poo.contaexemplemetodos;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    //Getters e Setters


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    //depositar
    public void depositar(double valorDepositado){
        if(valorDepositado > 0){
            saldo = saldo + valorDepositado;
            System.out.println("Você recebeu um deposito de R$: " + valorDepositado);
            System.out.println("seu saldo atual é de R$: " + saldo);
        }else{
            System.out.println("Seu valor de depósito é inválido");
        }
    }
    //sacar
    public void sacar(double valorSacar){
        if(valorSacar > 0 && valorSacar <= saldo){
            saldo = saldo - valorSacar;
            System.out.println("Saque realizado com sucesso");
            System.out.println("Valor sacado: R$" + valorSacar);
            System.out.println("Seu saldo atual é de: R$" + saldo);
        }else{
            System.out.println("saque invalido");
        }

    }


}
