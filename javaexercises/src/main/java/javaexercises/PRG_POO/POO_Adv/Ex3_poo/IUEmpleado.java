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
package javaexercises.PRG_POO.POO_Adv.Ex3_poo;

import java.util.Scanner;

public class IUEmpleado {
    Scanner sc = new Scanner(System.in);
    public Empleado empleado;// = new Empleado();

    public IUEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    // #region MÉTODOS MOSTRAR & PEDIR
    public void mostrar() {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellido: " + empleado.getApellido());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Salario Anual: " + empleado.getSalarioAnual());
        System.out.println("IRPF: " + empleado.getIrpf());
        System.out.println("Hacienda: " + empleado.calcularHacienda());
    }

    public void pedir() {
        System.out.print("Introduzca el nombre: ");
        empleado.setNombre(sc.nextLine());
        System.out.print("Introduzca el apellido: ");
        empleado.setApellido(sc.nextLine());
        System.out.print("Introduzca la edad: ");
        empleado.setEdad(sc.nextInt());
        sc.nextLine(); // Salto de línea para INT
        System.out.print("Introduzca el DNI: ");
        empleado.setDni(sc.nextLine());
        System.out.print("Introduzca el salario anual: ");
        empleado.setSalarioAnual(sc.nextDouble());
    }

    public void mostrar(int opcion) {
        switch (opcion) {
            case 1:
                System.out.printf("Nombre: %s, Apellido: %s", empleado.getNombre(), empleado.getApellido());
                break;
            case 2:
                System.out.printf("Edad: %d", empleado.getEdad());
                break;
            case 3:
                System.out.printf("DNI: %s", empleado.getDni());
                break;
            case 4:
                System.out.printf("Salario Anual: %.2f, IRPF: %.2f", empleado.getSalarioAnual(), empleado.getIrpf());
                break;
            case 5:
                System.out.printf("Hacienda: %.2f", empleado.calcularHacienda());
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
    }
    // Se sobrecarga el método de mostrar de forma que se le pasa un int que
    // representa a cada campo: 1-Nombre y Apellidos (los dos juntos), 2-edad, 3-
    // DNI, 4-Salario e IRPF (los dos juntos) y 5-Lo que se lleva hacienda.
    // Mostrará solo el dato indicado en el parámetro.
    // #endregion
}
