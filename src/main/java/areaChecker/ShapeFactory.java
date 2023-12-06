package main.java.areaChecker;

import main.java.areaChecker.figuras.Calculable;
import main.java.areaChecker.figuras.Circulo;
import main.java.areaChecker.figuras.Cubo;
import main.java.areaChecker.figuras.Hexagono;
import main.java.areaChecker.figuras.Losango;
import main.java.areaChecker.figuras.Paralelogramo;
import main.java.areaChecker.figuras.Quadrado;
import main.java.areaChecker.figuras.Retangulo;
import main.java.areaChecker.figuras.Trapezio;
import main.java.areaChecker.figuras.Triangulo;

public class ShapeFactory {
    public static Calculable getShape(ShapeType type, Double[] values) {
        switch (type) {
            case QUADRADO:
                return new Quadrado(values[0]);
            case RETANGULO:
                return new Retangulo(values[0], values[1]);
            case CIRCULO:
                return new Circulo(values[0]);
            case TRIANGULO:
                return new Triangulo(values[0], values[1]);
            case PARALELOGRAMA:
                return new Paralelogramo(values[0], values[1]);
            case TRAPEZIO:
                return new Trapezio(values[0], values[1], values[2]);
            case HEXAGONO:
                return new Hexagono(values[0]);
            case LOSANGO:
                return new Losango(values[0], values[1]);
            case CUBO:
                return new Cubo(values[0]);
            default:
                throw new IllegalArgumentException("Tipo de figura desconhecido: " + type);
        }
    }
}
