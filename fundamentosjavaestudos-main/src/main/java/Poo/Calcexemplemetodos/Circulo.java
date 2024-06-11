package Poo.Calcexemplemetodos;


public class Circulo implements FigurasGeometricas {

    //construtor

    public Circulo(int raio) {
        this.raio = raio;
    }


    //atributos

    private int raio;

    //metodos especificos da classe

    @Override
    public double calcularArea() {
        // area = PI * raio elevado a 2

        double a2 = Math.PI * Math.pow(raio, 2);

        System.out.println(a2);

        return a2;
    }


    //metodos getter e setter


    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

}
