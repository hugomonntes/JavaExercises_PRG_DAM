package PRG_Arrays.Arrays_Exercises.Ex8_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego> coleccionVideojuegos; // PREGUNTAR CURRO SI TIENE QUE SER STATIC

    public void setColeccionVideojuegos(ArrayList<Videojuego> coleccionVideojuegos) {
        this.coleccionVideojuegos = coleccionVideojuegos;
    }

    public ArrayList<Videojuego> getColeccionVideojuegos() {
        return coleccionVideojuegos;
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1.- Insertar nuevo videojuego");
            System.out.println("2.- Visualizar lista videojuegos");
            System.out.println("3.- Buscar videojuegos");
            System.out.println("4.- Eliminar videojuegos por posición");
            System.out.println("5.- Borrar videojuego según el año");
            System.out.println("6.- Salir");
            System.out.println("Introduce una opción: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Introduce el nombre del videojuego: ");
                    String nombreVideojuego = sc.nextLine();
                    System.out.print("Lo quieres añadir al principio o al final? (I (Inicio) / F (Final))");
                    String posicionVideojuego = sc.nextLine();
                    Videojuego videojuegosNuevos = new Videojuego();
                    sc.nextLine();
                    if (posicionVideojuego.equals("I")) {
                        // videojuegosNuevos.getColeccionVideojuegos().add(0, nombreVideojuego);
                    } else if (posicionVideojuego.equals("F")){
                        // videojuegosNuevos.getColeccionVideojuegos().add(nombreVideojuego);
                    }
                    break;
                case 2:
                // for (int i = 0; i < coleccionVideojuegos.getColeccionVideojuegos().size(); i++) {
                    
                // }
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

        } while (option != 6);
    }
}
