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

public class Ex4_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroEntero;
        double numeroReal;

        System.out.println("Introduce un numero entero: ");
        numeroEntero = sc.nextInt();
        System.out.println("Introduce un numero real: ");
        numeroReal = sc.nextDouble();

        System.out.printf("El numero en decimal es: %d \n El numero en octal es: %05o \n El numero en octal es: %X", numeroEntero, numeroEntero, numeroEntero);
        System.out.printf("El número real es: %7.3f", numeroReal);
    }
}

/*
 * Haz un programa que pida un nº entero al usuario y luego un número real.
 * El entero debe mostrarlo primero en decimal; luego en octal ocupando 5
 * caracteres y rellenando los vacíos a la izquierda con ceros (busca como
 * hacerlo); y en hexadecimal poniendo los dígitos “letra” en mayúscula.
 * El real lo mostrará con 3 decimales y ocupando al menos 7 caracteres.
 */
