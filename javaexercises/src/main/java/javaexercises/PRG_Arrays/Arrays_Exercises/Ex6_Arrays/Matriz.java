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
package javaexercises.PRG_Arrays.Arrays_Exercises.Ex6_Arrays;

public class Matriz {

    public int[][] numerosEnteros; 
    //CONSTRUCTORES
    /**
     * Constructor que inicializa un matriz con un numero aleatorio
     * en cada posición
     * @param n Determina la longitud de la matriz
     */
    public Matriz(int n){
        this.numerosEnteros = new int[n][n];
        for (int i = 0; i < numerosEnteros.length; i++) {
            for (int j = 0; j < numerosEnteros[i].length; j++) {
                numerosEnteros[i][j] = (int)((Math.random() * 10));
            }
        }
    }
    //MÉTODOS
    /**
     * Muestra la matriz en forma de tabla
     * @param tabla matriz a mostrar
     */
    public static void mostrarMatriz(int[][] tabla){
        String espacio = "";
        System.out.printf("%4s", espacio);
        for (int i = 0; i <= tabla.length; i++) {
            System.out.printf("%4d", i+1);
        }
        System.out.println();
        int k = 1;
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%4d", k);
            k++;
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        } 
    }
    /**
     * Suma cada elemento de la matriz
     * @return el resultado de la suma
     */
    public int sumarElementosMatriz(){
        int acumulador = 0;
        for (int i = 0; i < numerosEnteros.length; i++) {
            for (int j = 0; j < numerosEnteros[i].length; j++) {
                acumulador += numerosEnteros[i][j];
            }
        }
        return acumulador;
    }
    /**
     * Fn sobrecargada que suma la diagonal de la matriz
     * @param flag true suma la diagonal, false suma el resto de elementos
     * @return la suma de la diagonal o la suma del resto de elementos
     */
    public int sumarDiagonal(boolean flag){
        int acumulador = 0;
        for (int i = 0; i < numerosEnteros.length; i++) {
            if (!flag) {
                acumulador += numerosEnteros[i][i];
            } else {
                return sumarElementosMatriz() - sumarDiagonal(false);
            }
        }
        return acumulador;
    }
    /**
     * Suma los elementos de la fila seleccionada
     * @param numeroFila numero de fila de la que quieres sumar los elementos
     * @return la suma de los elementos de dicha fila
     */
    public int sumarElementosFila(int numeroFila){
        int acumulador = 0;
        if (numeroFila < 0 || numeroFila > numerosEnteros.length) {
            return -1;
        } else{
            for (int i = 0; i < numerosEnteros[numeroFila].length; i++) {
                acumulador += numerosEnteros[numeroFila][i];
            }
            return acumulador;
        }
    }
    /**
     * Elimina de la matriz la fila seleccionada
     * @param numerosEnteros matriz de numeros enteros
     * @param filaBorrar numero de la fila a eliminar
     * @return la matriz modificada sin la fila correspondiente
     */
    public int[][] borrarFila(int[][] numerosEnteros, int filaBorrar){
        if (filaBorrar < 0 || filaBorrar >= numerosEnteros.length) {
            return numerosEnteros;
        }
        int[][] tablaModificada = new int[numerosEnteros.length -1][numerosEnteros[0].length];
        int j = 0;
        for (int i = 0; i < numerosEnteros.length; i++){
            if (i == filaBorrar) {
                
            } else{
                for (int k = 0; k < numerosEnteros[i].length; k++) {
                    tablaModificada[j][k] = numerosEnteros[i][k];
                }
                j++;
            }
        }
        return tablaModificada;
    }
}
