package javaexercises.PRG_Exceptions.Exceptions_B2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1_Excep {
    public static String subCadena(String cadena, int inicio, int cantidadCaracteres){  
        String cadenaFinal = "";
        if (cadena == null || inicio < 0 || cantidadCaracteres < 0 || inicio + cantidadCaracteres > cadena.length()) {
            throw new IllegalArgumentException();
        } else {
            for (int i = inicio; i < inicio + cantidadCaracteres; i++) {
                cadenaFinal += cadena.charAt(i);
            }
            return cadenaFinal;
        }
    }
    /**
     * Muestra un String centrado en la terminal
     * @param cadena
     */
    public static void mostrarCentrado(String cadena){
        if (cadena.length() > 80) {
            throw new IllegalArgumentException(); 
        }
        int anchoTerminal = (80 - cadena.length()); 
        for (int i = 0; i < anchoTerminal / 2; i++) { 
            System.out.print(" ");
        }
        System.out.printf("%s \n", cadena);
    }
    public static void main(String[] args) {
        try{
            System.out.println(subCadena("Hola Curro", 1, 5));
        } catch (IllegalArgumentException e){
            System.out.println("Error!");
        }
        try {
            mostrarCentrado("Hola_");            
        } catch (IllegalArgumentException e) {
            System.out.println("Error!");
        }
    }
}

/*
1. Modifica el ejercicio 1 del boletín 6a (excepciones) de forma que creas dos
excepciones nuevas que vas a usar sustituyendo a IllegalArgumentException de la
siguiente manera:
En el método muestraCentrado y si el String parámetro tiene más de 80
caracteres lanzará la excepción definida por ti mediante herencia de
IllegalArgumentException del tipo StringTooLongException con el texto “Cadena
demasiado larga” que se lo pasarás al constructor de la clase base mediante super.
En el método subCadena, si los parámetros son inválidos lanzará una excepción
definida por ti mediante herencia de StringOutOfBoundsException pero con un
constructor en el que le pasas un parámetro tipo String. Dicho String el constructor
lo pasa, a su vez, al constructor de la clase base. Desde la función, cuando se lance
la excepción, se le pasa un texto que indique el error de parámetros inválidos y
además informa del valor de los parámetros y del tamaño de la cadena. 
*/