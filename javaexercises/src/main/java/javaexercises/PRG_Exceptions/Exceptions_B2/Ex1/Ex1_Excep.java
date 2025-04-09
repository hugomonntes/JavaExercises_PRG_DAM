package javaexercises.PRG_Exceptions.Exceptions_B2.Ex1;

public class Ex1_Excep {
    public static String subCadena(String cadena, int inicio, int cantidadCaracteres){  
        String cadenaFinal = "";
        if (cadena == null || inicio < 0 || cantidadCaracteres < 0 || inicio + cantidadCaracteres > cadena.length()) {
            throw new StringOutOfBoundsException("Revisa los parámetros");//TODO pasar indices a la cadena
        } else {
            for (int i = inicio; i < inicio + cantidadCaracteres; i++) {
                cadenaFinal += cadena.charAt(i);
            }
            return cadenaFinal;
        }
    }
    public static void mostrarCentrado(String cadena){
        if (cadena.length() > 80) {
            throw new StringTooLongException(); 
        }
        int anchoTerminal = (80 - cadena.length()); 
        for (int i = 0; i < anchoTerminal / 2; i++) { 
            System.out.print(" ");
        }
        System.out.printf("%s \n", cadena);
    }
    public static void main(String[] args) {
        String cadena = "";
        int inicio = 1;
        int cantidadCaracteres = 5;
        try{
            System.out.println(subCadena(cadena, inicio, cantidadCaracteres));
        } catch (StringOutOfBoundsException e){
            System.out.printf("Error! Has introducido algún parametro mal! Cadena = %s, Inicio = %d, Cantidad de carácteres = %d \n", cadena, inicio, cantidadCaracteres);
        }
        try {
            mostrarCentrado("Hola Currooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo");            
        } catch (StringTooLongException e) {
            System.out.println("Error! Has introducido más de 80 carácteres!");
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