package Poo.contaexemplemetodos;

public class  TesteConta {
    public static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria("1223-78", "Gabriel", 1200.75);

        contabancaria.sacar(120.00);

    }
}
