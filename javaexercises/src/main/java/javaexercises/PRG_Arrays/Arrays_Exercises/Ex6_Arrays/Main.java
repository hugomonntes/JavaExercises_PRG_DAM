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
package javaexercises.PRG_Arrays.Arrays_Exercises.Ex6_Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new Matriz(3);
        int opcion;
        do {
                System.out.println("\nElija una de las siguiente:");
                System.out.println("1.- Mostrar matriz.");
                System.out.println("2.- Mostrar suma de todos los elementos.");
                System.out.println("3.- Mostrar suma de la diagonal.");
                System.out.println("4.- Mostrar suma de los elementos salvo diagonal ");
                System.out.println("5.- Mostrar suma de elementos de una fila.");
                System.out.println("6.- Mostrar matriz sin una fila.");
                System.out.println("7.- Salir");
                System.out.print("Introduce una opcion: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        matriz.mostrarMatriz(matriz.numerosEnteros);
                        break;
                    case 2:
                        System.out.printf("Suma de todo: %d \n", matriz.sumarElementosMatriz());
                        break;
                    case 3:
                        System.out.printf("Suma de la diagonal: %d \n", matriz.sumarDiagonal(true));
                        break;
                    case 4:
                        System.out.printf("Suma de todos los elementos restando la diagonal: %d \n", matriz.sumarDiagonal(false));
                        break;
                    case 5:
                        System.out.print("Introduce la fila de la que quieres sumar sus datos: ");
                        System.out.printf("Suma de elementos de la fila: %d \n", matriz.sumarElementosFila(sc.nextInt()));
                        break;
                    case 6:
                        System.out.print("\n ¿Que fila quieres eliminar de la matriz?: ");
                        int[][] matrizModificada = matriz.borrarFila(matriz.numerosEnteros, sc.nextInt());
                        Matriz.mostrarMatriz(matrizModificada);
                        break;
                    default:
                        System.out.println("Fin");
                        break;
                }
        } while (opcion != 7);
        sc.close();
    }
}
