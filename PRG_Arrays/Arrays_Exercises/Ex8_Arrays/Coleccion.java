package PRG_Arrays.Arrays_Exercises.Ex8_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego> videojuegos;

    public void setVideojuegos(ArrayList<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    public ArrayList<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public static void menu(){
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
                    System.out.print("Lo quieres añadir al principio o al final (I (Inicio) / F (Final))");
                    String posicionVideojuego = sc.nextLine();
                    if (posicionVideojuego.equals("I")) {
                        
                    }
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
        
        } while (option != 6);
    }
}
