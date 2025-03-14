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
public class ExPrueba_b3 {
    
    public static int sumNumbers(int number){
        int acumulador = 0;
        
        for (int i = 1; i <= number; i++) {
            acumulador += i;
        }

        return acumulador;
    }

    public static String sayMesg(String msg){
        return msg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numbers;
        System.out.println("Introduce un numero: ");
        numbers = sc.nextInt();
        System.out.println(sumNumbers(numbers));
        System.out.println(sayMesg("Hello"));
    }       
}

/*
1. Realizar una función que sume 1+2+3+…+n y devuelva el resultado.
n será un parámetro. En el programa principal ejecútala dos veces para
luego mostrar la suma hasta 10 y hasta 10000.
*/
