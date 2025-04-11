package javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria;

public class Punto {
    public double x, y;
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
        this(0, 0);
    }

    @Override
    public String toString() {
        return x + "; " + y;
    }
}

/*
Clase Punto:
◦ x,y: propiedades públicas. Simplemente guarda dos reales que indican la
posición de un punto en dos dimensiones. Sin get ni set. (ok)
◦ Dispone de dos constructores: Uno con parámetros que inicializa las dos
coordenadas y otro sin parámetros que inicializa a (0,0) llamando al
anterior.(ok)
◦ Sobreescribe toString para que devuelva las coordenadas entre paréntesis
separadas por punto y coma y un decimal (por ejemplo (3.0; 6.2))
*/