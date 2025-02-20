package javaexercises.PRG_Métodos;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex5_b3 {
    /**
     * Escribe datos en un archivo nuevo.
     * @param userYear
     * @throws Exception
     */
    public static void escribirBisiestosFile(int userYear) throws Exception {
        PrintWriter f = new PrintWriter("PRG_Archivos/Ex5_b3.txt");
        if (Ex4_b3.isBisiesto(userYear)) {
            f.printf("%d Si es bisiesto \n", userYear);
        } else {
            f.printf("%d No es bisiesto \n", userYear);
        }
        //Escribir numeros bisiestos hasta año actual.
        for(int i = userYear; i <= 2024; i++){
            if (Ex4_b3.isBisiesto(i)){
                f.println(i);
            }
        }
        f.close();
    }
    /**
     * Lee Archivo indicado en el parametro
     * @param fileName
     * @return el contenido del archivo
     * @throws Exception
     */
    public static String leerBisiestosFile(String fileName) throws Exception{
        Scanner file = new Scanner(new File(fileName));
        String contentFile = ""; // Almacena los datos del archivo 
        file.nextLine(); // Salto de la primera línea para que no la lea
        while (file.hasNext()) { // Bucle que lee todas las líneas de archivo (Excepto la primera)
            contentFile = file.nextLine();
            System.out.printf("%6s;", contentFile);
        }
        System.out.println(); // Salto de línea
        file.close();
        return contentFile;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int userYear;
        System.out.print("Introduce un año: ");
        userYear = sc.nextInt();
        escribirBisiestosFile(userYear);
        leerBisiestosFile("PRG_Archivos/Ex5_b3.txt");
    }
}

/*
**5. Haz un programa que realice las siguientes tareas:
Pide un año al usuario y guarda en un archivo dicho año en la primera línea
indicando si es o no bisiesto y a continuación todos los bisiestos desde ese
año hasta el año actual (cada uno en una línea).
Un ejemplo de como puede quedar el archivo:
2015 No es bisiesto.
2016
2020
2024

A continuación lee el archivo y muestra en pantalla todos los años menos el
primero. Debe estar separados por comas en la misma linea y ocupando 6
caracteres.
Si este programa lo tienes en la misma carpeta que el de bisiesto no es
necesario
que copies la función, puedes acceder a ella poniendo
NombreClase.nombreFuncion.
Por ejemplo:
Bol3Ejer4.bisiesto(2024);
 */