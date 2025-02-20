package javaexercises.PRG_Arrays.Arrays_Exercises.Ex8_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego> coleccionVideojuegos;

    public void setColeccionVideojuegos(ArrayList<Videojuego> coleccionVideojuegos) {
        this.coleccionVideojuegos = coleccionVideojuegos;
    }

    public ArrayList<Videojuego> getColeccionVideojuegos() {
        return coleccionVideojuegos;
    }

    public void menu() throws Exception {
        Scanner sc = new Scanner(System.in);
        Videojuego nuevoVideojuego = new Videojuego(2020, "Hugo");
        int option;
        do {
            System.out.println("1.- Añadir nuevo videojuego");
            System.out.println("2.- Visualizar la lista videojuegos");
            System.out.println("3.- Buscar videojuegos");
            System.out.println("4.- Eliminar videojuegos eligiendo una posición");
            System.out.println("5.- Borrar videojuego según el año");
            System.out.println("6.- Salir");
            System.out.print("Introduce una opción: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Introduce el nombre del videojuego: ");
                    String nombreVideojuego = sc.nextLine();
                    sc.next();
                    nuevoVideojuego.setTitulo(nombreVideojuego);
                    System.out.print("Lo quieres añadir al principio o al final (P (Principio) / F (Final)): ");
                    String posicionVideojuego = sc.nextLine();
                    nuevoVideojuego.setTitulo(nombreVideojuego);
                    sc.nextLine();
                    boolean isCheck = true;
                    do {
                        try {
                            isCheck = true;
                            if (posicionVideojuego.equals("P")) {
                                isCheck = true;
                                this.coleccionVideojuegos.add(0, nuevoVideojuego);
                            } else if (posicionVideojuego.equals("F")) {
                                isCheck = true;
                                this.coleccionVideojuegos.add(nuevoVideojuego);
                            }
                            if (posicionVideojuego != "P" || posicionVideojuego != "F") {
                                isCheck = false;
                                throw new Exception("Letra incorrecta");
                            }
                        } catch (Exception e) {
                            System.out.println("Introduce \"P\" o \"F\"");
                        }
                    } while (!isCheck);
                    break;
                case 2:
                    int indice = 1;
                    for (Videojuego videojuego : getColeccionVideojuegos()) {
                        if (videojuego.getTitulo().length() > 23 || videojuego.getFabricante().length() > 23) {
                            System.out.printf("%4d título: %20s..., fabricante: %20s..., año: %4d", indice,
                                    videojuego.getTitulo().substring(0, 19),
                                    videojuego.getFabricante().substring(0, 19), videojuego.getAño(),
                                    videojuego.getAño());
                        } else {
                            System.out.printf("%4d título: %23s, fabricante: %23s, año: %4d", indice,
                                    videojuego.getTitulo(), videojuego.getFabricante(), videojuego.getAño(),
                                    videojuego.getAño());
                        }
                        indice++;
                    }
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
 * Insertar nuevo videojuego (se permite decidir al usuario al principio o al
 * final de la colección si hubiera ya algún elemento).
 * • Visualizar toda las lista de videojuegos: Se muestra en cada fila un
 * videojuego bien formateado en columnas incluido el índice en la colección y
 * con cabeceras. Si el título o el fabricante ocupa más de 23 caracteres lo
 * trunca a tamaño 20 y añade puntos suspensivos (...).
 * • Buscar videojuegos: En este punto el usuario mete el principio del título y
 * mostrar todos los títulos que empiecen por dicho fragmento.
 * • Eliminar videojuego (por posiciones). Se pide un índice y borra el
 * videojuego
 * de dicha posición.
 * • Borrar videojuegos de un año determinado. Se pide un año al usuario y borra
 * todos los videojuegos de ese año.
 * • Salir del programa. Finaliza la aplicación y guarda todos los datos en un
 * archivo denominado videojuegos.txt con el formato que se explica más abajo.
 * 
 * Al ejecutar el programa se debe inicializar la colección a partir de un
 * archivo
 * denominado videojuegos.txt. Si el archivo no existe la colección comienza
 * vacía
 * (Usa File.exists()). Dicho archivo tiene en cada línea los tres datos del
 * videojuego
 * separados por punto y coma (;). Por ejemplo:
 * Pacman;1980;Capcom
 * Undertale;2015;Toby Fox
 * Ghost of Tsushima;2020;Sucker Punch
 * Hollow Knight;2017;Team Cherry
 * Debe haber una comprobación básica de cada línea leída de que tiene tres
 * datos y
 * que el del medio son 4 digitos (puedes usar Character.isDigit()). Si alguna
 * no
 * cumple la saltas. Esto hazlo en una función a la que le pasas un string con
 * la
 * línea leída del archivo y te devuelve un objeto tipo Videojuego con los datos
 * o null
 * si la línea es incorrecta.
 * Debes hacer otras funciones para modularizar mejor el código y evitar repetir
 * subrutinas.
 * Finalmente en una tercera clase denominada Principal estará el main en el que
 * se
 * instancia un objeto tipo Coleccion y llama a su función menu.
 * Por supuesto se debe hacer un programa claro para el usuario informando o
 * salvando los posibles errores que se puedan producir (eliminar titulo no
 * existente,
 * que introduzca con mayúsculas o minúsculas, que introduzca espacios al
 * principio o
 * al final de la cadena, etc.)
 */