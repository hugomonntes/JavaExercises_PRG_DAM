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
public class Ex8_b3 {
    /**
     * Averigua si el numero es primo o no.
     * @param number
     * @return true (Si es primo) o false (Si no es primo)
     */
    public static boolean isPrimo(int number){
        if (number <= 1) {
            return false; //Si es menor que uno no es primo
        }
        if (number == 2 || number == 3) return true; //Si es 2 / 3 es primo
        
        for (int i = 2; i < number; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
    /**
     * Imprime todos los números primos hasta X número.
     * @param number
     */
    public static void mostrarPrimos(int number){
        for (int i = 2; i <= number; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Introduce un número: ");
        number = sc.nextInt();
        System.out.println(isPrimo(number)); //Print si es Primo o No.
        mostrarPrimos(number); //Print los números primos hasta X número.
    }
}

/*
8. a) Escribir una función que se le pase un número y que devuelva true o false
dependiendo de si dicho número es o no es primo.

b) Para probarla haz un programa principal que pida un n.º mayor que 2 al usuario
y muestra los números primos menores que dicho número.

Nota: Un número es primo si y sólo si es divisible únicamente por 1 y por él mismo.
Por tanto para saber si un número es primo se debe dividir por todos los números
menores que él y mayores que 1, y si alguna de esas divisiones exacta entonces el
número NO es primo. Existen métodos de optimizar lo anterior, piensa a ver si se te
ocurre alguno. El 1 actualmente no se considera primo.
*/
