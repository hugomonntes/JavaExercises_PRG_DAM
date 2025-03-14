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

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;

public class Ex7_b3 {
    /**
     * Lee el archivo indicado en el parametro
     * @param fileName Ruta del archivo que necesitas leer
     * @return  el contenido del Archivo.
     * @throws Exception
     */
    public static String readFile(String fileName) throws Exception{
        Scanner f = new Scanner(new File(fileName));
        String contentFile = "";
        while (f.hasNext()) {
            contentFile = f.nextLine();
         //   System.out.println(contentFile);
        }
        f.close();
        return contentFile;  //TODO devuoleve solo la última linea
    }
    /**
     * Lee el archivo y reescribe el archivo añadiendole el mensaje
     * @param fileName Ruta del archivo que necesitas leer
     * @param msg Mensaje a añadir al final del Archivo
     * @return devuelve el contenido del Archivo más el mensaje
     * @throws Exception
     */
    public static void appendFile(String fileName, String msg) throws Exception {
        PrintWriter fwritter = new PrintWriter(fileName);
        String content = readFile(fileName) + "\n" +  msg; // Leer contenido y añadir el msg
        fwritter.print(content + msg); // ReEscribir el archivo
        fwritter.close();
    }
    /**
     * 
     * @param fileName Ruta del archivo que necesitas leer
     * @param isAdd Boolean si el mensaje se añade si es true o no si es false
     * @throws Exception
     */
    public static void appendFile2(String fileName, String msg) throws Exception{//TODO no añade el parametro
        PrintWriter f = new PrintWriter(new FileWriter(fileName, true));
        f.close();
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String msg; // Almacena mensaje del user
        System.out.print("Introduce un mensaje: ");
        msg = sc.nextLine();
        sc.close();
        appendFile2("PRG_Archivos/Ex7_b3.txt", "hola");
    }
}

/*
**7. a) Haz una función llamada saveFile a la cual se le pasa una cadena que
representa el nombre de un archivo. Dicha función debe leer un archivo
completo y
devolverlo como string.
Para probarla en el main usa el archivo del ejercicio 2.
b) Realiza una función denominada appendFile a la que se le pasan dos
cadenas, la
primera es el nombre de un archivo y la segunda es un texto que debe añadir
al
final del archivo. Para ello primero lee el archivo, concatena la nueva
cadenas y lo
guarda de nuevo. Utiliza la función creada en (a) para la lectura.
c) Realiza una función denominada appendFile2 que hace lo mismo que la
realizada
en (b) pero usando el método explicado en el Apéndice II de los apuntes.
*/
