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
    public static String subCadena(String cadena, int inicio, int cantidadCaracteres){ //TODO no se puede usar substring y revisar condición 
        if (cadena == null || inicio < 0 || cantidadCaracteres < 0 || cantidadCaracteres > cadena.length()) {
            return "";
        } else {
            return cadena.substring(inicio, cantidadCaracteres);
        }
    }
    /**
     * Muestra un String centrado en la terminal
     * @param cadena
     */
    public static void mostrarCentrado(String cadena){
        int anchoTerminal = (80 - cadena.length()); 
        for (int i = 0; i < anchoTerminal; i++) {//TODO recolocar condición
            System.out.print(" ");
            if (i == anchoTerminal / 2) {
                System.out.print(cadena);
            }
        }
        System.out.println();
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
    public static char listaReverse(String cadena){
        char auxiliar = ' ';
        for (int i = cadena.length() - 1; i >= 0; i--) {
            auxiliar += cadena.charAt(i);
        }
        return auxiliar;
    }
    public static void main(String[] args) {
        mostrarCaracteres("Hola");
        System.out.println(listaReverse("Casa"));
    }
}


/*
b) subCadena: Método al que se le pase una cadena, una posición de inicio y una
cantidad de caracteres y devuelve el fragmento indicado. Si se le pasan parámetros
no válidos (indices fuera de rango o cadena null) devuelve cadena vacía.
c) muestraCentrado: Función que se le pasa un string y lo muestra centrado en a
consola (supón consola de 80 caracteres de ancho).
d) cadenaAVector: Función a la que se le pasa una cadena y devuelve un vector
de char con cada uno de los caracteres de la cadena.
e) alReves: Función a la que se le pasa una frase y la devuelve en orden inverso.
f ) pasoAMayusculas: Función a la que se le pasa un número indeterminado de
cadenas como parámetros y las devuelve concatenadas y todo en mayúsculas
dentro del ASCII estándar de 7 bits (es decir, no tengas en cuenta vocales con tilde
ni diéresis ni la letra Ñ), además si la cadena tiene un guión bajo (_) colocará un
espacio en su lugar. Revisa el Apéndice II para hacer este apartado
*/
