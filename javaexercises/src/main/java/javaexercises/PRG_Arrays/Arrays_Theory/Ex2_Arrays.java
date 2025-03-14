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
package javaexercises.PRG_Arrays.Arrays_Theory;

public class Ex2_Arrays {
    public static double[][] crearBidimensional(int numeroFilas, int numeroColumnas){
        double[][] numbers = new double[numeroFilas][numeroColumnas];
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                numbers[i][j] = Math.random() * 10 + 20;
            }
        }
        return numbers;
    }

    public static void mostrarBidimensional(double[][] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%.2f ", numbers[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        double[][] array1 = crearBidimensional(4, 3);
        mostrarBidimensional(array1);

        double[][] array2 = crearBidimensional(3, 4);
        mostrarBidimensional(array2);
    }
}

/*
Actividad: Realiza una función a la cual se le pasan dos parámetros enteros
(nº de filas y nº de columnas) y cree un array bidimensional de números
reales (aleatorios entre 20 y 30) del tamaño indicado por los parámetros y lo
devuelva.
Realiza también otra función a la que se le pasa un array bidimensional de
doubles y la muestra por pantalla indicando el número de fila y el de columna
como cabeceras. Los datos muestra los con 2 decimales. Trata de hacerla con
for mejorado.
En el main crea dos arrays mediante la primera función (de 4x3 y de 3x4).
Luego muéstralos mediante la segunda función.
*/
