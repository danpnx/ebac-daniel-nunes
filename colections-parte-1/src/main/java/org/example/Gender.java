package org.example;

public enum Gender {
    M("Masculino"),
    F("Feminino");

    private String description;

    public String getDescription() {
        return description;
    }

    Gender(String description) {
        this.description = description;
    }
}
