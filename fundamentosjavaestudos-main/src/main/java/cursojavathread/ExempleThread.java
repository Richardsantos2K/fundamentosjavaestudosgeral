package cursojavathread;

public class ExempleThread {
    private static final int DURACAO_TIMEOUT_MS = 2000;
    public static void main(String[] args) throws InterruptedException {

        for (int posicao = 0; posicao < 10; posicao++){
            /*Quero executar esse envio com um tempo de parada,
            ou com um tempó determinado*/

            System.out.println("Executando alguma rotina");//exemplo envio de email
            Thread.sleep(DURACAO_TIMEOUT_MS);//Para parar o tempo de execução em milisegundos
            /*A cada 1 segundo o bloco dentro do for sera executado
             *
             * tudos isso preserva a integridade do codigo para não tomar
             * tanta memória, esteexemplo pode ser levado
             * quando temos multiplas tarefas dentro de uma api, e se
             * tudo for executado de uma vez só toma muita memória e por sua vez
             * não ajudara o usuario, pois pode travar
             * */
        }

        System.out.println("Fim do teste de Thread");

    }
}
