package main.java.edu.fatec.lp2.exercicio2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemCompra implements Calculavel {
    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, double desconto) {
        this.produto = produto;
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        return produto.calcularPreco() * quantidade * (1 - desconto);
    }
}
