package main.java.edu.fatec.lp2.exercicio2.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ListaCompra implements Calculavel {
    private List<ItemCompra> itensCompra;
    private int qntdMax;

    public ListaCompra(int qntdMax) {
        this.itensCompra = new ArrayList<>();
        this.qntdMax = qntdMax;
    }

    public void incluir(ItemCompra item) {
        // Implementar lógica para incluir item à lista
        if (itensCompra.size() < qntdMax) {
            itensCompra.add(item);
        } else {
            System.out.println("Lista de compras atingiu o limite máximo de itens.");
        }
    }

    @Override
    public double calcularPreco() {
        // Implementar lógica para calcular o preço total da lista de compras
        double precoTotal = 0;
        for (ItemCompra item : itensCompra) {
            precoTotal += item.calcularPreco();
        }
        return precoTotal;
    }
}