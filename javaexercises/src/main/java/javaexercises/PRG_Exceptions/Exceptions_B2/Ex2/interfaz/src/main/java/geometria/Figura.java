package javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.geometria;

import java.util.Scanner;

import javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz.IllegalNegativeNumbers;
import javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz.InterfazUsuario;

public class Figura implements InterfazUsuario {
    private Punto origen;
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public Punto getOrigen() {
        return origen;
    }

    public Figura(Punto origen, String nombre) {
        this.origen = origen;
        this.nombre = nombre;
    }

    public Figura() {
        this(new Punto(0, 0), "");
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        setNombre(sc.nextLine());
        // try {
        //     System.out.print("Introduce la posición");
        //     setOrigen(sc.nextInt());
        // } catch (IllegalNegativeNumbers e) {
        //     System.out.println("Introduce un dato numérico positivo");
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Introduce un dato numérico");
        // }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Posición: " + getOrigen());
    }
}

/*
 * Clase Figura:
 * ◦ Clase que contiene como propiedades protegidas con set/get una posición
 * denominada origen (será un Punto) y un nombre (String). Se requiere set
 * para nombre de forma que siempre lo guarde en mayúsculas y sin los
 * espacios extremos.(ok)
 * ◦ Un constructor que inicializa las dos propiedades y otro sin parámetros
 * que inicializa origen a (0,0) y el nombre a “” llamando al primero.
 * ◦ Cumple el interface InterfazUsuario de forma que tendrá también un
 * método de introducción de datos que pide al usuario el nombre y posición
 * y otro que muestra ambas propiedades.
 */