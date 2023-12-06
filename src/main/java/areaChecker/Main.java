package main.java.areaChecker;

import main.java.areaChecker.figuras.Calculable;
import test.java.TesteCalculoArea;

public class Main {
    public static void main(String[] args) {
        Calculable quadrado = ShapeFactory.getShape(ShapeType.QUADRADO, new Double[]{5.0});
        Calculable retangulo = ShapeFactory.getShape(ShapeType.RETANGULO, new Double[]{4.0, 6.0});
        Calculable circulo = ShapeFactory.getShape(ShapeType.CIRCULO, new Double[]{3.0});
        Calculable triangulo = ShapeFactory.getShape(ShapeType.TRIANGULO, new Double[]{3.0, 4.0});
        Calculable paralelogramo = ShapeFactory.getShape(ShapeType.PARALELOGRAMA, new Double[]{5.0, 7.0});
        Calculable trapezio = ShapeFactory.getShape(ShapeType.TRAPEZIO, new Double[]{3.0, 5.0, 4.0});
        Calculable hexagono = ShapeFactory.getShape(ShapeType.HEXAGONO, new Double[]{4.0});
        Calculable losango = ShapeFactory.getShape(ShapeType.LOSANGO, new Double[]{6.0, 8.0});
        Calculable cubo = ShapeFactory.getShape(ShapeType.CUBO, new Double[]{3.0});

        TesteCalculoArea.testarCalculoArea(quadrado);
        TesteCalculoArea.testarCalculoArea(retangulo);
        TesteCalculoArea.testarCalculoArea(circulo);
        TesteCalculoArea.testarCalculoArea(triangulo);
        TesteCalculoArea.testarCalculoArea(paralelogramo);
        TesteCalculoArea.testarCalculoArea(trapezio);
        TesteCalculoArea.testarCalculoArea(hexagono);
        TesteCalculoArea.testarCalculoArea(losango);
        TesteCalculoArea.testarCalculoArea(cubo);
    }
}
