package Barcos;

public class Barco {
    private int metrosEslora;

    public Barco(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    
    // Todos los barcos tienen un comportamiento en común: los métodos alarma() y
    //mensajeSocorro(), ¿qué implicaciones tiene esa afirmación a hora de construir
    //barco? Explícalo con tus propias palabras.
    
    //Esto implica que cada barco que se cree, 
    //independientemente del tipo, tendrá automáticamente estos dos métodos, 
    //sin tener que definirlos en cada clase.
    
    
    public void alarma() {
        System.out.println("Alarma desde el barco " + getClass().getSimpleName());
    }

    public void mensajeSocorro(String mensaje) {
        alarma();
        System.out.println("Mensaje de socorro: " + mensaje);
    }
    
    
    public static void main(String[] args) {
        Barco barco = new Barco(10);
        barco.alarma();
        barco.mensajeSocorro("Esto es una emergencia!");

        Crucero crucero = new Crucero(50);
        crucero.agregarCama();
        crucero.agregarCama();
        crucero.alarma();
        crucero.mensajeSocorro("Necesitamos ayuda!");

        Portaaviones portaaviones = new Portaaviones(150);
        portaaviones.setNumeroAviones(20);
        portaaviones.setNumeroMarinos(500);
        portaaviones.alarma();
        portaaviones.mensajeSocorro("Mayday, mayday!");

        Pesquero pesquero = new Pesquero(30, 200, 10);
        pesquero.alarma();
        pesquero.mensajeSocorro("Nos estamos hundiendo!");
    }

}
