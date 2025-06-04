package prueba_examen.interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {
    public static int pedirEntero(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean isChecked;
        do {
            try {
                System.out.print("Introduce un número entero:");
                numero = sc.nextInt();
                isChecked = true;
            } catch (InputMismatchException e) {
                isChecked = false;
            }
            sc.nextLine();
        } while (!isChecked);
        return numero;
    }

    public static double pedirReales(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        boolean isChecked;
        do {
            try {
                System.out.print("Introduce un número real:");
                numero = sc.nextDouble();
                isChecked = true;
            } catch (InputMismatchException e) {
                isChecked = false;
            }
            sc.nextLine();
        } while (!isChecked);
        return numero;
    }
}

// pedirEntero(): Pide un número entero al usuario, si es algo distinto de un
// entero repite la petición. Finalmente devuelve el número que introdujo el
// usuario.
// ◦ pedirReal(): Similar a pedirEntero() pero para pedir números reales.
// ◦ Cada vez que necesites pedir un dato entero o real en el resto del
// ejercicio usa estas funciones.