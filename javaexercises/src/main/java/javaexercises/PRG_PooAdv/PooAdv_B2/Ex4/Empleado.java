package javaexercises.PRG_PooAdv.PooAdv_B2.Ex4;

public class Empleado extends Persona {
    private double salarioAnual;
    private double irpf;

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
        if (salarioAnual < 6000) {
            irpf = 7.5;
        } else if (salarioAnual >= 6000 && salarioAnual <= 30000) {
            irpf = 15;
        } else if (salarioAnual > 30000) {
            irpf = 20;
        }
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public double getIrpf() {
        return irpf;
    }

    
    public Empleado(String apellidos, String nombre, int edad, String dni, double salarioAnual) {
        super(nombre, apellidos, edad, dni);
        setSalarioAnual(salarioAnual);
    }
    
    public Empleado() {
        this("", "", 20, "", 0);
        setSalarioAnual(0);
        setIrpf(irpf);
    }

    double irpf() {
        return (getSalarioAnual() * getIrpf() / 100);
    }

    @Override
    String firmaMail() {
        return String.format("Nombre: %s, Apellidos: %s", getNombre(), getApellido());
    }
}
