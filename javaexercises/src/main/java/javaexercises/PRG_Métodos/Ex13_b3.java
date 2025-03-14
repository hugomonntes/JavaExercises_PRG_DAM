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

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex13_b3 {
    /**
     * Genera un número del 1 al numero de caras indicado por el usuario
     * 
     * @param numeroCarasDado Numero de caras del dado
     * @return un numero aleatorio entre 1 y el numero máximo de caras
     */
    public static double tirarDado(int numeroCarasDado) {
        double randomNumber = Math.ceil(Math.random() * numeroCarasDado);
        return randomNumber;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String userName;
        int numeroCarasDado;
        double userNumber;
        String volverJugar;
        int contadorNumerosAcertados = 0;
        System.out.print("\n Introduce tu nombre: ");
        userName = sc.nextLine();
        do {
            do {
                System.out.print("Introduce el número de caras del dado: ");
                numeroCarasDado = sc.nextInt();
            } while (numeroCarasDado < 1);
            double dado1 = tirarDado(numeroCarasDado);
            double dado2 = tirarDado(numeroCarasDado);
            while (dado1 == dado2) {
                dado1 = tirarDado(numeroCarasDado);
            }
            for (int i = 0; i < 3; i++) {//TODO usuario no repite nums(do whiles) 
                do {
                    System.out.printf("Introduce un número del 1 al %d: ", numeroCarasDado);
                    userNumber = sc.nextInt();
                } while ((userNumber > numeroCarasDado) || (userNumber < 1));
                if (userNumber == dado1 || userNumber == dado2) {
                    contadorNumerosAcertados++;
                }
            }
            System.out.printf("%s has acertado %d números \n", userName, contadorNumerosAcertados);
            PrintWriter fwriter = new PrintWriter(new FileWriter(
                    "C:\\Users\\Hugo Montes\\Documents\\PRG\\JavaExercises-PRG_Boletin2\\PRG_Archivos\\Records.txt",
                    true));
            fwriter.printf("Nombre: %s,  Numero Caras Dado: %d, Numero Aciertos: %d \n", userName, numeroCarasDado,
                    contadorNumerosAcertados);
            fwriter.close();
            System.out.println("Quieres volver a jugar? (S/N)");
            sc.nextLine();
            volverJugar = sc.nextLine().toUpperCase();
        } while (volverJugar.equals("S"));
    }
}
/*
 * * Dados d20. Realizar un programa que pida al usuario su nombre y 3
 * números distintos al usuario entre 1 y 20 (usar 3 variables) y luego que el
 * ordenador “tira” dos dados de 20 caras. Si el segundo dado sale repetido,
 * debe
 * volver a tirarse hasta que salga distinto.
 * Debe indicar los aciertos que ha tenido el usuario. Evita repetir código
 * haciendo
 * funciones. El usuario debe poder repetir el juego al finalizar.
 * b) Modifica el programa anterior para que el usuario pueda elegir la cantidad
 * de
 * caras de los dados antes de jugar.
 * Además en un archivo de récords debe añadirse en una nueva línea el nombre de
 * usuario, el número de caras del dado ocupando 4 posiciones y los aciertos
 * ocupando 4 posiciones (debes guardar usando printf todo en una nueva línea).
 * Cuando el usuario decida finalizar, antes de terminar el programa se mostrará
 * el
 * archivo de récords entero.
 */
