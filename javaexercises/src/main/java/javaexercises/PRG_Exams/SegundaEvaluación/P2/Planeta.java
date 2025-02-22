package javaexercises.PRG_Exams.SegundaEvaluación.P2;

public class Planeta extends Astro { // Herencia de la clase Astro
    public boolean habitabilidad;

    public Planeta(String nombre, double radio, boolean habitabilidad){
        super("", 1.3);
        setNombre(nombre);
        this.radio = radio;
        this.habitabilidad = habitabilidad;
    }

    public Planeta(){
        this("", 0, false);
    }
}

/*
Sobreescribe muestraDatos para que muestre los de la clase padre llamándola y luego mostrando la propiedad habitabilidad. *NO SE HACERLO*
*/