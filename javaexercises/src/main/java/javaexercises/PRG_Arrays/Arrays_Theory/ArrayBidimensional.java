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

public class ArrayBidimensional {
    @SuppressWarnings("unused") //Quitar warnings de variables no utilizadas.
    public static void main(String[] args) {
        int [][] temperaturas = new int[7][4];  //7 filas y 4 columnas.

        //Array predefinido al declarar.
        int [][] tabla = {
            {15, 12, 14},
            {10, 5, 4},
            {1, 2, 13}
        };

        //Array bidimensional con matrices de distintos tamaños.
        int[][] b = {
            {-5, 7, 7, 9},
            {1, 2},
            {4, 3}
        };
        
        // Obtener número de filas y columnas.
        System.out.println("Número de filas: " + temperaturas.length);
        System.out.println("Número de columnas: "+ temperaturas[0].length);

        //Recorrer Arrays bidimensionales.
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.printf("%3d ", tabla[i][j]);
            }
            System.out.println();
        }

        //Recorrer Array con bucle foreach.
        for (int[] fila : temperaturas) {
            for (int valor : fila) {
                System.out.printf("%3d", valor);
            }
            System.out.println();
        }
    }
}
