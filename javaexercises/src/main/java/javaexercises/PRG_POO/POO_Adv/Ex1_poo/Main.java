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
package javaexercises.PRG_POO.POO_Adv.Ex1_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double base = 0;
        double altura = 0;
        boolean isChecked;
        do {
            isChecked = true;
            try {
                System.out.println("Introduce la base: ");
                base = sc.nextInt();
                System.out.println("Introduce la altura: ");
                altura = sc.nextInt();
            } catch (IllegalArgumentException e) {
                System.out.println("Introduce un número!");
                isChecked = false;
                sc.nextLine();
            }
        } while (!isChecked);

        Geometria rectangulo = new Geometria(true, 20, 13);
        Geometria triangulo = new Geometria();
        
        do {
            isChecked = true;
            try {
                triangulo.setAltura(altura);
                triangulo.setBase(base);
            } catch (IllegalArgumentException e) {
                System.out.println("Introduce un número!");
                sc.nextLine();
                isChecked = false;
            }
        } while (!isChecked);
        System.out.printf("Perímetro: %.2f, Área: %.2f, Figura: %s, Base: %.2f, Altura: %.2f", rectangulo.perimetro(),
                rectangulo.area(), rectangulo.tipo(), rectangulo.getAltura(), rectangulo.getBase());
        System.out.printf("\nPerímetro: %.2f, Área: %.2f, Figura: %s, Base: %.2f, Altura: %.2f, Diagonal: %.2f",
                triangulo.perimetro(), triangulo.area(), triangulo.tipo(), triangulo.getAltura(), triangulo.getBase(),
                triangulo.diagonal());
        sc.close();
    }
}
