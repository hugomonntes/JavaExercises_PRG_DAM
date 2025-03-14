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
package javaexercises.PRG_Métodos;

import java.io.PrintWriter;
import java.util.Scanner;

public class Ex2_b3 {
    public static void lineasEnBlanco(int numeroLineas) {// coment
        for (int i = 0; i <= numeroLineas; i++) {
            System.out.println("");
        }
    }

    /**
     * Comprobar si es Par.
     * 
     * @param number
     * @return true si es par, false si es impar.
     */
    public static boolean isPar(int number) {
        return number % 2 == 0;
    }

    /**
     * Comprobar si es Positivo.
     * 
     * @param number2
     * @return "P" si es positivo, "N" si es negativo.
     */
    public static String isPositive(int number2) { // char no string
        return number2 >= 0 ? "P" : "N";
    }

    public static void main(String[] args) throws Exception {
        String userName;
        int userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        userName = sc.nextLine();
        lineasEnBlanco(10);
        System.out.print("Introduce un número: ");
        userNumber = sc.nextInt();
        System.out.println(isPar(userNumber));
        System.out.println(isPositive(userNumber));

        // EX2
        PrintWriter f = new PrintWriter("PRG_Archivos/Ex2_b3.txt");
        f.printf("%s \n", userName);
        f.printf("%d \n", userNumber);
        String isPar = isPar(userNumber) ? "par" : "impar";
        String isPositive = isPositive(userNumber).equals("P") ? "positivo" : "negativo";
        f.printf("El número %d es %s y %s", userNumber, isPar, isPositive);

        f.close();
        sc.close();
    }
}
/*
 ** 2. Amplia el programa anterior (directamente el main) para que guarde en un
 * archivo los siguientes datos: el nombre en una línea, el número en la
 * siguiente y si
 * es par/impar y positivo/negativo.
 * El archivo queda algo así:
 * Minerva McGonagall
 * -5
 * El n.º es impar in negativo.
 */
