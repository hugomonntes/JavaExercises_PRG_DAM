package javaexercises.PRG_PooAdv.PooAdv_B2.Ex5;

public class Astro {
    private String nombre;
    private double radio;

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre(char charSeparador) {
        String nombreFormateado = "";
        for (int i = 0; i < nombre.length(); i++) {
            nombreFormateado += nombre.charAt(i);
            if (i != nombre.length() - 1) {
                nombreFormateado += charSeparador;
            }
        }
        return nombreFormateado;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new RadioNegativoException();
        } else {
            this.radio = radio;
        }    
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public boolean equals(Object obj) { // TODO CORREGIR
        if (this == obj || obj != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Radio: %.2f", getNombre(), getRadio());
    }
}

// • Sobreescribe equals de forma que se considera que dos astros son iguales si
// son iguales sus nombres y además son de la misma clase.