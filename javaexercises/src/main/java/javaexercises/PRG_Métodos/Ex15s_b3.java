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

public class Ex15s_b3 {
    /**
     * Genera el tipo de Personaje de modo aleatorio
     * @return PJ es bandido o PJ es cliente
     */
    public static String generarPj(){
        int numeroAleatorio = (int) (Math.random()*2);
        return numeroAleatorio == 0 ? "Bandido" : "Cliente";
    }
    /**
     * Genera la probabilidad del 50% para perder una vida
     * @return un número 0 o 1;
     */
    public static int probabilidadMedia(){
        return (int) (Math.random()*2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //#region VARIABLES DE INICIO
        int opcionPuerta;
        String opcionDisparo;
        boolean shoot;
        int contadorDinero = 5;
        int numeroVidas = 3;
        int contadorClientes = 0;
        //#endregion
        while (contadorDinero > 0) {
            int probabilidad = probabilidadMedia();
            String caracterPj = generarPj();
            System.out.print("Elige una puerta 1 o 2: ");
            opcionPuerta = sc.nextInt();
            sc.nextLine();
            System.out.print("Quieres disparar(s/n): ");
            opcionDisparo = sc.nextLine();
            shoot = opcionDisparo.equals("s") ? true : false;
            System.out.printf("En la puerta había: %s \n", caracterPj);
            if (shoot && caracterPj.equals("Cliente")) {
                if (probabilidad == 1) {
                    numeroVidas--;
                }
                contadorDinero--;
            } else if (!shoot && caracterPj.equals("Bandido")){
                if (probabilidad == 1) {
                    numeroVidas--;
                }
            } else if (!shoot && caracterPj.equals("Cliente")) {
                contadorClientes++;
                if (contadorClientes % 3 == 0) {
                    System.out.println("Has ganado una vida extra");
                    numeroVidas++;
                }
            } else if (shoot && caracterPj.equals("Bandido")) {
                contadorDinero++;
            }
            System.out.println(contadorDinero + " Puntos");
            System.out.println(numeroVidas  + " Vidas");
        }
    }
}
/*
15. West Bank: Eres el valeroso sheriff de un perdido pueblo del viejo oeste y te
has enterado que una horda de bandidos ha decidido atracar el banco. Dicho banco
tiene tres puertas de entrada numeradas como 1 y 2. En el juego llegan bandidos o
clientes y debes actuar en consecuencia. Para ello la secuencia de juego será de
esta manera:
El sheriff (usuario) elige puerta (1 o 2) y si dispara o no.
Alguien abre una puerta aleatoria (1 o 2). Puede ser una bandido o un cliente.
Si la puerta del sheriff coincide con la de la persona que entra y este es un bandido
sucede lo siguiente:
• Si el sheriff había decidido disparar, mata al bandido y gana 1 punto.
• Si el sheriff había decidido no disparar tiene un 50% de probabilidad de
perder una vida (el juego comienza con 3 vidas).
Si la puerta del sheriff coincide con la de la persona que entra y este es un cliente
sucede lo siguiente:
• Si el sheriff había decidido disparar, tiene un 50% de posibilidades de matar
al cliente. En caso de matarlo pierde una vida.
• Si el sheriff había decidido no disparar el cliente puede entrar sin problema.
Por cada 3 clientes que entran se le da al sheriff una vida extra.
Busca modificaciones en probabilidades para hacer el juego lo más entretenido
posible.
Nota: La idea de este juego está basada de forma muy básica en el West Bank de
Dinamic o Bank Panic! de Sega
*/
