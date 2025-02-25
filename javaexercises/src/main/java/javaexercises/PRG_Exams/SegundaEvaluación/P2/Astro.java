package javaexercises.PRG_Exams.SegundaEvaluación.P2;

public class Astro {
    private String nombre;
    public double radio;

    public void setNombre(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre(char caracterSeparacion) { // Devolver un string separando cada char por el caracter
        String cadenaFinal = "";
        for (int i = 0; i < nombre.length(); i++) {
            cadenaFinal += nombre.charAt(i);
            if (i < nombre.length() - 1) {
                cadenaFinal += caracterSeparacion;
            }
        }
        return cadenaFinal;
    }

    //CONSTRUCTOR
    public Astro(String nombre, double radio){
        setNombre(nombre);
        this.radio = radio;
    }

    //MÉTODOS
    public void muestraDatos(){
        System.out.println(getNombre());
        System.out.printf("%.2f \n", radio);
    }
}