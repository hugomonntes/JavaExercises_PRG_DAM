package javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria;

import javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.interfaz.Libreria;

public class Circunferencia extends Figura {
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
        super(punto, "Circunferencia");
        setRadio(radio);
    }

    public Circunferencia(){
        this(new Punto(0, 0), 1);
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        System.out.println("Introduce el tamaño del radio: ");
        setRadio(Libreria.pedirReal());
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Radio:" + getRadio());
    }
}

/*
• Hereda de Figura y almacena el radio como propiedad con set/get. Si el radio
es negativo lanzará una excepción IllegalArgumentException.
• Un constructor tiene como parámetros un punto y un radio. Llama al de la
clase padre para inicializar el punto y luego inicializa el radio. 
Un segundo constructor sin parámetros inicializa a centro (0,0) y radio 1 llamando al
primer constructor.
• Sobreescribe y amplía mostrarDatos y pedirDatos. 
*/