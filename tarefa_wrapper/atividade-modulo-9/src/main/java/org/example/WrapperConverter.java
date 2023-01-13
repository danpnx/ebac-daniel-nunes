package org.example;

import java.util.Scanner;

public class WrapperConverter {
    public static Integer intWrapper(Scanner scan) {
        System.out.print("Digite o valor do número inteiro: ");
        int valor = scan.nextInt();

        System.out.println(
                "\n" +
                "Retornando [" + valor + "] do tipo primitivo para o tipo wrapper " + Integer.class
        );

        return valor;
    }

    public static Long longWrapper(Scanner scan) {
        System.out.print("Digite o valor do número inteiro do tipo long: ");
        long valor = scan.nextLong();

        System.out.println(
                "\n" +
                        "Retornando [" + valor + "] do tipo primitivo para o tipo wrapper " + Long.class
        );

        return valor;
    }

    public static Float floatWrapper(Scanner scan) {
        System.out.print("Digite o valor do número do tipo float: ");
        float valor = scan.nextFloat();

        System.out.println(
                "\n" +
                        "Retornando [" + valor + "] do tipo primitivo para o tipo wrapper " + Float.class
        );

        return valor;
    }

    public static Double doubleWrapper(Scanner scan) {
        System.out.print("Digite o valor do número do tipo double: ");
        double valor = scan.nextDouble();

        System.out.println(
                "\n" +
                        "Retornando [" + valor + "] do tipo primitivo para o tipo wrapper " + Double.class
        );

        return valor;
    }

    public static Boolean booleanWrapper(Scanner scan) {
        System.out.print("Digite o estado do booleano: ");
        boolean valor = scan.nextBoolean();

        System.out.println(
                "\n" +
                        "Retornando [" + valor + "] do tipo primitivo para o tipo wrapper " + Boolean.class
        );

        return valor;
    }

    public static Character charWrapper(Scanner scan) {
        System.out.print("Digite um caractere: ");
        char valor = scan.next().charAt(0);

        System.out.println(
                "\n" +
                        "Retornando [" + valor + "] do tipo primitivo para o tipo wrapper " + Character.class
        );

        return valor;
    }
}
