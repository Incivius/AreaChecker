package test.java.edu;

import org.junit.Test;
import static org.junit.Assert.*;

public class TesteSupermercado {

    @Test
    public void testCalcularPrecoComDesconto() {
        Supermercado supermercado = new Supermercado("Meu Supermercado");
        Produto produto = new Produto("Arroz", supermercado);
        produto.setPreco(10.0);
        produto.setDescontoMaximo(0.1);

        double precoCalculado = produto.calcularPreco();

        assertEquals(9.0, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoSemDesconto() {
        Supermercado supermercado = new Supermercado("Meu Supermercado");
        Produto produto = new Produto("Feijão", supermercado);
        produto.setPreco(5.0);
        produto.setDescontoMaximo(0.0);

        double precoCalculado = produto.calcularPreco();

        assertEquals(5.0, precoCalculado, 0.01);
    }

    @Test
    public void testCalcularPrecoComDescontoMaximo() {
        Supermercado supermercado = new Supermercado("Meu Supermercado");
        Produto produto = new Produto("Macarrão", supermercado);
        produto.setPreco(3.0);
        produto.setDescontoMaximo(0.5);

        double precoCalculado = produto.calcularPreco();

        assertEquals(1.5, precoCalculado, 0.01);
    }

}
