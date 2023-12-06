package main.java.edu.fatec.lp2.exercicio2.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Supermercado {
    private String nome;

    public Supermercado(String nome) {
        this.nome = nome;
    }
}