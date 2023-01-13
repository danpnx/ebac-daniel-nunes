package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("> Calcule a média de quatro números" + "\n");

        System.out.print("Digite o primeiro número: ");
        float first = Float.parseFloat(scan.nextLine());

        System.out.print("Digite o segundo número: ");
        float second = Float.parseFloat(scan.nextLine());

        System.out.print("Digite o terceiro número: ");
        float third = Float.parseFloat(scan.nextLine());

        System.out.print("Digite o quarto número: ");
        float fourth = Float.parseFloat(scan.nextLine());

        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("O resultado da média entre ")
                .append(first + ", " + second + ", " + third + " e " + fourth)
                .append(" é ... \t").append(Media.media(first, second, third, fourth));

        System.out.println(sb.toString());
    }
}