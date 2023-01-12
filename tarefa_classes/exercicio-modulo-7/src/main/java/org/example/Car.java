package org.example;

/**
 * @author danpnx
 * 
 * @version 1.0
 * 
 * @since 12/01/2023
 * 
 * @{@link https://github.com/danpnx}
 */
public class Car {
    private final int QUANTIDADE_PNEUS;
    private final int QUANTIDADE_PORTAS;
    private final float CAPACIDADE_GASOLINA;
    private final int ANO_FABRICACAO;

    public Car(
            int QUANTIDADE_PNEUS,
            int QUANTIDADE_PORTAS,
            float CAPACIDADE_GASOLINA,
            int ANO_FABRICACAO
    ) {
        this.QUANTIDADE_PNEUS = QUANTIDADE_PNEUS;
        this.QUANTIDADE_PORTAS = QUANTIDADE_PORTAS;
        this.CAPACIDADE_GASOLINA = CAPACIDADE_GASOLINA;
        this.ANO_FABRICACAO = ANO_FABRICACAO;
    }

    private boolean carroLigado = false;

    public int getQUANTIDADE_PNEUS() {
        return QUANTIDADE_PNEUS;
    }

    public int getQUANTIDADE_PORTAS() {
        return QUANTIDADE_PORTAS;
    }

    public float getCAPACIDADE_GASOLINA() {
        return CAPACIDADE_GASOLINA;
    }

    public int getANO_FABRICACAO() {
        return ANO_FABRICACAO;
    }

    public boolean isCarroLigado() {
        return carroLigado;
    }

    public void ligarCarro() {
        System.out.println("Carro ligado!");
        carroLigado = true;
    }

    public void desligarCarro() {
        System.out.println("Carro desligado!");
        carroLigado = false;
    }

    public void trocarPneu() {
        System.out.println("O pneu foi trocado!");
    }
}
