package Poo.Calcexemplemetodos;

public class Quadrado implements FigurasGeometricas {

    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        double a = Math.pow(lado, 2);
        System.out.println("Area do quadrado: " + a);
        return a;
    }
}
