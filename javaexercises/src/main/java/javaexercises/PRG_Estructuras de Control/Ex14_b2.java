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

public class Ex14_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int contador = 0;
        int contadorNumerosNegativos = 0;
        int acumulador = 0;
        double calcularMedia;
        
        System.out.println("Introduce 0 para parar el programa.");

        do{
            System.out.print("Introduce un numero:");
            numeros = sc.nextInt();
            if (numeros != 0) {
                contador++;
              //  acumulador = acumulador + numeros;
            }
            if (numeros < 0) {
                contadorNumerosNegativos++;
            }
        } while (numeros != 0);
        System.out.printf("Se introdujeron %d números negativos de un total de %d \n",contadorNumerosNegativos, contador);

    }
}

/*
14.Contar la cantidad de números negativos introducidos por el usuario. Se termina
cuando el usuario introduce el cero. Se debe informar también del total de
números introducidos (no se cuenta el cero).
Ejemplo de salida:
Introduce número: -10
Introduce número: -2
Introduce número: 3
Introduce número: 0
Se introdujeron 2 números negativos de un total de 3.
 */
