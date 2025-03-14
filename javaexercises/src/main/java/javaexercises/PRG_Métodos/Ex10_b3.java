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

public class Ex10_b3 {
    /**
     * Calcula el area de la figura indicada
     * @param base
     * @param altura
     * @param flag Dependiendo si la flag es true or false se realiza el area de una figura u otra
     * @return valor del Area de la figura seleccionada
     */
    public static int calcularArea(int base, int altura, boolean flag) {
        return flag ? base * altura : base * altura / 2;
    }
    /**
     * Calcula el area de circulo
     * @param radio
     * @return devuelve valor Area del Circulo
     */
    public static double calcularAreaCirculo(int radio) {
        return Math.PI * (radio * radio);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int base;
        int altura;
        int radio;
        do {
            System.out.println("1.Area de un triángulo");
            System.out.println("2.Area de un rectángulo");
            System.out.println("3.Area de un cuadrado");
            System.out.println("4.Area de un círculo");
            System.out.println("5.Salir");
            System.out.print("Escoge una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Area de un triángulo");
                    System.out.print("Indica el tamaño de la base: ");
                    base = sc.nextInt();
                    System.out.print("Indica el tamaño de la altura: ");
                    altura = sc.nextInt();
                    System.out.println(calcularArea(base, altura, false));
                    break;

                case 2:
                    System.out.println("Area de un rectángulo");
                    System.out.print("Indica el tamaño de la base: ");
                    base = sc.nextInt();
                    System.out.print("Indica el tamaño de la altura: ");
                    altura = sc.nextInt();
                    System.out.println(calcularArea(base, altura, true));
                    break;

                case 3:
                    System.out.println("Area de un cuadrado");
                    System.out.print("Indica el tamaño del lado: ");
                    base = sc.nextInt();
                    System.out.println(calcularArea(base, base, true));
                    break;

                case 4:
                    System.out.println("Area de un círculo");
                    System.out.print("Indica el tamaño del radio: ");
                    radio = sc.nextInt();
                    System.out.println(calcularAreaCirculo(radio));
                    break;

                case 5:
                    System.out.println("Adiós");
                    break;

                default:
                    System.out.println("Introduce una opción válida!");
                    break;
            }
        } while (opcion != 5);
    }
}

/*
10. a) Realizar un método que permita hallar el área de un rectángulo o de un
triángulo rectángulo a partir de la base, la altura y un parámetro booleano
(denominado bandera, flag o interruptor) para decidir si se trata de un
rectángulo o
un triángulo. Es decir, si se pasa como parámetro true hace el cálculo del
área de
un rectángulo, si se pasa false calcula el del triángulo.

Devuelve el área. Parámetros del método: base, altura y la bandera

b) En el main codificar un menú clásico con las siguientes opciones:
• Area de un triángulo (base*altura/2)
• Area de un rectángulo (base*altura)
• Area de un cuadrado (lado*lado)
• Area de un círculo (Pi*radio 2)
• Salir
Las tres primeras opciones deben realizarse utilizando el método creado en el
apartado anterior (por supuesto, sin modificarlo). Para la cuarta debe
crearse un nuevo método con parámetro radio.
*/
