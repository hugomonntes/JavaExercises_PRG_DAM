package javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.geometria;

public class Punto {
    public double x, y;
    
    public Punto(){
        this(0, 0);
    }

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + "; " + y;
    }
}

/*
Sobreescribe toString para que devuelva las coordenadas entre paréntesis
separadas por punto y coma y un decimal (por ejemplo (3.0; 6.2))
*/