package org.example;

public class Pessoa {
    private String name;
    private Gender gender;

    public Pessoa(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "name = '" + name + '\'' +
                ", gender = " + gender.getDescription() +
                '}';
    }
}
