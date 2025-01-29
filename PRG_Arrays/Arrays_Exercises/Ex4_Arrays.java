package PRG_Arrays.Arrays_Exercises;

public class Ex4_Arrays {//TODO comentarios


    public static void mostrarCaracteres(String letras){//ok
        for (int i = 0; i < letras.length(); i++) {
            System.out.println(letras.charAt(i));
        }
    }
    public static String subCadena(String cadena, int inicio, int cantidadCaracteres){//TODO no se puede usar substring y revisar condición 
        if (cadena == null || inicio < 0 || cantidadCaracteres < 0 || cantidadCaracteres > cadena.length()) {
            return "";
        } else {
            return cadena.substring(inicio, cantidadCaracteres);
        }
    }
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
    public static char[] listaCaracteres(String cadena){//ok
        char[] caracteres = new char[cadena.length()];
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = cadena.charAt(i);
        }
        return caracteres;
    }

    // public static char listaReverse(String cadena){
    //     char auxiliar;
    //     for (int i = cadena.length() - 1; i >= 0; i--) {
    //         // auxiliar = auxiliar.charAt(i);
    //     }
    //     return auxiliar;
    // }
    public static void main(String[] args) {
<<<<<<< HEAD
        mostrarCaracteres("aaa");
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
=======
        mostrarCaracteres("nh");
        System.out.println(subCadena("HolaMundo", 0, 9));
        mostrarCentrado("HolaMundo");
        System.out.println(listaCaracteres("HolaMundo"));
        // System.out.println(listaReverse("Reverse"));
    }
}

/*2
>>>>>>> 351c89e581939cf87234787e43f7e8759e0f09de
e) alReves: Función a la que se le pasa una frase y la devuelve en orden inverso.
f ) pasoAMayusculas: Función a la que se le pasa un número indeterminado de
cadenas como parámetros y las devuelve concatenadas y todo en mayúsculas
dentro del ASCII estándar de 7 bits (es decir, no tengas en cuenta vocales con tilde
ni diéresis ni la letra Ñ), además si la cadena tiene un guión bajo (_) colocará un
espacio en su lugar. Revisa el Apéndice II para hacer este apartado
*/
