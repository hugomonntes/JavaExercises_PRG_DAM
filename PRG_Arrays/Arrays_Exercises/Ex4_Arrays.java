package PRG_Arrays.Arrays_Exercises;

public class Ex4_Arrays {
    public static void mostrarCaracteres(String letras){
        for (int i = 0; i < letras.length(); i++) {
            System.out.println(letras.charAt(i));
        }
    }
    public static String subCadena(String cadena, int inicio, int cantidadCaracteres){
        if (cadena == null || inicio < 0 || cantidadCaracteres < 0 || cantidadCaracteres > cadena.length()) {
            return "";
        } else {
            return cadena.substring(inicio, cantidadCaracteres);
        }
    }
    public static void main(String[] args) {
        mostrarCaracteres("nh");
        System.out.println(subCadena("HolaMundo", 0, 9));
    }
}

/*2
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
