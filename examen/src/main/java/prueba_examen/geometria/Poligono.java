package prueba_examen.geometria;

import prueba_examen.interfaz.Libreria;

public class Poligono extends Figura{
    public Punto[] listaPuntos;

    public Poligono(String nombre, Punto origen, int cantidadPuntos){
        setNombre(nombre);
        setOrigen(origen);
        int numeroAleatorio = (int) (Math.random()*10);
        listaPuntos = new Punto[cantidadPuntos];
        for (int i = 0; i < listaPuntos.length; i++) {
            listaPuntos[i] = new Punto(numeroAleatorio, numeroAleatorio);
        }
    }

    public Poligono(){
        this("Triangulo", new Punto(0,0), 3);
        listaPuntos[0] = new Punto(0, 0);
        listaPuntos[1] = new Punto(1, 1);
        listaPuntos[2] = new Punto(1, 0);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        for (int i = 0; i < listaPuntos.length; i++) {
            System.out.print("Introduce Coordenadas X:");
            double x = Libreria.pedirReales();
            System.out.print("Introduce Coordenadas Y:");
            double y = Libreria.pedirReales();
            listaPuntos[i] = new Punto(x, y);
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        for (Punto punto : listaPuntos) {
            System.out.println(punto.toString());
        }
    }
}
