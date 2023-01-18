package org.example.model;

public final class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public void contratarFuncionario() {
        System.out.println("A empresa " + this.getNome() + " está contratando!!!");
    }

    @Override
    public void pagarImposto() {
        System.out.println("A empresa " + this.getNome() + " está pagando imposto!");
    }

    @Override
    public String toString() {
        return "PessoaJuridica {" +
                "nome = '" + this.getNome() + '\'' +
                "cnpj = '" + cnpj + '\'' +
                '}';
    }
}
