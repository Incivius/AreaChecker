package com.areachecker.factory;

import com.areachecker.figuras.FiguraGeometrica;

public class FiguraFactoryConcreta implements FiguraFactory {
    private FiguraGeometrica figura;

    public FiguraFactoryConcreta(FiguraGeometrica figura) {
        this.figura = figura;
    }

    @Override
    public FiguraGeometrica criarFigura() {
        return figura;
    }
}
