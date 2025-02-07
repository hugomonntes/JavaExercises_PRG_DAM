package PRG_Arrays.Arrays_Exercises;

public class Ex4_Arrays {//TODO mejorarcomentarios 
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
            return "";
        } else {
            for (int i = inicio; i < inicio + cantidadCaracteres; i++) {
                cadenaFinal += cadena.charAt(i);
            }
        }
        return cadenaFinal;
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
    public static char[] listaCaracteres(String cadena){//ok
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


/*
f ) pasoAMayusculas: Función a la que se le pasa un número indeterminado de
cadenas como parámetros y las devuelve concatenadas y todo en mayúsculas
dentro del ASCII estándar de 7 bits (es decir, no tengas en cuenta vocales con tilde
ni diéresis ni la letra Ñ), además si la cadena tiene un guión bajo (_) colocará un
espacio en su lugar. Revisa el Apéndice II para hacer este apartado
*/
