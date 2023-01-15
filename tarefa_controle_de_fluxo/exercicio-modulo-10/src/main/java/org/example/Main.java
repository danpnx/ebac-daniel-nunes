package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double somaNotas;
        double media;
        Scanner scan = new Scanner(System.in);

        System.out.println("> Calculadora de média de notas" + "\n");

        System.out.println("Registre as notas");
        for(int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "a. Nota: ");
            notas[i] = scan.nextDouble();
        }

        somaNotas = Arrays.stream(notas).sum();
        media = somaNotas/4;

        if(media >= 7.0) {
            System.out.printf("""
                    O aluno aprovado!
                    \t- Média: %.2f
                    """, media);
        } else if(media >= 5.0) {
            System.out.printf("""
                    O aluno está de recuperação
                    \t- Média: %.2f
                    """, media);
        } else {
            System.out.printf("""
                    O aluno foi reprovado!
                    \t- Média: %.2f
                    """, media);
        }
    }
}