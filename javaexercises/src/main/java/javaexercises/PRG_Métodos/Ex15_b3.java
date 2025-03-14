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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex15_b3 {
    public static ArrayList<String> generarJornada() {
        ArrayList<String> equiposLaLiga = new ArrayList<String>(Arrays.asList("FC Barcelona", "Real Madrid",
                "Celta De Vigo", "Atlético de Madrid", "Athletic Club", "Real Sociedad", "Villareal", "Valencia",
                "Sevilla", "Espanyol", "Rayo Vallecano", "Betis", "Deportivo De A Coruña", "Ourense CF"));

        ArrayList<String> partidosJornada = new ArrayList<>();

        while (equiposLaLiga.size() > 1) {
            int numeroAleatorio = (int) (Math.random() * equiposLaLiga.size()); // Numero aleatorio hasta la longitud máxima del array
            String equipo1 = equiposLaLiga.get(numeroAleatorio);
            equiposLaLiga.remove(numeroAleatorio); // Borra del Array el equipo que salió

            int numeroAleatorio2 = (int) (Math.random() * equiposLaLiga.size());
            String equipo2 = equiposLaLiga.get(numeroAleatorio2);
            equiposLaLiga.remove(numeroAleatorio2);

            partidosJornada.add(equipo1 + " vs " + equipo2); // Añade el partido al ArrayList de partidosJornada
        }
        return partidosJornada;
    }

    public static String generarQuiniela() {
        double numeroAleatorio = Math.ceil(Math.random() * 3);
        return numeroAleatorio == 1 ? "1" : numeroAleatorio == 2 ? "2" : "X";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        int saldoInicial = 10;
        boolean jugarDeNuevo = true;
        int contadorJornadas = 1;

        do{
            while (jugarDeNuevo) {
                ArrayList<String> jornadaCompleta = generarJornada(); // Almacena todos los partidos
                System.out.println("\n--- Jornada " + contadorJornadas + " ---");
                System.out.println("Saldo: " + saldoInicial + "€");
                System.out.println("Instrucciones: Escribe '1' si crees que gana el equipo local, 'X' si es empate, o '2' si gana el visitante.");

                for (int i = 0; i < 7; i++) {
                    System.out.println("\nPartido " + (i + 1) + ": " + jornadaCompleta.get(i));
                    System.out.print("Tu predicción (1/X/2): ");
                    opcion = sc.nextLine().toUpperCase();

                    String resultadoFinal = generarQuiniela();
                    System.out.println("Resultado real: " + resultadoFinal);

                    if (resultadoFinal.equals("1")) {
                        System.out.println("¡El equipo local ganó!");
                        if (opcion.equals("1")) {
                            System.out.println("¡Acertaste! El equipo local ganó.");
                            saldoInicial++;
                        } else {
                            System.out.println("Lo siento, perdiste. El equipo local ganó.");
                            saldoInicial--;
                        }
                    } else if (resultadoFinal.equals("X")) {
                        System.out.println("¡Empate!");
                        if (opcion.equals("X")) {
                            System.out.println("¡Acertaste! El partido terminó en empate.");
                            saldoInicial++;
                        } else {
                            System.out.println("Lo siento, perdiste. No hubo empate.");
                            saldoInicial--;
                        }
                    } else {
                        System.out.println("¡El equipo visitante ganó!");
                        if (opcion.equals("2")) {
                            System.out.println("¡Acertaste! El equipo visitante ganó.");
                            saldoInicial++;
                        } else {
                            System.out.println("Lo siento, perdiste. El equipo visitante ganó.");
                            saldoInicial--;
                        }
                    }
                    System.out.println("Tu saldo actual es: " + saldoInicial + "€");
                    System.out.println("---------------------------------------------------------");
                    }
                } 
        } while(saldoInicial > 0); // Cerrar programa si el saldo es 0
        
        while (jugarDeNuevo) {
            ArrayList<String> jornadaCompleta = generarJornada(); // Almacena todos los partidos
            System.out.println("\n--- Jornada " + contadorJornadas + " ---");
            System.out.println("Saldo: " + saldoInicial + "€");
            System.out.println("Instrucciones: Escribe '1' si crees que gana el equipo local, 'X' si es empate, o '2' si gana el visitante.");

            for (int i = 0; i < 7; i++) {
                System.out.println("\nPartido " + (i + 1) + ": " + jornadaCompleta.get(i));
                System.out.print("Tu predicción (1/X/2): ");
                opcion = sc.nextLine().toUpperCase();

                String resultadoFinal = generarQuiniela();
                System.out.println("Resultado real: " + resultadoFinal);

                if (resultadoFinal.equals("1")) {
                    System.out.println("¡El equipo local ganó!");
                    if (opcion.equals("1")) {
                        System.out.println("¡Acertaste! El equipo local ganó.");
                        saldoInicial++;
                    } else {
                        System.out.println("Lo siento, perdiste. El equipo local ganó.");
                        saldoInicial--;
                    }
                } else if (resultadoFinal.equals("X")) {
                    System.out.println("¡Empate!");
                    if (opcion.equals("X")) {
                        System.out.println("¡Acertaste! El partido terminó en empate.");
                        saldoInicial++;
                    } else {
                        System.out.println("Lo siento, perdiste. No hubo empate.");
                        saldoInicial--;
                    }
                } else {
                    System.out.println("¡El equipo visitante ganó!");
                    if (opcion.equals("2")) {
                        System.out.println("¡Acertaste! El equipo visitante ganó.");
                        saldoInicial++;
                    } else {
                        System.out.println("Lo siento, perdiste. El equipo visitante ganó.");
                        saldoInicial--;
                    }
                }
                System.out.println("Tu saldo actual es: " + saldoInicial + "€");
                System.out.println("---------------------------------------------------------");
            }

            System.out.print("\n¿Quieres jugar otra vez? (sí/no): ");
            String respuesta = sc.nextLine().toLowerCase();

            if (respuesta.equals("no") || respuesta.equals("n")) {
                jugarDeNuevo = false;
                System.out.println("\n¡Gracias por jugar! Tu saldo final es: " + saldoInicial + "€");
            } else if (!respuesta.equals("sí") && !respuesta.equals("s")) {
                System.out.println("Respuesta no válida. Terminando el juego.");
                jugarDeNuevo = false;
            }
            contadorJornadas++;
        sc.close();
        }
    }
}
/*
 * partidos almacenados en un array []
 * sacar 6 partidos ramdon
 * generar resultados ramdon de los partidos
 * Hacer menu con 1 X 2
 * Saldo Inicial de 10€
 * incrementa 1€ por partido acertado, si fallas -1€
*/
