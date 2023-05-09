package Barcos;

public class Pesquero extends Barco {
    private int potencia;
    private int numeroPescadores;

    public Pesquero(int metrosEslora, int potencia, int numeroPescadores) {
        super(metrosEslora);
        this.potencia = potencia;
        this.numeroPescadores = numeroPescadores;
    }
}
