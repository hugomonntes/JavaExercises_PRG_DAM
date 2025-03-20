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
import java.util.Scanner;
public class Ex8_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int maxNumber;

        System.out.println("Dame tres números");
        System.out.print("Primer número: ");
        firstNumber = sc.nextInt();
        System.out.print("Segundo número: ");
        secondNumber = sc.nextInt();
        System.out.print("Tercer número: ");
        thirdNumber = sc.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            maxNumber = firstNumber;
        } else if (  secondNumber >= thirdNumber) {
            maxNumber = secondNumber;
        } else {
            maxNumber = thirdNumber;
        }

        System.out.printf("El número mayor es: %d \n", maxNumber);
    }
}
