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
package javaexercises.PRG_Exams.SegundaEvaluación.P1;

public class Magos {
    public int[][] creaMatriz(int cantidadMagos){
        int[][] matrizMagos = new int[cantidadMagos][4]; //4 porque son el numero de elementos (aire, fuego, tierra y agua)
        for (int i = 0; i < matrizMagos.length; i++) {
            for (int j = 0; j < matrizMagos[i].length; j++) {
                matrizMagos[i][j] = (int)(Math.random()*5 + 1);
            }
        }
        return matrizMagos;
    }

    public void muestraMatriz(int[][] matrizMagos){
        if (matrizMagos == null) {
            System.out.println();
        } else {
            String letras = "AFEW";
            System.out.printf("    "); // 4 espacios antes del primer índice
            for (int i = 0; i < letras.length(); i++) {
                System.out.printf("%4s", letras.charAt(i));
            }
            System.out.println();
            for (int i = 0; i < matrizMagos.length; i++) {
                System.out.printf("%4d", i + 1);
                for (int j = 0; j < matrizMagos[i].length; j++) {
                    System.out.printf("%4d" ,matrizMagos[i][j]);
                }
                System.out.println();
            }
        }
    }

    public int poderDeMago(int[][] matriz, int filaMatriz){
        int sumaPoderes = 0;
        if (filaMatriz < 0 || filaMatriz > matriz.length){
        } else {
            for (int numerosFila : matriz[filaMatriz]) {
                sumaPoderes += numerosFila;
            }
        }
        return sumaPoderes;
    }

    public void intercambioDePoder(int[][] matriz, int indiceFilaOrigen, int indiceFilaDestino){
        int[] auxiliar = matriz[indiceFilaOrigen];
        matriz[indiceFilaOrigen] = matriz[indiceFilaDestino];
        matriz[indiceFilaDestino] = auxiliar;
    }
}

/*
c) (1.5p) Función poderDeMago: Esta función tiene como parámetros la matriz y un número que representa la fila de la matriz, y por
tanto a un mago. Devuelve la suma de todos los poderes de dicho mago. Si se le pasa un valor de mago no existente lanzará una
excepción tipo WizardException (créala tú) con el mensaje “Fila no válida”. Debe usar un for extendido.

d) (1p) Como una de las capacidades de los magos es intercambiar su poder, se debe realizar una función denominada
intercambioDePoder a la cual se le pasan la matriz y dos números de fila. No es necesario comprobar rangos. Se valorará hacerlo sin
bucles. No devuelve nada.
*/
