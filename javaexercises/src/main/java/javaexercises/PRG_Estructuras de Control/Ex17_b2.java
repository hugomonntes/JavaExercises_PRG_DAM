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

public class Ex17_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int acumulador = 0;
        boolean opcionRepetir = true;
        String opcion;
        
        do{
            do {
                System.out.print("Introduce un número entre 1 y 50: ");
                numero = sc.nextInt();
                if (numero < 1 || numero > 50) {
                    System.out.println("❌ Error, el número debe estar entre 1 y 50.");
                }
            } while (numero < 1 || numero > 50);

            for(int i = 1; i <= 100; i++){
                if(i % numero == 0){
                    System.out.println(i);
                    acumulador += i;
                };
            }
            System.out.println("La suma total es: " + acumulador);
            acumulador = 0;
            System.out.print("Quieres continuar? (S/N): ");
            sc.nextLine();
            opcion = sc.nextLine().toUpperCase();
            if (opcion.equals("S")){
                opcionRepetir = true;
            } else if(opcion.equals("N")){
                opcionRepetir = false;
                System.out.println("Adiós!");
            } else {
                System.out.println("❌ Introduce un carácter válido!");
                opcionRepetir = false;
                opcionRepetir = false;
            }
        }
        while (opcionRepetir);
    }
}

/*
17.a) Escribir un programa que muestre por pantalla los múltiplos de 5 entre 1 y
100 y la suma de los mismos (Si lo ves claro, puedes hacer directamente el
apartado (b) y saltarte el (a)).

b) A continuación debe pedir un número entre 1 y 50 y mostrará los múltiplos
entre 1 y 100 de dicho número y la suma de los mismos. Permitirá la repetición
del programa (solo del apartado b).

Ejemplo:
Introduzca nº entre 1 y 50: 25
25, 50, 75, 100
La suma de los múltiplos es: 250
Desea probar otro número (S/N)? N
*/
