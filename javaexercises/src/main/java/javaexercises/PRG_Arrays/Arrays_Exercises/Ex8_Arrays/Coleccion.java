package javaexercises_prg_dam.PRG_Arrays.Arrays_Exercises.Ex8_Arrays;

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

/*
Insertar nuevo videojuego (se permite decidir al usuario al principio o al
final de la colección si hubiera ya algún elemento).
• Visualizar toda las lista de videojuegos: Se muestra en cada fila un
videojuego bien formateado en columnas incluido el índice en la colección y
con cabeceras. Si el título o el fabricante ocupa más de 23 caracteres lo
trunca a tamaño 20 y añade puntos suspensivos (...).
• Buscar videojuegos: En este punto el usuario mete el principio del título y
mostrar todos los títulos que empiecen por dicho fragmento.
• Eliminar videojuego (por posiciones). Se pide un índice y borra el videojuego
de dicha posición.
• Borrar videojuegos de un año determinado. Se pide un año al usuario y borra
todos los videojuegos de ese año.
• Salir del programa. Finaliza la aplicación y guarda todos los datos en un
archivo denominado videojuegos.txt con el formato que se explica más abajo.

Al ejecutar el programa se debe inicializar la colección a partir de un archivo
denominado videojuegos.txt. Si el archivo no existe la colección comienza vacía
(Usa File.exists()). Dicho archivo tiene en cada línea los tres datos del videojuego
separados por punto y coma (;). Por ejemplo:
Pacman;1980;Capcom
Undertale;2015;Toby Fox
Ghost of Tsushima;2020;Sucker Punch
Hollow Knight;2017;Team Cherry
Debe haber una comprobación básica de cada línea leída de que tiene tres datos y
que el del medio son 4 digitos (puedes usar Character.isDigit()). Si alguna no
cumple la saltas. Esto hazlo en una función a la que le pasas un string con la
línea leída del archivo y te devuelve un objeto tipo Videojuego con los datos o null
si la línea es incorrecta.
Debes hacer otras funciones para modularizar mejor el código y evitar repetir
subrutinas.
Finalmente en una tercera clase denominada Principal estará el main en el que se
instancia un objeto tipo Coleccion y llama a su función menu.
Por supuesto se debe hacer un programa claro para el usuario informando o
salvando los posibles errores que se puedan producir (eliminar titulo no existente,
que introduzca con mayúsculas o minúsculas, que introduzca espacios al principio o
al final de la cadena, etc.)
*/