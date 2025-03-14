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

public class Ex12_b3 {
    /**
     * Genera un carácter aleatorio entre 1, X o 2
     * @return 1 X 2
     */
    public static char generarQuinielaNormal() {
        double numeroAleatorio = Math.ceil(Math.random() * 3);
        return numeroAleatorio == 1 ? '1' : numeroAleatorio == 2 ? '2' : 'X';
    }

    /**
     * Genera un carácter aleatorio pero con probalidades diferentes
     * @return 1 (60% de posibilidades), 2 (25% de posibilidades), X (15% de posibilidades)
     */
    public static char generarQuinielaPonderada() {
        double numeroAleatorio = Math.ceil(Math.random() * 100);
        return numeroAleatorio <= 60 ? '1' : numeroAleatorio > 61 && numeroAleatorio <= 85 ? '2' : 'X';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int contador = 1;
        do {
            System.out.println("Elige el tipo de Quiniela");
            System.out.println("1. Quiniela Normal");
            System.out.println("2 .Quiniela Ponderada");
            System.out.println("3. Salir");
            System.out.print("Introduce tu opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    for (int i = 1; i <= 14; i++) {
                        System.out.printf("Partido %2d: %c \n", contador, generarQuinielaNormal());
                        contador++;
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 14; i++) {
                        System.out.printf("Partido %d: %c \n", contador, generarQuinielaPonderada());
                        contador++;
                    }
                    break;
                case 3:
                    System.out.println("Adiós");
            }
        } while (opcion != 3);
    }
}

/*
 * 12. a) Codificar un programa que genere una quiniela aleatoria. Es decir, se
 * deben
 * dar 14 resultados aleatorios como 1, X ó 2 indicando delante el número de
 * partido
 * y los resultados alineados en una columna (no uses \t, si no ajuste con
 * printf ). Se
 * debe realizar al menos una función que devuelva un 1 una X o un 2 (char o
 * String)
 * aleatorio.
 * 
 * b) Realizar la quiniela ponderada, es decir, haz otra función que devuelva 1,
 * X o 2
 * pero que la probabilidad de sacar 1 sea del 60%, la de sacar X sea 25% y la
 * de
 * sacar un 2 sea un 15%.
 * Enel main debes dar a elegir quiniela normal o ponderada.
 * Pista: Sacar un numero aleatorio entre 1 y 100. Si el resultado es menor o
 * igual
 * que 60, se asigna un 1 al resultado, si es entre 61 y 85 (60+25) se le asigna
 * una X
 * y si es entre 86 y 100 se le asigna un 2.
 */
