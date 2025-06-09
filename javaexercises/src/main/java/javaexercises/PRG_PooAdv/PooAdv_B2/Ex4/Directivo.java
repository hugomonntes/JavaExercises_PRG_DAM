package javaexercises.PRG_PooAdv.PooAdv_B2.Ex4;

public class Directivo extends Persona {
    private String departamento;
    private double porcentajeBeneficios;

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento.toUpperCase();
    }

    public void setPorcentajeBeneficios(double porcentajeBeneficios) {
        this.porcentajeBeneficios = porcentajeBeneficios;
    }

    public double getPorcentajeBeneficios() {
        if (porcentajeBeneficios <= 100 && porcentajeBeneficios >= 0) {
            return porcentajeBeneficios;
        } else {
            return 0;
        }
    }

    public Directivo(String nombre, String apellidos, int edad, String dni, String departamento, double porcentajeBeneficios) {
        super(nombre, apellidos, edad, dni);
        setDepartamento(departamento);
        setPorcentajeBeneficios(porcentajeBeneficios);
    }
    
    public Directivo() {
        this("","",20,"","",0);
    }

    @Override
    String firmaMail() {//TODO 
        return "";
    }
}

// Directivo (devolviendo nombre apellidos y departamento
// rodeado de asteriscos).