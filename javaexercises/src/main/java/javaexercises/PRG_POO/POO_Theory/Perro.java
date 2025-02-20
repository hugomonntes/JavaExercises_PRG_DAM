package javaexercises.PRG_POO.POO_Theory;
public class Perro { // Planos a partir de ellos puedes construir objetos tipo Perro
    public String raza;
    public String nombre;
    private int edad;
    int a;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int a) {
        edad = this.a;
    }

    public boolean setTemperatura(int fiebre){
        return fiebre > 39 ? true : false;
    }

    public Perro (String nombre, String raza, int edad, double temperatura){
        this.nombre = nombre;
        this.raza = raza;
        this.setEdad(edad);
    }
}