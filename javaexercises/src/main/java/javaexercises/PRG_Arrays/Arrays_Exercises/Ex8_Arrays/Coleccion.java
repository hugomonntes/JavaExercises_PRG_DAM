/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2025 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
package javaexercises.PRG_Arrays.Arrays_Exercises.Ex8_Arrays;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Coleccion {
    private ArrayList<Videojuego> coleccionVideojuegos;

    public Coleccion() {
        this.coleccionVideojuegos = new ArrayList<>();
    }

    public void setColeccionVideojuegos(ArrayList<Videojuego> coleccionVideojuegos) {
        this.coleccionVideojuegos = coleccionVideojuegos;
    }

    public ArrayList<Videojuego> getColeccionVideojuegos() {
        return coleccionVideojuegos;
    }

    public ArrayList<Videojuego> buscarJuegosPorInicio(String palabraBusqueda) {
        ArrayList<Videojuego> juegosEncontrados = new ArrayList<>();
        for (Videojuego videojuego : getColeccionVideojuegos()) {
            if (videojuego.getTitulo().startsWith(palabraBusqueda)) {
                juegosEncontrados.add(videojuego);
            }
        }
        return juegosEncontrados;
    }

    public void menu() throws Exception {//TODO leer archivo
        Scanner sc = new Scanner(System.in);
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
            sc.nextLine();
            Videojuego instanciaVideojuego = new Videojuego();
            switch (option) {
                case 1:
                    boolean isCheck = false;
                    String nombreVideojuego;
                    String posicionVideojuego;
                    System.out.println("Introduce el nombre del videojuego: ");
                    nombreVideojuego = sc.nextLine();
                    instanciaVideojuego.setTitulo(nombreVideojuego);
                    System.out.println("Introduce el año del videojuego: ");
                    int añoSalidaJuego = sc.nextInt();
                    instanciaVideojuego.setAño(añoSalidaJuego);
                    do {
                        System.out.print("Lo quieres añadir al principio o al final (P (Principio) / F (Final)): ");
                        posicionVideojuego = sc.nextLine().toLowerCase();

                        if (posicionVideojuego.equals("p")) {
                            this.coleccionVideojuegos.add(0, instanciaVideojuego);
                            isCheck = true;
                        } else if (posicionVideojuego.equals("f")) {
                            this.coleccionVideojuegos.add(instanciaVideojuego);
                            isCheck = true;
                        } else {
                            System.out.println("Introduce \"p\" o \"f\" en minúscula");
                        }
                    } while (!isCheck);
                    break;
                case 2:
                    int indice = 1;
                    for (Videojuego videojuego : coleccionVideojuegos) {
                        System.out.printf("\n%4d %20s\n", indice, videojuego.getDatosAgrupados());
                        indice++;
                    }
                    break;
                case 3:
                    String letrasBusquedaUser = "";
                    do {
                        System.out.println("Introduce las tres primeras letras del título del juego: ");
                        letrasBusquedaUser = sc.nextLine().toUpperCase();
                    } while (letrasBusquedaUser.length() > 3 || letrasBusquedaUser.length() < 1);
                    for (Videojuego videojuego : buscarJuegosPorInicio(letrasBusquedaUser)) {
                        System.out.println(videojuego);
                    }
                    break;
                case 4://TODO revisar eliminar indice 0
                    boolean isCheckIndex;
                    int indiceJuego = 0;
                    do {
                        isCheckIndex = false;
                        System.out.println("Introduce el índice del videojuego a borrar: ");
                        indiceJuego = sc.nextInt();
                        if (indiceJuego > 0 && indiceJuego < coleccionVideojuegos.size()) {
                            isCheckIndex = true;
                        }
                    } while (!isCheckIndex);
                    coleccionVideojuegos.remove(indiceJuego);
                    break;
                case 5://TODO informa más al usuario (error)
                    boolean isCheckYear = false;
                    int añoBorrar;
                    do {
                        System.out.println("Introduce el año del que quieres borrar los juegos: ");
                        añoBorrar = sc.nextInt();
                        if (añoBorrar > 1980) {
                            isCheckYear = true;
                        }
                    } while (!isCheckYear);
                    for (int i = 0; i < getColeccionVideojuegos().size(); i++) {
                        if (getColeccionVideojuegos().get(i).getAño() == añoBorrar) {
                            getColeccionVideojuegos().remove(i);
                            i--;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Cerrando programa...");
                    PrintWriter fWriter = new PrintWriter(new FileWriter("videojuegos.txt"));//TODO falta algo
                    for (Videojuego videojuego : coleccionVideojuegos) {
                        fWriter.println(videojuego.getDatosAgrupados());
                    }
                    break;
            }
        } while (option != 6);
    }
}

/*
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
