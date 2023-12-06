package test.java;

import main.java.figuras.Circulo;
import main.java.figuras.FiguraGeometrica;
import main.java.figuras.Paralelogramo;
import main.java.figuras.Quadrado;
import main.java.figuras.Retangulo;
import main.java.figuras.Triangulo;

public class TesteCalculoArea {
    public static void main(String[] args) {
        // testarCalculoArea(new FiguraFactoryConcreta(new Quadrado(5.0)));
        // testarCalculoArea(new FiguraFactoryConcreta(new Circulo(3.0)));
        // testarCalculoArea(new FiguraFactoryConcreta(new Retangulo(4.0, 6.0)));
        // testarCalculoArea(new FiguraFactoryConcreta(new Triangulo(3.0, 4.0)));
        // testarCalculoArea(new FiguraFactoryConcreta(new Paralelogramo(5.0, 7.0)));
        // Adicione testes para outras figuras geométricas.
    }

    private static void testarCalculoArea(FiguraFactoryConcreta fabrica) {
        FiguraGeometrica figura = fabrica.criarFigura();
        double area = figura.calcularArea();
        System.out.println("Área de " + figura.getClass().getSimpleName() + ": " + area);
    }
}
