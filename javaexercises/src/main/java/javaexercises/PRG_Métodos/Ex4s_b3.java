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
// import java.io.FileWriter;
// import java.io.PrintWriter;

// public class Ex4s_b3 {
//     public static void bucles(){
//         for (int i = 40; i >= 5; i--) {
//             if (i % 2 != 0) {
//                 System.out.println(i);
//             }
//         }
//         int acumulador = 1;
//         for (int i = 1; i < 10; i++) {
//             if (i % 2 == 0) {
//                 acumulador *= i;
//                 System.out.println(acumulador);
//             }
//         }
//     }
// <<<<<<< HEAD
//     public static void mostrarPiramide(){
//         // for (int i = 10; i >= 1; i--) {
//         //     for (int j = i; j >= 1; j--) {
//         //         System.out.printf("%2d", j);
//         //     }
//         //     System.out.println();
//         // }

//         for (int i = 1; i <= 10; i++) {
//             for (int j = i; j <= 10; j++) {
//                 System.out.printf(" ");
//             }
//             for (int a = i; a <= 10; a++) {
//                 System.out.printf("*");
//             }
//             System.out.println();
//         }
// =======
//     public static void mostrarPiramide() throws Exception {
//         PrintWriter fWriter = new PrintWriter(new FileWriter("piramide.txt"));
//         for (int i = 10; i >= 1; i--) {
//             for (int j = i; j >= 1; j--) {
//                 System.out.printf("%2d", j);
//                 fWriter.printf("%2d", j);
//             }
//             System.out.println();
//             fWriter.printf("\n");
//         }
//         fWriter.close();
// >>>>>>> d3601f6910a4028e07e97b534f622a8347688640
//     }
//     public static void main(String[] args) throws Exception {
//         mostrarPiramide();
//     }
// }
