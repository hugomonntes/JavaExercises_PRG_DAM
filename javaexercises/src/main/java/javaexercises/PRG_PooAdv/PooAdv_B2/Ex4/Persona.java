package javaexercises.PRG_PooAdv.PooAdv_B2.Ex4;

abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;

    abstract String firmaMail();

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

    public void setDni(String dniConLetra) {
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";

        dniConLetra = dniConLetra.replace("-", "").toUpperCase();

        if (dniConLetra.length() != 9) {
            throw new DNIException();
        }

        String numeroStr = dniConLetra.substring(0, 8);
        char letra = dniConLetra.charAt(8);

        int numero;
        try { // Compruebo si el numero no es un numero lanza except
            numero = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            throw new DNIException();
        }

        char letraEsperada = letrasDni.charAt(numero % 23);
        if (letra != letraEsperada) {
            throw new DNIException();
        }

        this.dni = dniConLetra;
        System.out.println("DNI válido!");
    }
    // • Si el DNI no es un número válido de 9 dígitos (o no es un número) , o no
    // hay
    // correspondencia entre la letra y el DNI, se lanza una excepción creada por ti
    // denominada DNIExcepcion que hereda de IllegalArgumentException.

    public String getDni() {
        return dni;
    }

    public Persona(String nombre, String apellidos, int edad, String dni) {
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setDni(dni);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Apellidos: %s", getNombre(), getApellido());
    }
}

// 4. Retoma del primer tema de POO las clases Empleado y Directivo y rehazlas
// usando herencia de la siguiente forma:
// Crea una clase abstracta denominada Persona que tenga los elementos comunes
// de Empleado y Directivo.
// Además dispondrá del método abstracto firmaMail. Este método lo
// implementarás luego (no en Persona) en Empleado (devolviendo nombre y
// apellidos del mismo) y en Directivo (devolviendo nombre apellidos y
// departamento
// rodeado de asteriscos).
// Revisa ambas clases de forma que minimices la repetición de código con
// llamadas
// entre constructores.
// Sobreescribe toString() de forma que devuelva nombre y apellidos. Piensa
// donde
// realizar esta función.
// Amplia con la comprobación del DNI en el set correspondiente de la siguiente
// forma:
// • En el set se pasa un numero de dni y la letra. Puede ir sin separación o
// separado con un guión (123456789X o 123456789-X). Debe comprobar si la
// letra corresponde al DNI. El algoritmo es el siguiente:
// ◦ Se coge el n.º y se calcula el resto de dividirlo entre 23.
// Este resultado da un número entre 0 y 22 que corresponde por posición a
// una letra de la siguiente cadena (ojo, no lo puedes meter en un vector):
// “TRWAGMYFPDXBNJZSQVHLCKE”
// • Si el DNI no es un número válido de 9 dígitos (o no es un número) , o no
// hay
// correspondencia entre la letra y el DNI, se lanza una excepción creada por ti
// denominada DNIExcepcion que hereda de IllegalArgumentException.
