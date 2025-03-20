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

public class Ex6_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int numberInverso;
        double calcularInverso;
        int opcion;

        do {
            System.out.println("Introduce el número de la opción que deseas!");
            System.out.println("Tienes 3 opciones: ");
            System.out.println("1 --> Cuadrado de un número real");
            System.out.println("2 --> Inverso de un número");
            System.out.println("3 --> Raíz cuadrada de un número");
            System.out.println("4 --> Operación AND a nivel de bit entre dos enteros");
            System.out.println("5 --> Operación OR a nivel de bit entre dos enteros");
            System.out.println("6 --> Salir");
            System.out.print("Introduce la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dame un número: ");
                    firstNumber = sc.nextInt();
                    System.out.printf("El resultado es: %.2f \n", Math.pow(firstNumber, 2));//firstNumber*firstNumber
                    System.out.println("______________________");
                    break;

                case 2:
                    do {
                        System.out.print("Dame un número: ");
                        numberInverso = sc.nextInt();
                        if (numberInverso == 0) {
                            System.out.println("El número no puede ser 0. Inténtalo de nuevo.");
                        }
                    } while (numberInverso == 0);
                    calcularInverso = 1 / numberInverso;
                    System.out.printf("El resultado es: %.4f \n", calcularInverso);
                    System.out.println("______________________ \n");
                    break;

                case 3://Evitar neg
                    System.out.print("Dame un número: ");
                    firstNumber = sc.nextInt();
                    if (firstNumber < 0) {
                        System.out.print("Dame un número: ");
                        firstNumber = sc.nextInt();
                    }
                    System.out.printf("El resultado es: %.2f \n", Math.sqrt(firstNumber));
                    System.out.println("______________________ \n");
                    break;
                case 4:
                    System.out.print("Dame el primer número: ");
                    firstNumber = sc.nextInt();
                    System.out.print("Dame el segundo número: ");
                    secondNumber = sc.nextInt();
                    System.out.printf("El resultado es: %X \n", firstNumber & secondNumber);
                    System.out.println("______________________ \n");
                    break;
                case 5:
                    System.out.print("Dame el primer número: ");
                    firstNumber = sc.nextInt();
                    System.out.print("Dame el segundo número: ");
                    secondNumber = sc.nextInt();
                    System.out.printf("El resultado es: %X \n", firstNumber | secondNumber);
                    System.out.println("______________________ \n");
                    break;
                case 6:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida!");
                    break;
            }

        } while (opcion != 6);
    }
}

/*
 * Realizar un menú con las opciones (los números se piden en cada opción, es
 * decir, en cada case):
 * a) Cuadrado de un número real. Se mostrará con 2 decimales de
 * aproximación
 * b) Inverso de un número (1/x). Se mostrará con 4 decimales de
 * aproximación. No se admite el 0 (vuelve a pedirlo hasta que se meta
 * distinto de 0).
 * c) Raíz cuadrada de un número. Debe mostrar el resultado con 3 decimales
 * de aproximación. No admite números negativos (debe pedir número hasta
 * que se meta uno positivo o 0). Averigua en internet cómo se haya la raíz
 * cuadrada en Java.
 * d) Operación AND a nivel de bit entre dos enteros. Resultado en
 * hexadecimal.
 * e) Operación OR a nivel de bit entre dos enteros. Resultado en hexadecimal.
 * f) Salir. El programa no debe acabar mientras no se pulse esta opción.
 * RAMA: Informática CICLO: DAM
 * MÓDULO Programación CURSO: 1º
 * PROTOCOLO: Boletín clase AVAL: DATA:
 * AUTOR Francisco Bellas Aláez (Curro)
 * 7. a) Realizar un programa que acepte 5 números del usuario y c
 */
