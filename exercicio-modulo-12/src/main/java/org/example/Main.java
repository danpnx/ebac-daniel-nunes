package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        exercicioUm(scan);
        exercicioDois(scan);
    }

    private static void exercicioUm(Scanner scan) {
        System.out.println("--------------------------------- EXERCICIO UM");
        System.out.println(
                "Digite os nomes separados por vírgula e espaço. \n" +
                "Ex: Albert Einstein, Ada Lovelace, Marie Curie"
        );
        System.out.print("> ");
        String strNomes = scan.nextLine();
        System.out.println();

        String[] arrNomes = strNomes.split(", ");
        Arrays.stream(arrNomes).forEach(System.out::println);
    }

    private static void exercicioDois(Scanner scan) {
        System.out.println("\n--------------------------------- EXERCICIO DOIS");
        System.out.println(
                "Digite os nomes e gêneros (M/F) separados por vírgula. \n" +
                "Ex: Albert Einstein - M, Ada Lovelace - F, Marie Curie - F"
        );
        System.out.print("> ");
        String strNomesSexo = scan.nextLine();
        System.out.println();

        String[] arrNomesSexo = strNomesSexo.split(", ");

        List<Pessoa> masculino = Arrays.stream(arrNomesSexo)
                .filter(str -> str.contains("- M"))
                .map(str -> {
                            String[] arr = str.split(" - ");
                            return new Pessoa(arr[0], Genero.M);
                        }
                ).toList();

        List<Pessoa> feminino = Arrays.stream(arrNomesSexo)
                .filter(str -> str.contains("- F"))
                .map(str -> {
                            String[] arr = str.split(" - ");
                            return new Pessoa(arr[0], Genero.F);
                        }
                ).toList();

        System.out.println("\t Grupo de pessoas do sexo masculino");
        masculino.forEach(System.out::println);

        System.out.println();

        System.out.println("\t Grupo de pessoas do sexo feminino");
        feminino.forEach(System.out::println);
    }
}