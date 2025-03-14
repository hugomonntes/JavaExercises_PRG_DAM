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
public class Main {
    public static void main(String[] args) {
        Directivo directivo = new Directivo();
        Empleado empleado1 = new Empleado("Fran", "Martinez", 32, "123456789V", 1900.0);
        Empleado empleado2 = new Empleado("Jaime", "Perez", 20, "987456321Z", 1300.0);
        Empresa empresa = new Empresa(directivo, empleado1, 200000);
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú Principal:");
            System.out.println("1- Ver datos empleados");
            System.out.println("2- Ver datos directivo");
            System.out.println("3- Modificar datos");
            System.out.println("4- Pagar");
            System.out.println("5- Cobrar");
            System.out.println("6- Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Salir del programa");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);
        sc.close();
    }
    /*
    A continuación se plantea un menú con las siguientes opciones:
    1. Ver datos empleados: Submenú que pregunta si se desean ver todos los
    datos de ambos empleados o solo un dato de ambos empleados (se usarán
    los métodos correspondientes). Este submenú tendrá un apartado salir. Este apartado debe estar en una función aparte.
    2. Ver datos directivo: Mostrará los datos del directivo incluido el beneficio final en euros.
    3. Modificar datos: Submenú que pregunta por el cambio en directivo o uno de
    los empleados. Este apartado debe estar en una función aparte.
    4. Pagar: Se disminuyen las ganancias de la empresa según lo que cobren los
    empleados. Se muestra el valor antes y después de pagar.
    5. Cobrar: Simplemente se pide una valor al usuario que incrementa en el
    campo ganancias. Se muestra el valor antes y después de pagar.
    6. Salir: Como siempre, el programa no terminará hasta que se selecciones
    esta opción.
    */
}

