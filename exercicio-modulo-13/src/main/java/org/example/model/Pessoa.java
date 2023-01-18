package org.example.model;

public abstract class Pessoa {
    private final String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void pagarImposto();
}
