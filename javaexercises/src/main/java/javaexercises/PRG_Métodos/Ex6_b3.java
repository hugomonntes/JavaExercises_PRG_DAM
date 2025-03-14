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

import java.util.Scanner;

public class Ex6_b3 {
    /**
     * Calcular Potencia
     * 
     * @param base
     * @param exponente
     * @return Resultado de la operación
     */
    public static double calcularPotencia(double base, int exponente) {
        double acumulador = 1;
        if ((exponente < 0)) {
            for (int i = 0; i > exponente; i--) {
                acumulador *= (1 / base);
            }
        }
        for (int i = 1; i <= exponente; i++) {
            acumulador *= base;
        }
        return acumulador;
    }

    /**
     * Muestra todas las potencias
     * 
     * @param base      base de la potencia
     * @param exponente exponente para elevar la base
     */
    public static void mostrarPotencias(double base, int exponente) {
        for (int i = 0; i < exponente; i++) {
            System.out.println(calcularPotencia(base, i));
        }
    }

    /**
     * Suma la progresion de las potencias
     * 
     * @param base
     * @param exponente
     * @return Suma de las potencias
     */
    public static double progresionGeometrica(double base, int exponente) {
        double acumulador = 1;
        for (int i = 1; i < exponente; i++) {
            acumulador += calcularPotencia(base, i);
        }
        return acumulador;
    }

    public static void main(String[] args) {

        System.out.println(calcularPotencia(2, 0));
        System.out.println(calcularPotencia(2, 1));
        System.out.println(calcularPotencia(2, -1));
        System.out.println(calcularPotencia(2, 3));
        System.out.println(calcularPotencia(2, -3));
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime la base: ");
        int base = sc.nextInt();
        System.out.print("Dime el exponente: ");
        int exponente = sc.nextInt();
        // System.out.printf("El resultado es: %f \n", calcularPotencia(base,
        // exponente));
        // mostrarPotencias(base, exponente);
        System.out.println(progresionGeometrica(base, exponente));
    }
}

/*
6.
a) Realizar una función que halle y devuelva la potencia de un número ( No se
permite usar funciones de Math). La base puede ser real y el exponente entero
puede ser negativo (recuerda que a-b = (1/a)b
).
Parámetros del método: la base y el exponente. Valor devuelto: la potencia

b) Realiza un nuevo método = función (en la misma clase) que muestre en
pantalla las n
primeras potencias de un número a (n y a serán parámetros del método).
Por ejemplo, si los parámetros son a=2 y n=4 mostrará: 1, 2, 4, 8.
Para hacerlo deberás llamar al creado en el apartado anterior para calcular
las
potencias, no las puedes calcular de nuevo en este método.

c) Escribe un método que sume la progresión geométrica (x puede ser real) y
devuelva el resultado.
1+x+x2+ x3+ x4+... xn
Se debe utilizar la función potencia (sin modificarla, sólo llamándola)
programada
anteriormente.
Por ejemplo si x=2 y n=4 mostrará 15 por ser el resultado de 1+2+4+8.
Parámetros del método: x y n. Valor devuelto: resultado de la progresión.
 */
