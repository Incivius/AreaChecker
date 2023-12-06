package com.areachecker.test;

import com.areachecker.factory.FiguraFactory;
import com.areachecker.factory.FiguraFactoryConcreta;
import com.areachecker.figuras.FiguraGeometrica;
import com.areachecker.figuras.Quadrado;
import com.areachecker.figuras.Circulo;
import com.areachecker.figuras.Retangulo;
import com.areachecker.figuras.Triangulo;
import com.areachecker.figuras.Paralelogramo;

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
