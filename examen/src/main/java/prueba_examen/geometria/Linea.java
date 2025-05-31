package prueba_examen.geometria;

import java.util.Scanner;

import prueba_examen.interfaz.Libreria;

public class Linea extends Figura {
    private Punto puntoFinal;

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    public Linea(Punto puntoOrigen, Punto puntoFinal) {
        super(puntoOrigen, "Linea");
        setPuntoFinal(puntoFinal);
    }

    public Linea(){
        this(new Punto(0,0), new Punto(1,1));
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el punto final: ");
        setPuntoFinal(new Punto(Libreria.pedirReales(), Libreria.pedirReales()));
        sc.close();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Punto Final: %s", getPuntoFinal());
    }
}
