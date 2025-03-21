package javaexercises.PRG_EstructurasDeControl;

import java.util.InputMismatchException;
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

public class Ex15_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        double valorEuroALibra = 0.83;
        double valorLibraAEuro = 1.15;
        double resultadoFinal;
        int opcion = 6;
        do {
            System.out.println("1 --> Conversor de Euros a Libras");
            System.out.println("2 --> Conversor de Libras a Euros");
            System.out.println("3 --> Salir");
            try {
                System.out.print("Introduce la opción: ");
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero!");
                sc.nextLine();
            }
            switch (opcion) {
                case 1:
                    System.out.print("Introduce tu cantidad en Euros (€): ");
                    cantidad = sc.nextInt();
                    resultadoFinal = cantidad * valorEuroALibra;
                    System.out.printf("%.2f Euros (€) es equivalente a %.2f Libras (£) \n", cantidad, resultadoFinal);
                    break;
                case 2:
                    System.out.print("Introduce tu cantidad en Libras (£): ");
                    cantidad = sc.nextInt();
                    while (cantidad <= 0) {
                        System.out.println("No puedes introducir una cantidad negativa!");
                        System.out.print("Introduce tu cantidad en Euros (€): ");
                        cantidad = sc.nextInt();
                    }
                    resultadoFinal = cantidad * valorLibraAEuro;
                    System.out.printf("%.2f Libras (£) es equivalente a %.2f Euros (€) \n", cantidad, resultadoFinal);
                    break;
                case 3:
                    System.out.println(" \n_________________ \n");
                    System.out.println("Adiós!");
                    System.out.println("_________________ \n");
                    break;
            }
        } while (opcion != 3);
    }
}

/*
 * 15.Realizar un conversor de euros a libras y de libras a euros. No debe
 * admitir
 * valores negativos: si el usuario mete negativo, informa del error y lo vuelve
 * a
 * pedir hasta que meta positivo. Debe ejecutarse de forma continua hasta que el
 * usuario lo desee (plantea un menú con dos opciones de conversión y salir).
 * Debe presentar los datos con 2 decimales.
 */
