package javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria;

import javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.interfaz.Libreria;

public class Poligono extends Figura{
    public Punto[] listaDePuntos;

    public Poligono(String nombre, Punto origenPunto, int tamañoArray){
        listaDePuntos = new Punto[tamañoArray];
        setNombre(nombre);
        setOrigen(new Punto(0, 0));
        for (int i = 0; i < listaDePuntos.length; i++) {
            listaDePuntos[i] = new Punto(Math.random(), Math.random());
        }
    }

    public Poligono(){
        this("Triangulo", new Punto(0,0),  3);
        new Punto(0, 0);
        new Punto(1, 1);
        new Punto(1, 0);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        double puntoEjeX;
        double puntoEjeY;
        for (int i = 0; i < listaDePuntos.length; i++) {
            System.out.print("Introduce el punto del eje X: ");
            puntoEjeX = Libreria.pedirReal();
            System.out.print("Introduce el punto del eje Y: ");
            puntoEjeY = Libreria.pedirReal();
            listaDePuntos[i] = new Punto(puntoEjeX, puntoEjeY);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        for (Punto punto : listaDePuntos) {
            System.out.println(punto.toString());
        }
    }
}

// • Amplía pedirDatos y mostrarDatos mediante sobreescritura. No es necesario
// realizar ninguna comprobación sobre los puntos (da igual que estén
// repetidos, en línea…).