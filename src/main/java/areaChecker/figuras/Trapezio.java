package main.java.areaChecker.figuras;

public class Trapezio implements Calculable {
    private double baseMaior;
    private double baseMenor;
    private double altura;

    public Trapezio(double baseMaior, double baseMenor, double altura) {
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((baseMaior + baseMenor) / 2) * altura;
    }
}
