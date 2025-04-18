package javaexercises.PRG_PooAdv.PooAdv_B2.Ex4;

public class Empleado extends Persona{
    @Override
    String firmaMail() {
        return String.format("Nombre: %s, Apellidos: %s", getNombre(), getApellido());
    }
}
