package edu.fatec.lp2.exercicio2;

import edu.fatec.lp2.exercicio2.model.ItemCompra;
import edu.fatec.lp2.exercicio2.model.ListaCompra;
import edu.fatec.lp2.exercicio2.model.Produto;
import edu.fatec.lp2.exercicio2.model.Supermercado;

public class App {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("Meu Supermercado");

        Produto arroz = new Produto("Arroz", supermercado);
        arroz.setPreco(10.0);
        arroz.setDescontoMaximo(0.1);

        Produto feijao = new Produto("Feijão", supermercado);
        feijao.setPreco(5.0);
        feijao.setDescontoMaximo(0.05);

        ListaCompra listaCompra = new ListaCompra(10);

        ItemCompra itemArroz = new ItemCompra(arroz, 0.1);
        ItemCompra itemFeijao = new ItemCompra(feijao, 0.0);

        listaCompra.incluir(itemArroz);
        listaCompra.incluir(itemFeijao);

        double precoTotal = listaCompra.calcularPreco();

        System.out.println("Preço total da lista de compras: R$ " + precoTotal);
    }
}
