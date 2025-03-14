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
package javaexercises.PRG_Exams.SegundaEvaluación.P1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magos magos = new Magos();
        int[][] matrizMagos;
        int numeroMagoUsuario = 0;
        boolean isChecked;
        matrizMagos = magos.creaMatriz(11);
        magos.muestraMatriz(matrizMagos); //Mostrar matriz
        do {
            try{
                isChecked = true;
                do {
                    System.out.print("Introduce el mago que quieres: ");
                    numeroMagoUsuario = sc.nextInt();
                    if (numeroMagoUsuario < 0 || numeroMagoUsuario > matrizMagos.length) {
                        isChecked = false;
                    } else {
                        isChecked = true;
                    }
                } while (!isChecked);
                System.out.println("Poder: " + magos.poderDeMago(matrizMagos, numeroMagoUsuario));
            } catch (Exception e){
                System.out.println("Introduce un dato válido");
                isChecked = false;
                sc.nextLine();
            }
            int[] primeraPosicion = matrizMagos[0];
            int[] ultimaPosicion = matrizMagos[matrizMagos.length - 1];
            magos.intercambioDePoder(matrizMagos, primeraPosicion[0], ultimaPosicion[0]);
            magos.muestraMatriz(matrizMagos);
        } while(!isChecked);
    }
}

