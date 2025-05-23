package javaexercises.PRG_PooAdv.PooAdv_B2.Ex3;

import java.util.ArrayList;

public class Cadena {
    private ArrayList<Character> cadena;

    public void setCadena(String conjuntoDeChars) {
        cadena = new ArrayList<>();
        conjuntoDeChars = conjuntoDeChars.trim();
        for (int i = 0; i < conjuntoDeChars.length(); i++) {
            cadena.add(conjuntoDeChars.charAt(i));
        }
    }

    @Override
    public String toString() {
        String cadenaCompleta = "";
        for (Character chars : cadena) {
            cadenaCompleta += chars;
        }
        return cadenaCompleta;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == char[].class) {
            char[] arrayDeCadena = (char[]) obj;
            if (arrayDeCadena.length == cadena.size()) {
                for (int i = 0; i < arrayDeCadena.length; i++) {
                    if (arrayDeCadena[i] != cadena.get(i)) {
                        return false;
                    }
                }
                return true;
            }
        } else if (obj.getClass() == Cadena.class) {
            ArrayList<Character> cadena2 = (ArrayList<Character>) obj;
            if (cadena2.size() == cadena.size()) {
                for (int i = 0; i < cadena2.size(); i++) {
                    if (cadena.get(i) != cadena2.get(i)) {
                        return false;
                    }
                }
                return true;
            }
            return this.equals(obj);
        } else if (obj.getClass() == String.class) {
            String cadenaString = (String) obj;
            if (cadenaString.length() == cadena.size()) {
                for (int i = 0; i < cadenaString.length(); i++) {
                    if (cadenaString.charAt(i) != cadena.get(i)) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            throw new IllegalArgumentException();
        }
        return false;
    }
    // - Sobreescribe equals(Object) para que devuelva true si el objeto que se le
    // pasa como parámetro cumple:
    // • Es de tipo Cadena y contiene los mismos caracteres y en las mismas
    // posiciones que la colección de la instancia.
    // • Es un objeto tipo String y contiene los mismos caracteres y en las
    // mismas posiciones que la colección de la instancia.
    // Es un vector de char y contiene los mismos caracteres y en las
    // mismas posiciones que la colección de la instancia.

    // Si se le pasa un objeto null o un parámetro que no sea tipo Cadena, String o
    // char[]
    // lanzará la excepción IllegalArgumentException

    public int eliminarCaracteres(char caracter) {
        int contadorEliminaciones = 0;
        for (int i = 0; i < cadena.size(); i++) {
            if (cadena.get(i) == caracter) {
                cadena.remove(i);
                contadorEliminaciones++;
                i--;
            }
        }
        return contadorEliminaciones;
    }
}

// - Método eliminar(char): se le pasa un carácter y elimina todas las veces que
// aparece dicho carácter. Además devuelve la cantidad de caracteres que ha
// eliminado.

// (opcional) Implementa la interfaz Comparable<Cadena> de forma que indique
// orden alfabético. Mira el Apéndice III de los apuntes.