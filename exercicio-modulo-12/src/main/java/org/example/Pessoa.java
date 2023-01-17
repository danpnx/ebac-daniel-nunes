package org.example;

public final class Pessoa {
    private String nome;
    private Genero genero;

    public Pessoa(String nome, Genero genero) {
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "nome = '" + nome + '\'' +
                ", genero = " + genero.getDescricao() +
                '}';
    }
}
