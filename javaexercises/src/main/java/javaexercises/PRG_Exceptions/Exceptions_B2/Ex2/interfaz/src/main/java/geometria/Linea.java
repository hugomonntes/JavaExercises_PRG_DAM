package javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.geometria;

import java.util.Scanner;

import javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz.Interface;

public class Linea extends Figura {
    private int puntoFinal;

    public void setPuntoFinal(int puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public int getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
    }
}

// Hereda de Figura y se le añade la propiedad privada con set/get
// puntoFinal.
// ◦ Sobreescribe el método pedirDatos y mostrarDatos llamando a los de la
// clase padre y completándolos.
// ◦ Tendrá un constructor con dos puntos como parámetro. Inicializa el origen
// con el primer punto y el nombre a “linea” llamando al padre y con el
// segundo punto inicializa puntoFinal.
// ◦ Un constructor sobrecargado sin parámetros que llama al primero con
// origen (0,0) y punto final (1,1).