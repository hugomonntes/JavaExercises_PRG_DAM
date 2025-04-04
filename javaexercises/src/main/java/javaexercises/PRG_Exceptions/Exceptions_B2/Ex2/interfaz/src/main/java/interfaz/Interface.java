package javaexercises.PRG_Exceptions.Exceptions_B2.Ex2.interfaz.src.main.java.interfaz;

import java.util.Scanner;

public class Interface {
    @SuppressWarnings("resource")
    public void mostrarDatos() {
        Scanner sc = new Scanner(System.in);
        String opcion = "";
        boolean isChecked;
        do {
            isChecked = true;
            try {
                System.out.print("Escoge una opción (E (Entero) / R (Real): ");
                opcion = sc.nextLine().toLowerCase();
                if (opcion != "e" || opcion != "r") {
                    throw new IllegalCharacterException();
                }
            } catch (IllegalCharacterException e) {
                System.out.println("Error! Introduce E (Entero) o R (Real)");
                isChecked = false;
                sc.nextLine();
            }
            if (opcion.equals("e")) {
                System.out.println(Libreria.pedirEntero());
            } else  {
                System.out.println(Libreria.pedirReal());
            }
        } while (!isChecked);
        sc.close();
    }
}