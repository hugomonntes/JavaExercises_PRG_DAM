package javaexercises.PRG_PooAdv.PooAdv_B2.Ex3;

import java.util.ArrayList;

public class Ex3 {
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
    public boolean equals(Object obj) { // Corregir
        obj = String.format("%s", obj);
        return true;
    }
}

// - Sobreescribe equals(Object) para que devuelva true si el objeto que se le pasa
// como parámetro cumple:
// • Es de tipo Cadena y contiene los mismos caracteres y en las mismas
// posiciones que la colección de la instancia.
// • Es un objeto tipo String y contiene los mismos caracteres y en las
// mismas posiciones que la colección de la instancia.
// Es un vector de char y contiene los mismos caracteres y en las
// mismas posiciones que la colección de la instancia.
// Si se le pasa un objeto null o un parámetro que no sea tipo Cadena, String o char[]
// lanzará la excepción IllegalArgumentException
// - Método eliminar(char): se le pasa un carácter y elimina todas las veces que
// aparece dicho carácter. Además devuelve la cantidad de caracteres que ha
// eliminado.
// (opcional) Implementa la interfaz Comparable<Cadena> de forma que indique
// orden alfabético. Mira el Apéndice III de los apuntes.