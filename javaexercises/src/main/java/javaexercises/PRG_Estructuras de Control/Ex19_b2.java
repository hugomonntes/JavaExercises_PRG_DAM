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

public class Ex19_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAstersicos;
        String asterisco = "*";
        String space = " ";
        String opcionD;

        System.out.print("Introduce el numero de asteriscos: ");
        numeroAstersicos = sc.nextInt();
        System.out.print("Introduce Derecha o Izquierda (D/I): ");
        sc.nextLine();
        opcionD = sc.nextLine();

        if (opcionD.equals("d")) {
            for (int i = 0; i <= numeroAstersicos; i++) {
                System.out.println(asterisco);
                for (int contadorEspacios = 0; contadorEspacios <= i; contadorEspacios++) {
                    System.out.print(space);
                }
            }
        }
        if (opcionD.equals("i")) {
            for (int i = 0; i < numeroAstersicos; i++) {
                for (int contadorEspacios = (numeroAstersicos - i); contadorEspacios > 0; contadorEspacios--) {
                    System.out.print(space);
                }
                System.out.println(asterisco);
            }
        }
    }
}

/*
19.a) Realizar un programa que dibuje una ristra de N asteriscos en pantalla
(N es
un número introducido polo usuario).
Ejemplo:
Cuantos asteriscos deseas dibujar? 10
b) Repetirlo pero dibujando la ristra en diagonal. El usuario escogerá se la
dibuja de izquierda la derecha o de derecha la izquierda.
*/
