package org.example;

public enum Genero {
    M("Masculino"),
    F("Feminino");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    private Genero(String descricao) {
        this.descricao = descricao;
    }
}
