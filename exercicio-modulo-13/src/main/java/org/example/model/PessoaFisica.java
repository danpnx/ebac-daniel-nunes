package org.example.model;

public final class PessoaFisica extends Pessoa {
    private String cpf;
    private int idade;
    private int peso;
    private char sexo;

    public PessoaFisica(String nome, String cpf, int idade, int peso, char sexo) {
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public int getPeso() {
        return peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void andar() {
        System.out.println(this.getNome() + " está andando...");
    }

    public void dormir() {
        System.out.println(this.getNome() + " está dormindo ZzZzZzZz");
    }

    public void comer() {
        System.out.println(this.getNome() + " está comendo salada.");
    }

    public void respirar() {
        System.out.println(this.getNome() + " está respirando... (ainda bem!)");
    }

    @Override
    public void pagarImposto() {
        System.out.println(this.getNome() + " está pagando imposto!");
    }

    @Override
    public String toString() {
        return "PessoaFisica {" +
                "nome = '" + this.getNome() + '\'' +
                "cpf = '" + cpf + '\'' +
                ", idade = " + idade +
                ", peso = " + peso +
                ", sexo = " + sexo +
                '}';
    }
}