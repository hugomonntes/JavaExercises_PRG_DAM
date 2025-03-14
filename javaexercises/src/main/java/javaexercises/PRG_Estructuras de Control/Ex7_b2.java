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

public class Ex7_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int contador = 0;
        int acumulador = 0;
        double calcularMedia;

        System.out.println("Introduce 0 para parar el programa.");
        do{
            System.out.print("Introduce un numero:");
            numeros = sc.nextInt();
            if (numeros != 0) {
                contador++;
                acumulador = acumulador + numeros;
            }
        } while (numeros != 0);
        calcularMedia = acumulador / contador;

        System.out.println("La media es: " + calcularMedia);
    }
}

/*
7. a) Realizar un programa que acepte 5 números del usuario y calcule y muestre
su media (la media es la suma de los números dividido entre 5). Al final debe
permitir ejecutar de nuevo el programa o salir del mismo.
Nota: Puedes hacer directamente el apartado (b) y saltarte el (a).
b) Mejorar el apartado anterior (o realiza otro programa) de forma que admita
una cantidad indefinida de números. Es decir, el usuario introduce números y
acaba cuando pulse el 0. En ese momento calcula la media (el 0 no se incluirá
en el cálculo de la media). 
*/
