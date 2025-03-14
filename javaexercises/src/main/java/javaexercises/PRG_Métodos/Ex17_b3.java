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

public class Ex17_b3 {
    public static void conversion(int limit, boolean flag){
        String hex = "HEX";
        String dec = "DEC";
        String oct = "OCT";
        if (flag) {
            System.out.printf(" %4s | %4s \n", dec, oct);
            System.out.println("---------------");
            for (int i = 0; i < 10; i++) {
                System.out.printf(" %4d | %4o \n", i, i);
            }
        } else {
            System.out.printf(" %4s | %4s \n", dec, hex);
            System.out.println("---------------");
            for (int i = 0; i < 10; i++) {
                System.out.printf(" %4d | %4h \n", i, i);
            }
        }
    }
    public static void main(String[] args) {
        conversion(100, true);
    }
}
