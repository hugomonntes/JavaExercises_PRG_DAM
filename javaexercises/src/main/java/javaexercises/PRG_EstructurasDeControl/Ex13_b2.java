package javaexercises.PRG_EstructurasDeControl;

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
import java.util.Scanner;

public class Ex13_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMaximo;
        int opcion;
        int acumulador1 = 0;
        int acumulador2 = 0;

        do {
            System.out.println("Introduce el número de la opción que deseas!");
            System.out.println("Tienes 3 opciones: ");
            System.out.println("1 --> Numeros pares");
            System.out.println("2 --> Numeros impares");
            System.out.println("3 --> Suma de los números pares e impares");
            System.out.println("4 --> Salir");
            System.out.print("Introduce la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el numero hasta el que quieras los números pares:");
                    numeroMaximo = sc.nextInt();
                    for (int i = 0; i <= numeroMaximo; i = i + 2) {
                        acumulador1 = acumulador1 + i;
                    }
                    System.out.println(acumulador1);
                    System.out.println(" \n_________________ \n");
                    break;

                case 2:
                    System.out.print("Introduce el numero hasta el que quieras los números pares:");
                    numeroMaximo = sc.nextInt();
                    for (int i = 1; i <= numeroMaximo; i = i + 2) {
                        acumulador2 = acumulador2 + i;
                    }
                    System.out.println(acumulador2);
                    System.out.println(" \n_________________ \n");
                    break;

                case 3:
                    System.out.print("Introduce el numero hasta el que quieras los números pares:");
                    numeroMaximo = sc.nextInt();
                    for (int i = 0; i <= numeroMaximo; i++) {
                        if (i % 2 == 0) {
                            acumulador1 += i;
                        } else {
                            acumulador2 += i;
                        }
                    }
                    System.out.println(acumulador1+acumulador2);
                    
                    System.out.println(" \n_________________ \n");
                    break;
                case 4:
                    System.out.println(" \n_________________ \n");
                    System.out.println("Adiós!");
                    System.out.println(" \n_________________ \n");
                    break;
                default:
                    System.out.println(" \n_________________ \n");
                    System.out.println("Opción no válida!");
                    System.out.println(" \n_________________ \n");
                    break;
            }

        } while (opcion != 4);

    }
}

/*
 * 13.Hacer con bucles for (en un único programa todos los apartados):
 * a) Programa que dé el resultado de la suma de números pares entre 0 y N (N lo
 * decide el usuario).
 * b) Programa que dé el resultado de la suma de números impares entre 0 y N (N
 * lo decide el usuario).
 * c) Programa que dé el resultado de la suma de números pares por una parte e
 * impares por otro entre 0 y N (N lo decide el usuario). Debe realizarse con
 * un único bucle.
 */
