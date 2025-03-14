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
package javaexercises.PRG_Arrays.Arrays_Exercises.Ex5_Arrays;

import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File archivo = new File("ventas.txt");
        int[] ventasFinales = new int[12];
        int añoActual = LocalDate.now().getYear();
        if (args.length != 0) {
            archivo = new File(args[0]);
        }
        if (archivo.exists()) {
            Scanner leerArgs = new Scanner(archivo);
            String añosArgs = leerArgs.nextLine();
            args = leerArgs.nextLine().split(";");
            leerArgs.close();
            for (int i = 0; i < args.length; i++) {
                int ventas = Integer.parseInt(args[i]);
                ventasFinales[i] = ventas;
            }
            int año = Integer.parseInt(añosArgs);
            Ventas ventaArgs = new Ventas(año, ventasFinales);
            ventaArgs.mostrarGrafica();
            System.out.println();
            System.out.printf("%.2f", ventaArgs.calcularMedia());
        } else {
            Ventas segundaVenta = new Ventas(añoActual - 1);
            segundaVenta.mostrarGrafica();
            System.out.println();
            System.out.printf("%.2f", segundaVenta.calcularMedia());
            System.out.println();
            File escribirArchivo = new File("ventas" + (añoActual - 1) + ".txt");
            PrintWriter escribir = new PrintWriter(escribirArchivo);
            escribir.print(añoActual - 1 + "\n");
            int[] datos = segundaVenta.ventasAnuales;
            for (int i = 0; i < datos.length; i++) {
                escribir.printf("%d ; ", datos[i]);
            }
            escribir.close();
        }
    }
}
