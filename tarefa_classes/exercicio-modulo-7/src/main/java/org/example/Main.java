package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5, 4, 70, 2020);
        StringBuilder sb = new StringBuilder();
        sb.append("> INFORMAÇÕES GERAIS");
        sb.append("\n\t");
        sb.append("Ano de fabricação: ");
        sb.append(car.getANO_FABRICACAO());
        sb.append("\n\t");
        sb.append("Capacidade de gasolina: ");
        sb.append(car.getCAPACIDADE_GASOLINA());
        sb.append("\n\t");
        sb.append("Quantidade de portas: ");
        sb.append(car.getQUANTIDADE_PORTAS());
        sb.append("Quantidade de pneus: ");
        sb.append(car.getQUANTIDADE_PNEUS());
        sb.append("\n");

        System.out.println(sb.toString());

        if(car.isCarroLigado()) car.desligarCarro();
        else car.ligarCarro();
    }
}