package javaexercises.PRG_Exceptions;

import java.util.Scanner;

public class Ex3 {
    public static void pedirDatoUser(String mensajeUser, int rangoMínimo, int rangoMáximo) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un mensaje: ");
        mensajeUser = sc.nextLine();
        System.out.println("Introduce el rango mínimo: ");
        rangoMínimo = sc.nextInt();
        System.out.println("Introduce el rango máximo: ");
        rangoMáximo = sc.nextInt();
        pedirDatoUser(mensajeUser, rangoMínimo, rangoMáximo);
        sc.close();
    }

    public static void main(String[] args) {
    }
}

/*
 * 3. Realiza una función para pedir un número entero al usuario en cierto rango
 * de
 * forma robusta. Los parámetros serán un mensaje previo a la petición del dato
 * así
 * como el rango que se usará para pedir el dato.
 * 
 * Si el rango está mal (es decir debe haber al menos 2 valores entre el límite
 * inferior
 * y el superior), la cadena está vacía o es nula la función lanzará
 * IllegalArgumentException (Usa throw).
 * 
 * Si está todo correcto hará un bucle en el que pida un dato entero al usuario.
 * Si ese
 * dato no está en el rango o no es un número (compruébalo con try/catch) vuelve
 * a
 * pedir el dato informando del error al usuario.
 * Consejo: Crea una función similar para reales y mételas ambas en una librería
 * instalada como proyecto maven. Te servirá par el resto de ejercicios. Fíjate
 * que te
 * hubiera valido para el ejercicio 1.
 */