package javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.geometria;

import java.util.Scanner;

import javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz.IllegalNegativeNumbers;
import javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz.InterfazUsuario;

public class Linea extends Figura {
    private int puntoFinal;

    public void setPuntoFinal(int puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public int getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce el punto final: ");
            setPuntoFinal(sc.nextInt());
        } catch (IllegalNegativeNumbers negativeNumbers) {
            System.out.println("ERROR! Introduce un dato numérico positivo!");
        } catch (NumberFormatException notNumber) {
            System.out.println("ERROR! Introduce un dato numérico!");
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Punto final: " + getPuntoFinal());
    }

    public Linea(int firstPoint, int secondPoint) {
        // setOrigen(firstPoint);
        setNombre("Linea");
        setPuntoFinal(secondPoint);// secondPoint ; // FIXME Revisar especificación
    }

    public Linea() { // FIXME Revisar especificación
        this(0, 0);
        setPuntoFinal(1);
    }
}

// ◦ Tendrá un constructor con dos puntos como parámetro. Inicializa el origen
// con el primer punto y el nombre a “linea” llamando al padre y con el
// segundo punto inicializa puntoFinal.
// ◦ Un constructor sobrecargado sin parámetros que llama al primero con
// origen (0,0) y punto final (1,1).