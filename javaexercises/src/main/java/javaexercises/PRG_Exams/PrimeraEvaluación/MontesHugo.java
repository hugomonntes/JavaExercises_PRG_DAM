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
package javaexercises.PRG_Exams.PrimeraEvaluación;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class MontesHugo {
    /**
     * Devuelve un número entero dependiendo si el boolean "FLAG" es verdadero o
     * falso, en caso de verdadero se suman todos los números impares hasta el
     * número introducido en el parámetro "NUMERO", si no se devuelve la suma de los
     * números pares.
     * 
     * @param numero Numero hasta el que quiere operar el usuario
     * @param flag   true para sumar los números impares y false para sumar los
     *               números pares.
     * @return un número entero que es el total de la suma de pares o impares.
     */
    public static int sumas(int numero, boolean flag) {
        int acumulador = 0;
        if (numero < 0) {
            numero = numero * (-1);
        }
        if (flag) {
            for (int i = 1; i < numero; i++) {
                if (i % 2 != 0) {
                    acumulador = acumulador + i;
                }
            }
        } else {
            for (int i = 2; i < numero; i++) {
                if (i % 2 == 0) {
                    acumulador = acumulador + i;
                }
            }
        }
        if (numero == 0) {
            return 0;
        }
        return acumulador;
    }

    public static String notaMusical(int numero) {
        if (numero < 0) {
            numero = numero * (-1);
        }
        if (numero > 7) {
            numero = numero % 8;
        }
        if (numero >= 1 && numero <= 7) {
            switch (numero) {
                case 1:
                    return "DO";
                case 2:
                    return "RE";
                case 3:
                    return "MI";
                case 4:
                    return "FA";
                case 5:
                    return "SOL";
                case 6:
                    return "LA";
                case 7:
                    return "SI";
            }
        }
        return numero == 0 ? "--silencio--" : "";
    }

    public static void tonadillaAleatoria(int numero) throws Exception {
        PrintWriter fWriter = new PrintWriter(new FileWriter("tonadilla.txt"));
        int contador = 0;
        while (contador <= numero) { // Si contador es negativo ya no entra en el bucle osea que no muestra nada la
                                     // función
            int generarNumeroAleatorio = (int) (Math.random() * 24 + 1);
            System.out.println(notaMusical(generarNumeroAleatorio));
            fWriter.println(notaMusical(generarNumeroAleatorio));
            contador++;
        }
        fWriter.close();
    }

    public static void conversion(int numero1, int numero2, boolean flag) {
        int numeroMayor = numero1;
        int numeroMenor = numero2;
        String hex = "HEX";
        String dec = "DEC";
        String oct = "OCT";
        if (numero1 > numero2) {
            numeroMayor = numero1;
            numeroMenor = numero2;
        } else if (numero2 > numero1) {
            numeroMayor = numero2;
            numeroMenor = numero1;
        }
        if (flag) {
            System.out.printf(" %4s | %4s \n", dec, oct);
            System.out.println("---------------");
            for (int i = numeroMenor; i < numeroMayor; i++) {
                System.out.printf(" %4d | %4o \n", i, i);
            }
        } else {
            System.out.printf(" %4s | %4s \n", dec, hex);
            System.out.println("---------------");
            for (int i = numeroMenor; i < numeroMayor; i++) {
                System.out.printf(" %4d | %4h \n", i, i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1 - Sumas");
            System.out.println("2 - Tonadilla Aleatoria");
            System.out.println("3 - Conversión");
            System.out.println("4 - Salir");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int numeroSumas;
                    int sumaDivPar;
                    double sumaDivImpar;
                    System.out.println("Introduce un numero: ");
                    numeroSumas = sc.nextInt();
                    if (numeroSumas != 0) {
                        System.out.println("Llamando a sumas...");
                        sumaDivPar = sumas(numeroSumas, false);
                        System.out.printf("Resultado: %10d \n", sumaDivPar);
                        sumaDivImpar = sumas(numeroSumas, true) / 100;
                        System.out.printf("Resultado: %.2f \n", sumaDivImpar);
                    }
                    break;
                case 2:
                    tonadillaAleatoria(10);
                    break;
                case 3:
                    int n;
                    System.out.println("Introduce un numero entre 0 y 989: ");
                    n = sc.nextInt();
                    if (n < 0 || n > 989) {
                        System.out.println("¡ERROR! Introduce un número válido");
                        while (n < 0 || n > 989) {
                            System.out.println("Introduce un numero entre 0 y 989: ");
                            n = sc.nextInt();
                        }
                    }
                    conversion(n, n + 10, true);
                    conversion(n + 10, n, false);
                    break;
                case 4:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Introduce una opción válida");
                    break;
            }
        } while (opcion != 4);
        sc.close();
        Scanner freader = new Scanner(new File("tonadilla.txt"));
        String contenido;
        while (freader.hasNext()) {
            contenido = freader.nextLine();
            System.err.println(contenido);
        }
        freader.close();
    }
}
