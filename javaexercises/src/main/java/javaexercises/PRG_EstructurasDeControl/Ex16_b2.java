package javaexercises.PRG_EstructurasDeControl;

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

public class Ex16_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIncognita;
        int numeroIntroducido;
        int contadorIntentos;
        boolean acertado;
        boolean seguirJugando = true;
        String opcionJugar;

        do {
            numeroIntroducido = 0;
            contadorIntentos = 5;
            acertado = false;
            System.out.println("___________________\n");
            System.out.println("Turno del Jugador 1");
            System.out.println("___________________\n");

            do { // Filtro para que el player 1 no introduzca numeros fuera de ese rango.
                System.out.print("Introduce el número incógnita del 1 al 100: ");
                numeroIncognita = sc.nextInt();
                if (numeroIncognita < 1 || numeroIncognita > 100) {
                    System.out.println("❌ Error, el número debe estar entre 1 y 100.");
                }
            } while (numeroIncognita < 1 || numeroIncognita > 100);

            for (int i = 0; i < 50; i++) { // Efecto limpiar pantalla.
                System.out.println();
            }

            System.out.println("___________________\n");
            System.out.println("Turno del Jugador 2 (Tienes 5 intentos)");
            System.out.println("___________________\n");

            while (contadorIntentos > 0 && !acertado) { // Condiciones para ganar o no el juego.
                System.out.print("Adivina el número:");
                numeroIntroducido = sc.nextInt();
                if (numeroIncognita == numeroIntroducido) {
                    System.out.printf("✅ ¡Acertaste! ¡Enhorabuena! 🎉🎉 El número era el %d! \n", numeroIncognita);
                    acertado = true;
                } else if (numeroIncognita != numeroIntroducido) {
                    if (numeroIntroducido <= 0 || numeroIntroducido > 100) {
                        System.out.println("❌ Error, el número debe estar entre 1 y 100;");
                    } else {
                        contadorIntentos--;
                        if (numeroIncognita > numeroIntroducido && contadorIntentos > 0) {
                            System.out.printf("❌ ¡Fallaste! Te quedan %d intentos. \n", contadorIntentos);
                            System.out.printf("💡 ¡PISTA! El numero es MAYOR al que introduciste! \n");
                        } else if (numeroIncognita < numeroIntroducido && contadorIntentos > 0) {
                            System.out.printf("❌ ¡Fallaste! Te quedan %d intentos. \n", contadorIntentos);
                            System.out.printf("💡 ¡PISTA! El numero es MENOR al que introduciste! \n");
                        }
                        if (contadorIntentos == 0) {
                            System.out.printf("❌ Perdiste te has quedado sin intentos! El número era: %d \n", numeroIncognita);
                        }
                    }
                }
            }
            System.out.print("Quieres seguir jungando (S/N): ");
            sc.nextLine();
            opcionJugar = sc.nextLine().toUpperCase();
            if (opcionJugar.equals("S")){
                seguirJugando = true;
            } else if(opcionJugar.equals("N")){
                seguirJugando = false;
                System.out.println("Gracias por jugar!");
            } else {
                System.out.println("❌ Introduce un carácter válido!");
                seguirJugando = false;
                seguirJugando = false;
            }
        } while (seguirJugando);
    }
}
/*
 * 16.Realizar el juego Adivina un número entre 1 y 100 para dos personas. El
 * Computador pide un número entre 1 y 100 al jugador 1, luego borra la pantalla
 * y el jugador 2 debe adivinar el número en, como máximo, 5 intentos. Se debe
 * indicar en cada intento si el número a acertar es mayor o menor que el
 * indicado
 * por el jugador 2. Además se informará de los intentos que quedan. Al terminar
 * el juego se debe preguntar si se desea jugar otra partida o terminar el
 * programa. Tanto en la petición al jugador 1 como al jugador 2 si el numero no
 * está en el rango 1 a 100 debe volver a pedirlo y no contar intento
 */

/*
 * Turno del Jugador 1 -- > Introduce un numero del 1 al 100: X
 * Player 2 --> Adivina el número:
 * "Te quedan 4 intentos"
 * Player 2 --> Adivina el número:
 * "Te quedan 3 intentos"
 * Player 2 --> Adivina el número:
 * Player 2 --> Adivina el número:
 * Player 2 --> Adivina el número:
 * if(numero == numero){
 * 
 * }
 * 
 */
