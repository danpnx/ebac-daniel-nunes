package org.example;

import java.util.Scanner;

import static org.example.WrapperConverter.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("> WRAPPER CONVERTER");
        System.out.println("Escolha o tipo de dado que deseja converter para o tipo wrapper");
        System.out.println("\t" + "1. int");
        System.out.println("\t" + "2. long");
        System.out.println("\t" + "3. float");
        System.out.println("\t" + "4. double");
        System.out.println("\t" + "5. boolean");
        System.out.println("\t" + "6. char");
        System.out.print("\n\t" + "Digite a opção desejada: ");
        String escolha = scan.nextLine();

        switch (escolha) {
            case "1" -> System.out.println("\n" + "Valor = " + intWrapper(scan));
            case "2" -> System.out.println("\n" + "Valor = " + longWrapper(scan));
            case "3" -> System.out.println("\n" + "Valor = " + floatWrapper(scan));
            case "4" -> System.out.println("\n" + "Valor = " + doubleWrapper(scan));
            case "5" -> System.out.println("\n" + "Valor = " + booleanWrapper(scan));
            case "6" -> System.out.println("\n" + "Valor = " + charWrapper(scan));
            default -> System.out.println("Opção inválida. Encerrando o programa...");
        }

    }
}