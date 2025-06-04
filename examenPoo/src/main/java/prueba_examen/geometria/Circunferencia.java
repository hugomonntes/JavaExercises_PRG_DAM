package prueba_examen.geometria;

import prueba_examen.interfaz.Libreria;

public class Circunferencia extends Figura{
    private double radio;

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException();
        } else {
            this.radio = radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    public Circunferencia(Punto punto, double radio){
        super(new Punto(0, 0), "");
        setRadio(0);
    }

    public Circunferencia(){
        this(new Punto(0,0), 1);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        System.out.print("Introduce el radio: ");
        setRadio(Libreria.pedirReales());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Radio: %f", getRadio());
    }
}
