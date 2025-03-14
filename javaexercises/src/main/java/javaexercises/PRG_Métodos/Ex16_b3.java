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

import java.time.LocalDate;
import java.util.Scanner;

public class Ex16_b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        int año;
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaEspecifica = LocalDate.of(año, mes, 1);
        LocalDate meses = LocalDate.of(año, mes, 1);
        for (int i = 0; i <= mes; i++) {
            System.out.println(meses);
        }
    }
}

/*
16. Calendario Perpetuo: Escribir un programa mediante subrutinas que permita
ver el mes de cualquier año de la forma
    L M X J V S D
    1 2 3 4 5
    6 7 8 9 10 11 12
    …
    27 28 29 30
El usuario indicará únicamente mes y año que desea visualizar. Para saber en qué
día de la semana correspondiente a una fecha dada se debe buscar en la web ya
que hay varios válidos. Una vez encontrado el algoritmo se usará para obtener el
primer día del mes y el resto se colocan a partir de este.
Da la posibilidad de guardar el mes en un archivo.
*/
