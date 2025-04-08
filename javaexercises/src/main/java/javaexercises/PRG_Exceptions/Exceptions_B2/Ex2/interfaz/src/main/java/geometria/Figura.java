package javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.geometria;

import java.util.Scanner;

import javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz.IllegalNegativeNumbers;
import javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz.Interface;

public class Figura extends Interface {
    private int origen;
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre() {
        return nombre;
    }

    public void setOrigen(int origen) {
        if (origen < 0) {
            throw new IllegalNegativeNumbers();
        } else {
            this.origen = origen;
        }
    }

    public int getOrigen() {
        return origen;
    }

    public Figura(int origen, String nombre) {
        this.origen = origen;
        this.nombre = nombre;
    }

    public Figura() {
        this(0, "");
    }

    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        setNombre(sc.nextLine());
        try {
            System.out.print("Introduce la posición");
            setOrigen(sc.nextInt());
        } catch (IllegalNegativeNumbers e) {
            System.out.println("Introduce un dato numérico positivo");
        } catch (IllegalArgumentException e) {
            System.out.println("Introduce un dato numérico");
        }
    }
}

/*
 * ◦ Cumple el interface InterfazUsuario de forma que tendrá también un
 * método de introducción de datos que pide al usuario el nombre y posición
 * y otro que muestra ambas propiedades.
 */