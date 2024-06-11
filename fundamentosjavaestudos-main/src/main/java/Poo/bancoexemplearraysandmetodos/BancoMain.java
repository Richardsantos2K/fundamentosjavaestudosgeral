package Poo.bancoexemplearraysandmetodos;

public class BancoMain {
    public static void main(String[] args) {
        Conta cadastrobanco1 = new Conta();

        cadastrobanco1.setNome("Richard");
        cadastrobanco1.setCpf("111.222.333-7");
        cadastrobanco1.setNumconta("1227-7");
        cadastrobanco1.setIdade(19);// se a idade for menor que 15 não criara uma conta

        //obs: todos os metodos tem validação de conta se ela é true(exite) ou se ela é false (não existe)

        cadastrobanco1.criarConta(); //cadastra uma nova conta
        cadastrobanco1.exibirTrasacoes();//exibe as transações
        cadastrobanco1.exibirConta();//informações da conta
        cadastrobanco1.excluirConta();//exclui a conta
        cadastrobanco1.sacar(100);//saca
        cadastrobanco1.depositar(100);//deposita


        float[] depositos = {100, 20, 40, 50};
        cadastrobanco1.depositarMultiplos(depositos);//deposita multiplas vezes

        float[] saques = {100, 20, 40, 50};
        cadastrobanco1.sacarMultiplos(saques);//saca multiplas vezes



    }
}
