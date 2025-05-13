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
package javaexercises.PRG_Arrays.Arrays_Exercises.Ex1_Arrays;

public class Ex1_Arrays { @SuppressWarnings("unused")
    public static int[] creaArrayNumeros(int n){
        int[] numerosUsuario = new int[n];
        int numeroAleatorio;
        for (int i = 0; i < numerosUsuario.length; i++){
            numerosUsuario[i] = numeroAleatorio = (int)(Math.random() * 4001) + 1000;
        }
        return numerosUsuario;
    }
    public static void muestraArray(int[] numeros){
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    public static int maximo(int[] numeros){
        int auxiliar = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > auxiliar) {
                auxiliar = numeros[i];
            }
        }
        return auxiliar;
    }
    public static int minimo(int[] numeros){
        int auxiliar = numeros[0];
        for (int numero : numeros) {
            if (numero < auxiliar) {
                auxiliar = numero;
            }
        }
        return auxiliar;
    }
    public static int[] intercambiarDatos(int[] numeros, int indice1, int indice2){
        if (indice1 < 0 || indice1 >= numeros.length || indice2 < 0 || indice2 >= numeros.length){
            return numeros;
        } else {
            int auxiliar = numeros[indice1];
            numeros[indice1] = numeros[indice2];
            numeros[indice2] = auxiliar;
            return numeros;
        }
    }
    public static void main(String[] args) {
        int[] numeros = creaArrayNumeros(10);
        muestraArray(numeros);
        System.out.println("Número mayor: " + maximo(numeros));
        System.out.println("Número mínimo: " + minimo(numeros));
        intercambiarDatos(numeros, 1, 10);
    }
}

/*
e) Función a la que se le pasa como parámetros un vector cualquiera de enteros y
dos índices (son dos números enteros) e intercambia los datos que hay en las
posiciones indicadas por los índices. Si hay un error de rango devuelve false si no
devuelve true. Por ejemplo si se le pasa (v, 2, 5) debe intercambiar los datos v [2]
con v[5] siempre que existan dichas posiciones.
*/
