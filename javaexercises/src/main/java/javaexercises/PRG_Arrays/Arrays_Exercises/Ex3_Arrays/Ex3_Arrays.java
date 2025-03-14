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
package javaexercises.PRG_Arrays.Arrays_Exercises.Ex3_Arrays;

import java.util.ArrayList;
public class Ex3_Arrays {
    public static ArrayList<Integer> creaArrayNumeros(int n){
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        for (int i = 0; i < n; i++){
            numerosAleatorios.add((int)(Math.random() * (4001)) + 1000);
        }
        return numerosAleatorios;
    }
    public static void muestraArray(ArrayList<Integer> numeros){
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
    public static int numeroMayor(ArrayList<Integer> numeros){
        int auxiliar = numeros.get(0);
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) >= auxiliar) {
                auxiliar = numeros.get(i);
            }
        }
        return auxiliar;
    }

    public static int numeroMenor(ArrayList<Integer> numeros){
        int auxiliar = numeros.get(0);
        for (Integer numero : numeros) {
            if (numero <= auxiliar) {
                auxiliar = numero;
            }
        }
        return auxiliar;
    }

    public static boolean swapNums(ArrayList<Integer> numeros, int indice1, int indice2){
        if (indice1 < 0 || indice1 >= numeros.size() || indice2 < 0 || indice2 >= numeros.size()){
            return false;
        } else {
            int auxiliar = numeros.get(indice1);
            numeros.set(indice1, numeros.get(indice2));
            numeros.set(indice2, auxiliar);
            return true;
        }
    }
    
    public static ArrayList<Integer> eliminaMayores(ArrayList<Integer> numeros, int limite){
        for (int i = numeros.size() - 1; i >= 0; i--) {
            if (numeros.get(i) > limite) {
                numeros.remove(i);
            }
        }
        return numeros;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = creaArrayNumeros(10);
        muestraArray(numeros);
        System.out.println("Mayor: " + numeroMayor(numeros));
        System.out.println("Menor: " + numeroMenor(numeros));
        System.out.println("Cambio: " + swapNums(numeros, 1, 12));
        System.out.println(eliminaMayores(numeros, 2000));
    }
}


/*
3. Repite el primer ejercicio adaptándolo a un ArrayList<Integer>. Pruébalo con
una colección de 10 elementos en el programa principal.
Añade una función que se le pase un valor como parámetro y elimine de la
colección todos los elementos mayores que dicho parámetro.
*/
