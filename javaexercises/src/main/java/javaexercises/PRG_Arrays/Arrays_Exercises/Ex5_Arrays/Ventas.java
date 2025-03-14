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

import java.time.LocalDate;

public class Ventas {
    public int[] ventasAnuales = new int[12]; // 12 por los meses de año
    private int año;

    /**
     * Establece el valor de la propiedad año
     * 
     * @param año El año en el que calcular las ventas
     */
    public void setAño(int año) {
        if (año >= LocalDate.now().getYear()) {
            this.año = LocalDate.now().getYear() - 1;
        } else {
            this.año = año;
        }
    }

    /**
     * Obtiene el valor de la propiedad año
     * 
     * @return el año de ventas
     */
    public int getAño() {
        return año;
    }

    /**
     * Constructor que inicializa el año de venta,
     * genera un numero aleatorio de ventas por mes
     * 
     * @param año Año de ventas
     */
    public Ventas(int año) {
        setAño(año);
        for (int i = 0; i < ventasAnuales.length; i++) {
            ventasAnuales[i] = (int) (Math.random() * 1000);
        }
    }

    /**
     * Constructor sobrecargado que inicializa el año de venta,
     * si el array de ventasAnuales tiene un tamaño distinto a 12,
     * genera ventas anuales aleatorias para cada mes,
     * si el array tiene exactamente 12 elementos se asigna su valor directamente.
     * 
     * @param año           Año de ventas
     * @param ventasAnuales Array que almacena las ventas aleatorias de cada mes en
     *                      su respectivo orden.
     */
    public Ventas(int año, int[] ventasAnuales) {
        setAño(año);
        if (this.ventasAnuales.length != 12) {
            for (int i = 0; i < ventasAnuales.length; i++) {
                ventasAnuales[i] = (int) (Math.random() * 1000);
            }
        } else {
            this.ventasAnuales = ventasAnuales;
        }
    }

    // MÉTODOS
    /**
     * Calcula la media de las ventas del año
     * 
     * @return la media de las ventas del año
     */
    public double calcularMedia() {
        double acumulador = 0;
        for (int i = 0; i < ventasAnuales.length; i++) {
            acumulador += ventasAnuales[i];
        }
        return acumulador / ventasAnuales.length;
    }

    /**
     * Muestra una gráfica representando el año, el mes con sus respectivo numero de
     * ventas,
     * y una grafica con # para representar cada centena de unidades en las ventas.
     */
    public void mostrarGrafica() {
    System.out.print("Año: " +getAño());
        int unidades;
        for (int i = 0; i < ventasAnuales.length; i++) {
            unidades = ventasAnuales[i]/100 + 1;
            System.out.printf("\nMes %2d)",i + 1,"("+ ventasAnuales[i]);
            for (int j = 0; j < unidades; j++) {
                System.out.print("#");
            }
        }
    }
}
