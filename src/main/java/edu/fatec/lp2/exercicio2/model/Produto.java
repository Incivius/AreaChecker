
package main.java.edu.fatec.lp2.exercicio2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto implements Calculavel {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(String nome, Supermercado supermercado) {
        this.nome = nome;
        this.supermercado = supermercado;
    }

    @Override
    public double calcularPreco() {
        return preco * (1 - descontoMaximo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", unidade='" + unidade + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", descontoMaximo=" + descontoMaximo +
                ", supermercado=" + supermercado.getNome() +
                '}';
    }
}
