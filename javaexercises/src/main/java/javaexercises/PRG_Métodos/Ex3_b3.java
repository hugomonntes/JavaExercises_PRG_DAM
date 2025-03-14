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

public class Ex3_b3 { 
    /**
     * Pide un dato compr que sea pos  lo devuelve
     * @return dato introducido por el usuario
     */
    public static int pedirDato() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Introduce un numero: ");
            number = sc.nextInt();
        } while (number < 0);
        sc.close();
        return number;
    }

    /**
     * Calcula la superficie de un Cilindro
     * @param radio Radio del cil
     * @param altura Alt del cil
     * @return el resultado del area
     */
    public static double superficieCilindro(int radio, int altura) {
        return 2 * radio * altura * Math.PI;
    }
    /**
     * Muestra el resultado un mensaje más un dato real con 2 decimales
     * @param msg
     * @param resultadoArea
     */
    public static void mostrarDato(String msg, double resultadoArea) {
        System.out.printf("%s %.3f \n", msg, resultadoArea);
    }
    public static void main(String[] args) {
        int altura = pedirDato();
        int radio = pedirDato();
        double calcularArea = superficieCilindro(radio, altura);
        mostrarDato("La superficie es de: ", calcularArea);
    }
}

/*
3. Realiza un programa que halle la superficie de un cilindro sabiendo que:
Superficie=2*π*radio*altura
Debe constar de 3 métodos:

• pedirDato: pide un dato real usuario comprobando que sea un valor
positivo. Al final devuelve dicho dato.

• superficieCilindro: Se le pasa como parámetros el radio y la altura,
hace el cálculo de la superficie y lo devuelve (sin nada de interfaz de
usuario).

• mostrarDato: Función que tiene un real como parámetro y un String.
Muestra en la misma línea el String y a continuación el real con 3
decimales. No devuelve nada.

Por tanto en el programa principal (main) solo debe llamarse a los tres
funciones (y declarar variables auxiliares para recoger los datos). Dos veces
al primero para
pedir primero radio y después la altura, luego se llama al segundo para hacer
el
cálculo, y finalmente se llama al tercero para mostrar el resultado. Si lo
necesitas
usa variables intermedias para quedar con resultados de las funciones.
*/
