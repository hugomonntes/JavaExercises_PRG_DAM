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

public class Ex18_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero;
        long acumulador = 1;
        int contador = 1;

        System.out.print("Introduce un número para calcular su factorial: ");
        numero = sc.nextLong();
        for(long i = 1; i <= numero; i++){
            acumulador = acumulador * i;
        }
        System.out.println("Solución For: " + acumulador);

        //Reiniciar variables.
        acumulador = 1;
        contador = 1;

        while (contador <= numero) {
            acumulador = acumulador * contador;
            contador++;
        }
        System.out.println("Solución While: " + acumulador);

        
        //Reiniciar variables.
        acumulador = 1;
        contador = 1;

        do{
            acumulador = acumulador * contador;
            contador++;
        }
        while (contador <= numero);
        System.out.println("Solución DoWhile: " + acumulador);
    }                                                            
}

/*
18.Realizar un programa que calcule el factorial de un número (usar tipo long o
real) introducido por el usuario (haz sólo un programa que realice 3 veces el
cálculo). No se permite el uso de sentencias if:
a) Con un bucle for.
b) Con un bucle do-while
c) Con un bucle while
Nota: El factorial de un número es el número multiplicado por los anteriores incluso
el 1. Como por ejemplo, factorial de 7 es 7*6*5*4*3*2*1. La excepción es el 0
cuyo factorial es 1 (0!=1).
*/
