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
package javaexercises.PRG_POO.POO_Adv.Ex2_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //#region VARIABLES
        int dia;
        int mes;
        int año;
        System.out.println("Introduce una fecha");
        System.out.print("Introduce el día: ");
        dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        int dia2;
        int mes2;
        int año2;
        System.out.println("Introduce una fecha");
        System.out.print("Introduce el día: ");
        dia2 = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes2 = sc.nextInt();
        System.out.print("Introduce el año: ");
        año2 = sc.nextInt();
        //#endregion
        //#region OBJ
        Fecha fecha = new Fecha(dia, mes, año);
        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAño(año);
        System.out.println(fecha.fechaFormateada(true));
        System.out.println(fecha.fechaFormateada(false));

        Fecha fecha2 = new Fecha(dia2, mes2, año2);
        fecha2.setDia(dia2);
        fecha2.setMes(mes2);
        fecha2.setAño(año2);
        System.out.println(fecha2.fechaFormateada(true));
        System.out.println(fecha2.fechaFormateada(false));
        System.out.println(Fecha.diferenciaFechas(fecha, fecha2));
        sc.close();
        //#endregion
    }
}
