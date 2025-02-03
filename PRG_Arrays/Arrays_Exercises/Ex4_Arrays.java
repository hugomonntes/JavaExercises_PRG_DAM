package PRG_Arrays.Arrays_Exercises;

public class Ex4_Arrays {//TODO comentarios (Check)
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
    public static String subCadena(String cadena, int inicio, int cantidadCaracteres){ //TODO no se puede usar substring y revisar condición(Check menos condicion)
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
        for (int i = 0; i < anchoTerminal / 2; i++) {//TODO recolocar condición(check)
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

    public static String concatenarCadenas(String... cadenas) {
        String fraseFinal = "";
        for (int i = 0; i < cadenas.length; i++) { // Hugo
            for (int j = 0; j < cadenas[i].length(); j++) { // H0 U1 G2 O3
                fraseFinal += fraseFinal + cadenas[j];
                if (fraseFinal.charAt(j) == '_') {
                    
                }
            }
        }
        return fraseFinal;
    }
    public static void main(String[] args) {
        mostrarCaracteres("Hola");
        mostrarCentrado("AAAAAAAAAAAAAAA");
        System.out.println(listaReverse("Curro"));
        System.out.println(subCadena("Hola Curro", 1, 5));
        System.out.println(concatenarCadenas("Hola_", "Curro_", "ke"));
    }
}


/*
f ) pasoAMayusculas: Función a la que se le pasa un número indeterminado de
cadenas como parámetros y las devuelve concatenadas y todo en mayúsculas
dentro del ASCII estándar de 7 bits (es decir, no tengas en cuenta vocales con tilde
ni diéresis ni la letra Ñ), además si la cadena tiene un guión bajo (_) colocará un
espacio en su lugar. Revisa el Apéndice II para hacer este apartado
*/
