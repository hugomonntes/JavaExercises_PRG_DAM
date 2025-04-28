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
                    String isGaseoso;
                    System.out.println("¿El planeta es gaseoso? (s/n)");
                    isGaseoso = sc.nextLine().toLowerCase();
                    if (isGaseoso.equals("s")) {
                        coleccionDeAstros.add(new Planeta("", 0.0, true));
                    }
                    ;
                    break;
                case 2:
                    ;
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