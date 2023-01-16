package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Pessoa> maleList = new ArrayList<>();
        List<Pessoa> femaleList = new ArrayList<>();
        String genderOption;
        String continueRegistration = "S";

        System.out.println("> LISTA DE GÊNEROS MASCULINO E FEMININO" + "\n");

        do {
            System.out.print("Digite o nome: ");
            String name = scan.next();
            System.out.print("Digite o gênero (M/F): ");
            String gender = scan.next();

            if(gender.equalsIgnoreCase("M")) {
                maleList.add(new Pessoa(name, Gender.M));
            } else if(gender.equalsIgnoreCase("F")) {
                femaleList.add(new Pessoa(name, Gender.F));
            } else {
                System.out.println("Gênero inválido!");
                continue;
            }

            System.out.print("Deseja registrar mais uma pessoa? S/N: ");
            continueRegistration = scan.next();

            if(!continueRegistration.equalsIgnoreCase("S")) {
                continueRegistration = "N";
            }
        } while(continueRegistration.equalsIgnoreCase("S"));

        System.out.println("\n" + "> MALE LIST");
        System.out.println(maleList.toString());
        System.out.println("> FEMALE LIST");
        System.out.println(femaleList.toString());
    }
}