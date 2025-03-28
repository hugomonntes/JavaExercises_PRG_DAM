package javaexercises.PRG_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void pedirDatoUser(String mensajeUser, int rangoMinimo, int rangoMaximo) {
        Scanner sc = new Scanner(System.in);
        int numeroUser;
        if (mensajeUser == null || (rangoMaximo - rangoMinimo < 2) || mensajeUser.equals("")) {
            throw new IllegalArgumentException("Has introducido algún parametro mal");
        } else {
            System.out.println(mensajeUser);
            do {
                try {
                    numeroUser = sc.nextInt();
                    while (numeroUser < rangoMinimo || numeroUser > rangoMaximo) {
                        System.out.printf("Escribe un numero entre %d y %d: ", rangoMinimo, rangoMaximo);
                        numeroUser = sc.nextInt();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Introduce un numero: ");
                    sc.nextLine();
                    numeroUser = 0;
                }

            } while (numeroUser == 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datoMinimo = 0;
        int datoMaximo;
        do {
            try {
                System.out.print("Introduce el rango mínimo: ");
                datoMinimo = sc.nextInt();
                System.out.print("Introduce el rango máximo: ");
                datoMaximo = sc.nextInt();
                System.out.print("Escribe el mensaje: ");
                String mensajeUser = sc.nextLine();
                pedirDatoUser(mensajeUser, datoMinimo, datoMaximo);
            } catch (IllegalArgumentException e) {
                System.out.println("Parametro inválido");
                datoMinimo = 0;
            } catch (InputMismatchException e) {
                System.out.println("Parametro inválido");
                datoMaximo = 0;
            }
        } while (datoMinimo == 0);
    }
}

/*
 * Si está todo correcto hará un bucle en el que pida un dato entero al usuario.
 * Si ese dato no está en el rango o no es un número (compruébalo con try/catch)
 * vuelve
 * a pedir el dato informando del error al usuario.
 * 
 * Consejo: Crea una función similar para reales y mételas ambas en una librería
 * instalada como proyecto maven. Te servirá par el resto de ejercicios. Fíjate
 * que te
 * hubiera valido para el ejercicio 1.
 */