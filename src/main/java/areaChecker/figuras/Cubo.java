package main.java.areaChecker.figuras;

public class Cubo implements Calculable {
    private double aresta;

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(aresta, 2);
    }
}