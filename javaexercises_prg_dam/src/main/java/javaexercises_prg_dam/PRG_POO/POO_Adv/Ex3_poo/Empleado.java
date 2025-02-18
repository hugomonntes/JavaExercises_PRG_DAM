package javaexercises_prg_dam.PRG_POO.POO_Adv.Ex3_poo;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private double salarioAnual;
    private double irpf;

    // #region SET & GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
        if (salarioAnual < 6000) {
            irpf = 7.5;   
        } else if (salarioAnual >= 6000 && salarioAnual < 30000) {
            irpf = 15;
        } else {
            irpf = 20;
        }
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public double getIrpf() { 
        return irpf;
    }
    //#endregion
    //#region CONSTRUCTORES
    public Empleado(){
        nombre = "";
        apellido = "";
        edad = 0;
        dni = "";
        salarioAnual = 0;
        irpf = 7.5;
    }

    public Empleado(String nombre, String apellido, int edad, String dni, double salarioAnual) { //IRPF va sin parametro ya que no tiene set
        setApellido(apellido);
        setNombre(nombre);
        setEdad(edad);
        setDni(dni);
        setSalarioAnual(salarioAnual);
    }
    //#endregion
    //#region MÉTODOS
    public double calcularHacienda(){
        return getSalarioAnual() * (getIrpf() / 100);
    }
    //#endregion
}
