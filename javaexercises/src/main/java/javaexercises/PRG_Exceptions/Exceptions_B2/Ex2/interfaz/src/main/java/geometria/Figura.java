package javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.geometria;

import javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz.Interface;

public class Figura extends Interface {
    private int origen;
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public Figura(int origen, String nombre){
        this.origen = origen;
        this.nombre = nombre;
    }

    public Figura(){
        this(0, "");
    }
}

/*
Clase que contiene como propiedades protegidas con set/get una posición
denominada origen (será un Punto) y un nombre (String). Se requiere set
para nombre de forma que siempre lo guarde en mayúsculas y sin los
espacios extremos.
◦ Un constructor que inicializa las dos propiedades y otro sin parámetros
que inicializa origen a (0,0) y el nombre a “” llamando al primero.
◦ Cumple el interface InterfazUsuario de forma que tendrá también un
método de introducción de datos que pide al usuario el nombre y posición
y otro que muestra ambas propiedades. 
*/