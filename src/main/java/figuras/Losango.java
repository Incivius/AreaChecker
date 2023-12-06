package main.java.figuras;

public class Losango implements Calculable {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}
