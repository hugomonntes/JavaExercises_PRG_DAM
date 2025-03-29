
package javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {
  public static int pedirEntero() {
    Scanner sc = new Scanner(System.in);
    boolean isChecked;
    int numeroUser = 0;
    do {
      isChecked = true;
      try {
          System.out.print("Introduce un número entero: ");
          numeroUser = sc.nextInt();
          if (numeroUser < 0) { // Preguntar a Curro si es mejor lanzar una excepción o hacer do while hasta que introduzca un número positivo
            throw new IllegalNegativeNumbers();
          }
      } catch (InputMismatchException e) {
        System.out.println("ERROR! Introduce un número entero!");
        isChecked = false;
        sc.nextLine();
      } catch (IllegalNegativeNumbers e) {
        System.out.println("ERROR! Introduce un número positivo!");
        isChecked = false;
        sc.nextLine();
      }
    } while (!isChecked);
    return numeroUser;
  }

  public static void main(String[] args) {
    System.out.println(pedirEntero());
  }
}

/*
 * Clase Librería con las funciones (robustas ante excepciones):
 * ◦ pedirEntero(): Pide un número entero al usuario, si es algo distinto de un
 * entero repite la petición. Finalmente devuelve el número que introdujo el
 * usuario.
 * ◦ pedirReal(): Similar a pedirEntero() pero para pedir números reales.
 * ◦ Cada vez que necesites pedir un dato entero o real en el resto del
 * ejercicio usa estas funciones.
 */