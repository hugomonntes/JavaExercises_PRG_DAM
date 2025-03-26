package javaexercises.PRG_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void pedirDatoUser(String mensajeUser, int rangoMinimo, int rangoMaximo) {
        if (mensajeUser == null || mensajeUser.equals("") || rangoMinimo > rangoMaximo || rangoMinimo < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isChecked;
        do {
            isChecked = true;
            try {
                System.out.print("Introduce un mensaje: ");
                String mensajeUser = sc.nextLine();
                System.out.print("Introduce el rango mínimo: ");
                int rangoMinimo = sc.nextInt();
                System.out.print("Introduce el rango máximo: ");
                int rangoMaximo = sc.nextInt();
                pedirDatoUser(mensajeUser, rangoMinimo, rangoMaximo);
            } catch (IllegalArgumentException e) { 
                System.out.println("Error! Has introducido algún dato mal.");
                isChecked = false;
            } catch (InputMismatchException e) {
                System.out.println("Has introducido texto en un valor numérico");
                isChecked = false;
            }
            sc.nextLine();
        } while (!isChecked);
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