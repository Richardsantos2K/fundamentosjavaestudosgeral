package cursojavathread;

import javax.swing.*;

public class PrimeiraThread {
    private static final int DURACAO_TIME_OUT_MS_EMAIL = 1000;
    private static final int DURACAO_TIME_OUT_MS_NOTA_FISCAL = 2000;
    public static void main(String[] args) throws InterruptedException {

        //Thread processamento paralelo do envio de Email
        new Thread() {
            @Override
            public void run() {//executa oque nós queremos
                /*Código da rotina*/

                //Codigo da rotina que é para executar em paralelo
                for (int pos = 0; pos < 10; pos++) {
                /*quero executar esse envio com um tempo de parada,
                 ou tempo determinado*/
                    System.out.println("Exemplo envio de email");
                    try {
                        Thread.sleep(DURACAO_TIME_OUT_MS_EMAIL);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }//se acontecer alguma exceção ela só pode ser capturada no try/catch
                }
                /*fim do código paralelo*/
            }
        }.start();//Start liga a thread que fica processando paralelamente por tras


        //*********************************Divisão das threads

        //Thread processamento paralelo do envio de nota fiscal
        new Thread() {
            @Override
            public void run() {//executa oque nós queremos
                /*Código da rotina*/

                //Codigo da rotina que é para executar em paralelo
                for (int pos = 0; pos < 10; pos++) {
                /*quero executar esse envio com um tempo de parada,
                 ou tempo determinado*/
                    System.out.println("Exemplo envio de nota fiscal");
                    try {
                        Thread.sleep(DURACAO_TIME_OUT_MS_NOTA_FISCAL);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }//se acontecer alguma exceção ela só pode ser capturada no try/catch
                }
                /*fim do código paralelo*/
            }
        }.start();//Start liga a thread que fica processando paralelamente por tras


        /*Codigo do sistema do usuario continua o fluxo de trabalho*/
        System.out.println("Fim do exemplo de Thread");

        /*Fluxo do sistema, cadastro de venda, emisão de nota fiscal e etc*/
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");
    }
}

