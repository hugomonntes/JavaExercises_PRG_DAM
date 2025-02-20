package javaexercises.PRG_Métodos;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex9_b3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number;
        int opcion;
        String fileUser;
        do {
            System.out.println("1.Mostrar numeros primos");
            System.out.println("2.Primos en archivo");
            System.out.println("3.Archivo con primos");
            System.out.println("4.Salir");
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce un número: ");
                    number = sc.nextInt();
                    Ex8_b3.mostrarPrimos(number);
                    break;
                case 2:
                    fileUser = "./PRG_Archivos/Ex9_b3_Numeros.txt";
                    Scanner freader = new Scanner(new File(fileUser));
                    int contenido;
                    while (freader.hasNext()) {
                        contenido = freader.nextInt();
                        System.out.printf(Ex8_b3.isPrimo(contenido) ? "%d es primo \n" : "%d no es primo \n",
                                contenido);
                    }
                    freader.close();
                    break;
                case 3:
                    System.out.println("Introduce un número mayor que 2: ");
                    number = sc.nextInt();
                    PrintWriter fWriter = new PrintWriter("PRG_Archivos/Ex9_b3_case3.txt");
                    for (int i = 2; i <= number; i++) {
                        if (Ex8_b3.isPrimo(i)) {
                            fWriter.print(i + "; ");
                        }
                    }
                    fWriter.close();
                    break;
                case 4:
                    System.out.println("Adiós");
                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }
}

/*
 * 9. Modifica el ejercicio anterior de los números primos (solo el main) de
 * forma
 * que hagas un menú clásico con estas opciones:
 * 1. Mostrar primos menores que uno dado: Esto es lo que ya estaba del
 * ejercicio previo.
 * 2. Primos en archivo: Pide el nombre de un archivo que debe contener
 * números, cada uno en una línea. Lee dicho archivo y muestra dichos números
 * en pantalla diciendo si son o no primos.
 * 3. Archivo con primos: Similar a 1, se le pide un número mayor que 2 al
 * usuario y guarda en un archivo todos los primos desde 2 hasta el que meta el
 * usuario. Estarán todos en la misma línea separados por punto y coma (;).
 * 4 Salir: El programa solo finaliza si se selecciona esta opción.
 */