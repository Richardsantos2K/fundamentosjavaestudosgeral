package Poo.seriesexemplesobreescritas;

public class SeriesMain{
    public static void main(String[] args) {

        Serie serieQualquer = new Serie("The Last of US", 1, 2023);
        //serieQualquer.pegarInformações();

        System.out.println(serieQualquer.pegarInformações());
        System.out.println(serieQualquer.toString()); //nem precisa chamar o toString mais

    }
}
