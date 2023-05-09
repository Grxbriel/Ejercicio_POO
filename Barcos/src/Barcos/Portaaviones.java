package Barcos;

public class Portaaviones extends Barco {
    private int numeroAviones;
    private int numeroMarinos;

    public Portaaviones(int metrosEslora) {
        super(metrosEslora);
        numeroAviones = 0;
        numeroMarinos = 0;
    }
    
    
    
    //Del barco portaaviones se desea almacenar el número de aviones y el número de
    //marinos. También queremos los métodos get y set de los atributos
    //correspondientes, ¿Son realmente necesarios? ¿Se utilizan en algún momento?
    //Explícalo con tus propias palabras.
    
    //Si bien estos métodos no son estrictamente necesarios, pueden ser 
    //útiles en caso de que se quiera modificar o consultar estos atributos desde fuera de la clase.

    public int getNumeroAviones() {
        return numeroAviones;
    }

    public void setNumeroAviones(int numeroAviones) {
        this.numeroAviones = numeroAviones;
    }

    public int getNumeroMarinos() {
        return numeroMarinos;
    }

    public void setNumeroMarinos(int numeroMarinos) {
        this.numeroMarinos = numeroMarinos;
    }
}
