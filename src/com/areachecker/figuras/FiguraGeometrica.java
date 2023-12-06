package com.areachecker.figuras;

public interface FiguraGeometrica extends Calculable {
    
    double getLado();
    void setLado(double lado);

    double getComprimento();
    void setComprimento(double comprimento);
    double getLargura();
    void setLargura(double largura);

    double getRaio();
    void setRaio(double raio);

    double getBase();
    void setBase(double base);
    double getAltura();
    void setAltura(double altura);

    double getBaseParalelogramo();
    void setBaseParalelogramo(double base);
    double getAlturaParalelogramo();
    void setAlturaParalelogramo(double altura);

    double getBaseMaiorTrapezio();
    void setBaseMaiorTrapezio(double baseMaior);
    double getBaseMenorTrapezio();
    void setBaseMenorTrapezio(double baseMenor);
    double getAlturaTrapezio();
    void setAlturaTrapezio(double altura);

    double getLadoHexagono();
    void setLadoHexagono(double lado);

    double getDiagonalMaiorLosango();
    void setDiagonalMaiorLosango(double diagonalMaior);
    double getDiagonalMenorLosango();
    void setDiagonalMenorLosango(double diagonalMenor);

    double getArestaCubo();
    void setArestaCubo(double aresta);
}
