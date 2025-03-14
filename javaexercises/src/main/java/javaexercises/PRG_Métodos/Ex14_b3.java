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

public class Ex14_b3 {
    /**
     * Muestra por pantalla el menu y reliza la suma de dos numeros aleatorios
     * @param jugador Se introduce si juega la CPU o un Jugador
     * @return la suma de los dos numeros aleatorios
     */
    public static double tirarDados(String jugador) {
        double dado1 = Ex13_b3.tirarDado(6);
        double dado2 = Ex13_b3.tirarDado(6);
        double resultadoDados = dado1 + dado2;
        System.out.printf("%s tira los dados...\n", jugador);
        System.out.printf("Dado 1: %.0f \n", dado1);
        System.out.printf("Dado 2: %.0f \n", dado2);
        System.out.printf("Suma: %.0f \n", resultadoDados);
        return resultadoDados;
    }
    /**
     * Comprueba si el jugador gana o no
     * @param resultado Numero aleatorio 
     * @return el resultado de si gano o no
     */
    public static double comprobacion(double resultado) {
        if (resultado == 7 || resultado == 11) {
            return 0; 
        } else if (resultado == 2 || resultado == 3 || resultado == 12) {
            return -1;
        } else {
            return resultado;
        }
    }

    public static void main(String[] args) {
        double resultadoJugador = tirarDados("Jugador");
        double puntuacionJugador = comprobacion(resultadoJugador);

        if (puntuacionJugador == 0) {
            System.out.println("¡El jugador gana en la primera tirada!");
            return;
        } else if (puntuacionJugador == -1) {
            System.out.println("El jugador pierde. Gana la CPU.");
            return;
        }

        double resultadoCPU = tirarDados("CPU");
        double puntuacionCPU = comprobacion(resultadoCPU);
        
        if (puntuacionCPU == 0) {
            System.out.println("¡La CPU gana en la primera tirada!");
        } else if (puntuacionCPU == -1) {
            System.out.println("La CPU pierde! Gana el Jugador.");
        } else {
            if (puntuacionJugador > puntuacionCPU) {
                System.out.println("¡El Jugador gana!");
            } else if (puntuacionJugador < puntuacionCPU) {
                System.out.println("¡La CPU gana!");
            } else {
                System.out.println("Empate");
            }
        }
    }
}
