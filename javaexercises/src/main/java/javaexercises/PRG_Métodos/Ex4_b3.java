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
public class Ex4_b3 {
    /**
     * Es bisiesto o no
     * @param year Introducir el año
     * @return si es bisiesto(true) o no (false)
     */
    public static boolean isBisiesto(int year){
        return year % 400 == 0 ? true : year % 100 == 0 ? false : year % 4 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        String opcion;
        do{
            System.out.print("Introduce el año: ");
            year = sc.nextInt();
            if (isBisiesto(year)) {
                System.out.println("El año es bisiesto");
            } else{
                System.out.println("El año no es bisiesto");
            } 
            System.out.print("Quieres introducir otro año (S/N): ");
            sc.nextLine();
            opcion = sc.nextLine().toUpperCase();
        } while (opcion.equals("S"));
    }
}

/*
4. a) Función año bisiesto. Realizar una función denominada bisiesto a la cual se le
pasa un año como parámetro y devuelve true si dicho año es bisiesto y false en
caso contrario.
Un año es bisiesto cuando:
• Es múltiplo de 4 (P. ej 1984)
• Pero los múltiplos de 100 no lo son (Por ejemplo 1800)
• Salvo si a su vez son múltiplos de 400 que caso sí lo son (p. ej. 2000)
b) En el programa principal se hará un bucle que pida continuamente años al
usuario hasta que introduzca el año 0 momento en el cual el programa termina.
*/
