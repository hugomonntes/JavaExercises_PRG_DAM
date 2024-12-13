package PRG_POO.POO_Adv.Ex3_poo;

import java.util.Scanner;

public class IUEmpleado {
    Scanner sc = new Scanner(System.in);
    Empleado empleado = new Empleado();
    
    public IUEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    //#region MÉTODOS MOSTRAR & PEDIR
    public void mostrar(){
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Salario Anual: " + empleado.getSalarioAnual());
        System.out.println("IRPF: " + empleado.getIrpf());
        // System.out.println("Hacienda: " + empleado.calcularHacienda());
    }

    public void pedir(){
        System.out.print("Introduzca el nombre: ");
        empleado.setNombre(sc.nextLine());
        System.out.print("Introduzca el apellido: ");
        empleado.setApellido(sc.nextLine());
        System.out.print("Introduzca la edad: ");
        empleado.setEdad(sc.nextInt());
        sc.nextLine(); // Salto de línea para INT
        System.out.print("Introduzca el DNI: ");
        empleado.setDni(sc.nextLine());
        System.out.print("Introduzca el salario anual: ");
        empleado.setSalarioAnual(sc.nextDouble());
    }

    // Se sobrecarga el método de mostrar de forma que se le pasa un int que
    // representa a cada campo: 1-Nombre y Apellidos (los dos juntos), 2-edad, 3-
    // DNI, 4-Salario e IRPF (los dos juntos) y 5-Lo que se lleva hacienda.
    // Mostrará solo el dato indicado en el parámetro.
    //#endregion
}
