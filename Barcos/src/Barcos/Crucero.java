package Barcos;

public class Crucero extends Barco {
    private int camasOcupadas;

    public Crucero(int metrosEslora) {
        super(metrosEslora);
        camasOcupadas = 0;
    }

    public void agregarCama() {
        camasOcupadas++;
    }
}
