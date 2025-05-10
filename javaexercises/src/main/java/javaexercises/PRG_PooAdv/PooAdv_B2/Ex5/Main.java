package javaexercises.PRG_PooAdv.PooAdv_B2.Ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Astro> coleccionDeAstros = new ArrayList<>();
        int option;
        do {
            System.out.println("1.- Añadir un planeta: ");
            System.out.println("2.-");
            System.out.println("3.-");
            System.out.println("4.-");
            System.out.println("5.- Salir.");
            option = sc.nextInt();
            switch (option) {
                // • Añade Planeta: Pregunta si es gaseoso y pide el nombre y radio. También
                // pregunta cantidad de lunas y se introducirán sus nombres y radios.
                case 1:
                    System.out.print("¿El planeta es gaseoso? (s/n): ");
                    String isGaseosoStr = sc.nextLine().trim().toLowerCase();
                    boolean isGaseoso = isGaseosoStr.equals("s");
                    sc.nextLine();

                    System.out.print("Introduce el nombre del planeta: ");
                    String nombrePlaneta = sc.nextLine();

                    System.out.print("Introduce el radio del planeta: ");
                    double radioPlaneta = sc.nextDouble();

                    System.out.print("¿Cuántas lunas tiene el planeta?: ");
                    int cantidadLunas = sc.nextInt();

                    if (cantidadLunas > 0) {
                        for (int i = 0; i < cantidadLunas; i++) {
                            System.out.print("Introduce el nombre de la luna número " + (i + 1) + ": ");
                            String nombreLuna = sc.nextLine();

                            System.out.print("Introduce el radio de la luna " + (i + 1) + ": ");
                            double radioLuna = sc.nextDouble();
                        }
                    }

                    coleccionDeAstros.add(new Planeta(nombrePlaneta, radioPlaneta, isGaseoso));
                    break;
                case 2:
                    System.out.println(coleccionDeAstros.toString());
                    break;
                case 3:
                    ;
                    break;
                case 4:
                    ;
                    break;
                case 5:
                    ;
                    break;
                default:

                    break;
            }

        } while (option != 5);
    }
}

// c) En el programa principal (Mételo en otra clase y package distintos a las
// clases
// anteriores) se crea una colección de Astros y el siguiente menú:
// • Añade Planeta: Pregunta si es gaseoso y pide el nombre y radio. También
// pregunta cantidad de lunas y se introducirán sus nombres y radios.
// • Añade otro astro: Pide su nombre y radio.
// • Mostrar datos: Muestra toda la colección detectando si es Astro o Planeta
// para mostrar todos sus datos. En el caso de Astro simplemente llama a
// toString() y lo muestra, en el caso de Planetas muestra todos los datos y en
// particular llamando a getNombre con parámetro ‘.’
// • Elimina repetidos. Busca Astros/Planetas iguales (aprovecha el
// equals/indexOf/lastIndexOf ) y elimina todas las apariciones menos la
// primera.
// • Salir. Como siempre no sale de la aplicación hasta que se selecciona esta
// opción.