package javaexercises.PRG_Exceptions;

public class Ex4 {
    /**
     * Muestra caracteres de un String
     * @param letras 
     */
    public static void mostrarCaracteres(String letras){//ok
        for (int i = 0; i < letras.length(); i++) {
            System.out.println(letras.charAt(i));
        }
    }
    /**
     * 
     * @param cadena
     * @return 
     */
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
        int anchoTerminal = (80 - cadena.length()); 
        for (int i = 0; i < anchoTerminal / 2; i++) { 
            System.out.print(" ");
        }
        System.out.printf("%s \n", cadena);
    }
    /**
     * Devuelve una lista de caracteres de una cadena
     * @param cadena
     * @return caracteres de cadena
     */
    public static char[] listaCaracteres(String cadena){
        char[] caracteres = new char[cadena.length()];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = cadena.charAt(i);
        }
        return caracteres;
    }
    /**
     * Devuelve una serie de caracteres al reves de la cadena
     * @param cadena
     * @return cadena del reves
     */
    public static String listaReverse(String cadena){
        String auxiliar = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            auxiliar += cadena.charAt(i);
        }
        return auxiliar;
    }
    /**
     * Sustituye guiones bajos por espacios 
     * @param cadenas
     * @return frase bien formateada y en mayúsculas
     */
    public static String concatenarCadenas(String... frase) {
        String fraseConcatenada = "";
        char letra;
        for (int i = 0; i < frase.length; i++) {
            for (int j = 0; j < frase[i].length(); j++) {
                if (frase[i].charAt(j) == '_') {
                    fraseConcatenada += " "; 
                }else if(frase[i].charAt(j) >= 'a' && frase[i].charAt(j) <= 'z' ){
                    letra = (char)(frase[i].charAt(j) - 32);
                    fraseConcatenada += letra ;
                } else{
                    fraseConcatenada += frase[i].charAt(j);
                }
            }
        }
        return fraseConcatenada;
    }
    public static void main(String[] args) {
        mostrarCaracteres("Hola");
        mostrarCentrado("AAAAAAAAAAAAAAA");
        System.out.println(listaReverse("Curro"));
        System.out.println(subCadena("Hola Curro", 1, 5));
        System.out.println(concatenarCadenas("Hola_", "Curro_", "ke", "1233(){}¿?ñÑABCabc  __"));
    }
}

// Toma el ejercicio 4 (funciones de cadenas) del tema anterior y haz las siguientes
// modificaciones (si no lo habías hecho puedes comenzar por estos métodos):
// a) Retoma el método subCadena y modifícalo de forma que si se le pasa
// parámetros no válidos lanzará una excepción del tipo IllegalArgumentException.
// b) Coge el método muestraCentrado y modifícalo de forma que si el String
// parámetro tiene más de 80 caracteres lanzará la excepción
// IllegalArgumentException
// c) En el main pide datos al usuario para probar las dos funciones anteriores y
// captura las excepciones (todas las que puedan surgir).