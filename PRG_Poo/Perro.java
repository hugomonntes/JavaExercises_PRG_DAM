public class Perro { // Planos a partir de ellos puedes construir objetos tipo Perro
    public String raza;
    public String nombre;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int a) {
        edad = a;
    }

    public boolean setTemperatura(int fiebre){
        return fiebre > 39 ? true : false;
    }
}
