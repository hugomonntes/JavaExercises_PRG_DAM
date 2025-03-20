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
public class Ex12_b2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            System.out.println(i);
        }
        System.out.println(" \n_________________ \n");

        for(int i = 50; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println(" \n_________________ \n");

        for(int i = 2; i < 20; i = i + 2){
            System.out.println(i);
        }
        System.out.println(" \n_________________ \n");

        for(int i = 91; i <= 130; i = i + 2){
            System.out.println(i);
        }
        System.out.println(" \n_________________ \n");
        
        for(int i = 70; i >= 25; i = i - 5){
            System.out.println(i);
        }
    }
}

/*
12.Realizar un programa que saque los siguientes datos por pantalla (usa bucles
for y haz en un único programa todos los apartados).
a) Los números del 1 al 50.
b) En orden inversa del 50 al 1
c) Los números pares menores que 20 por orden creciente (2, 4, 6, 8, ... 16,
18)
d) Los números impares entre lo 90 y el 130 por orden creciente
e) Los múltiplos de 5 entre el 70 y el 25 por orden decreciente (70, 65, ...
30,25).
*/
