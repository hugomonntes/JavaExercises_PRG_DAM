package javaexercises.PRG_PooAdv.PooAdv_B2.Ex4;

public class Directivo extends Persona{
    private String nombreDepartamento;

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    @Override
    String firmaMail() {
        return String.format("Nombre: %s, Apellidos: %s, *%s*", getNombre(), getApellido(), getNombreDepartamento());
    }
}

// Directivo (devolviendo nombre apellidos y departamento
// rodeado de asteriscos).