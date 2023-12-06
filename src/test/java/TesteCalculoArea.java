package test.java;

import main.java.areaChecker.ShapeFactory;
import main.java.areaChecker.ShapeType;
import main.java.areaChecker.figuras.Calculable;

public class TesteCalculoArea {

    public static void main(String[] args) {
        testCalcularAreaQuadrado();
        testCalcularAreaRetangulo();
        testCalcularAreaCirculo();
        testCalcularAreaTriangulo();
        testCalcularAreaParalelograma();
        testCalcularAreaTrapezio();
        testCalcularAreaHexagono();
        testCalcularAreaLosango();
        testCalcularAreaCubo();
    }

    private static void testCalcularAreaQuadrado() {
        Calculable quadrado = ShapeFactory.getShape(ShapeType.QUADRADO, new Double[]{4.0});
        double resultado = quadrado.calcularArea();
        double esperado = 16.0;
        verificarResultado("Quadrado", resultado, esperado);
    }

    private static void testCalcularAreaRetangulo() {
        Calculable retangulo = ShapeFactory.getShape(ShapeType.RETANGULO, new Double[]{3.0, 5.0});
        double resultado = retangulo.calcularArea();
        double esperado = 15.0;
        verificarResultado("Retângulo", resultado, esperado);
    }

    private static void testCalcularAreaCirculo() {
        Calculable circulo = ShapeFactory.getShape(ShapeType.CIRCULO, new Double[]{2.0});
        double resultado = circulo.calcularArea();
        double esperado = 12.566;
        verificarResultado("Círculo", resultado, esperado);
    }

    private static void testCalcularAreaTriangulo() {
        Calculable triangulo = ShapeFactory.getShape(ShapeType.TRIANGULO, new Double[]{4.0, 6.0});
        double resultado = triangulo.calcularArea();
        double esperado = 12.0;
        verificarResultado("Triângulo", resultado, esperado);
    }

    private static void testCalcularAreaParalelograma() {
        Calculable paralelograma = ShapeFactory.getShape(ShapeType.PARALELOGRAMA, new Double[]{5.0, 8.0});
        double resultado = paralelograma.calcularArea();
        double esperado = 40.0;
        verificarResultado("Paralelograma", resultado, esperado);
    }

    private static void testCalcularAreaTrapezio() {
        Calculable trapezio = ShapeFactory.getShape(ShapeType.TRAPEZIO, new Double[]{3.0, 5.0, 4.0});
        double resultado = trapezio.calcularArea();
        double esperado = 16.0;
        verificarResultado("Trapézio", resultado, esperado);
    }

    private static void testCalcularAreaHexagono() {
        Calculable hexagono = ShapeFactory.getShape(ShapeType.HEXAGONO, new Double[]{4.0});
        double resultado = hexagono.calcularArea();
        double esperado = 41.569;
        verificarResultado("Hexágono", resultado, esperado);
    }

    private static void testCalcularAreaLosango() {
        Calculable losango = ShapeFactory.getShape(ShapeType.LOSANGO, new Double[]{6.0, 8.0});
        double resultado = losango.calcularArea();
        double esperado = 24.0;
        verificarResultado("Losango", resultado, esperado);
    }

    private static void testCalcularAreaCubo() {
        Calculable cubo = ShapeFactory.getShape(ShapeType.CUBO, new Double[]{3.0});
        double resultado = cubo.calcularArea();
        double esperado = 54.0;
        verificarResultado("Cubo", resultado, esperado);
    }

    private static void verificarResultado(String nomeFigura, double resultado, double esperado) {
        if (resultado == esperado) {
            System.out.println(nomeFigura + " - Teste Passou!");
        } else {
            System.out.println(nomeFigura + " - Teste Falhou. Resultado esperado: " + esperado + ", Resultado obtido: " + resultado);
        }
    }

    public static void testarCalculoArea(Calculable figura) {
        double resultado = figura.calcularArea();
        System.out.println("Área calculada: " + resultado);
    }
}
