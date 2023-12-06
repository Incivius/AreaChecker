package main.java.areaChecker.figuras;

public class Hexagono implements Calculable {
    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }
}
