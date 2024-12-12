package PRG_POO.POO_Adv.Ex3_poo;

public class Directivo {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private String nombreDepartamento;
    private double beneficios;

    // #region SET & GET
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDni() {
        return dni;
    }
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
    public double getBeneficios() {
        return beneficios;
    }
    // #endregion
}
