package org.example;

import org.example.model.PessoaFisica;
import org.example.model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Daniel", "11122233340", 26, 75, 'M');
        PessoaJuridica pj = new PessoaJuridica("Daniel Coporation", "12345678910");

        System.out.println("> PESSOA FÍSICA");
        System.out.println();
        System.out.println("\t" + pf.toString());
        System.out.println();
        pf.pagarImposto();
        pf.respirar();
        pf.andar();
        pf.comer();
        pf.dormir();

        System.out.println();
        System.out.println("> PESSOA JURÍDICA");
        System.out.println();
        System.out.println("\t" + pj.toString());
        System.out.println();
        pj.pagarImposto();
        pj.contratarFuncionario();
    }
}