package javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria;

import javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.interfaz.Libreria;

public class Linea extends Figura {
    private Punto puntoFinal;

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        this.puntoFinal = new Punto(Libreria.pedirReal(), Libreria.pedirReal());
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Punto final: " + getPuntoFinal());
    }

    public Linea(Punto puntoOrigen, Punto puntoFinal) {
        super(puntoOrigen, "aaa");
        setPuntoFinal(puntoFinal);
    }

    public Linea() {
        this(new Punto(0, 0),new Punto(1,1));
    }
}

// ◦ Tendrá un constructor con dos puntos como parámetro. Inicializa el origen
// con el primer punto y el nombre a “linea” llamando al padre y con el
// segundo punto inicializa puntoFinal.
// ◦ Un constructor sobrecargado sin parámetros que llama al primero con
// origen (0,0) y punto final (1,1).