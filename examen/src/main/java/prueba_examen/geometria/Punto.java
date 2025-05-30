package prueba_examen.geometria;

public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this(0, 0);
    }

    @Override
    public String toString() {
        return String.format("%1.f; 1.f", x, y);
    }
}
