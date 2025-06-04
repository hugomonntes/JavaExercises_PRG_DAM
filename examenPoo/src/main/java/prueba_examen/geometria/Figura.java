package prueba_examen.geometria;

import java.util.Scanner;

import prueba_examen.interfaz.InterfazUsuario;
import prueba_examen.interfaz.Libreria;

public class Figura implements InterfazUsuario {
    private Punto origen;
    private String nombre;

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre() {
        return nombre;
    }

    public Figura(Punto origen, String nombre) {
        setOrigen(origen);
        setNombre(nombre);
    }

    public Figura() {
        this(new Punto(0, 0), "");
    }

    @SuppressWarnings("resource")
    @Override
    public void pedirDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del punto: ");
        setNombre(sc.nextLine());
        System.out.print("Introduce el eje X del punto: ");
        double x = Libreria.pedirReales();
        double y = Libreria.pedirReales();
        setOrigen(new Punto(x, y));
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Nombre: %s, Origen: %s,", getNombre(), getOrigen());
    }

    // Cumple el interface InterfazUsuario de forma que tendrá también un
    // método de introducción de datos que pide al usuario el nombre y posición
    // y otro que muestra ambas propiedades.
}
