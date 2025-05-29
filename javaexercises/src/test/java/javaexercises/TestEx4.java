package javaexercises;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javaexercises.PRG_PooAdv.PooAdv_B2.Ex3.Cadena;

public class TestEx4 {
    char[] vCharsLetras = new char[] { 'a', 'b', 'c' };
    char[] vCharsNumeros;
    char[] vCharsSimbolos;
    char[] vCharsSpaces;
    char[] vVacio;

    Cadena cadenaBase;
    Cadena cNormal;
    Cadena cNormalTrim;
    Cadena cNumeros;
    Cadena cSimbolos;
    Cadena cSpaces;

    String sNormal;
    String sNormalTrim;
    String sSpaces;
    String sNumeros;
    String sSimbolos;
    String sNull;

    @BeforeEach
    public void incializarVariables() {
        // Vectores char[]
        vCharsNumeros = new char[] { '1', '0', '2' };
        vCharsSimbolos = new char[] { '$', '%', '?' };
        vVacio = new char[] {};
        vCharsSpaces = new char[] { ' ', ' ', ' ' };

        // Tipo String
        sNormal = "Hola";
        sNormalTrim = " Hola     ";
        sSpaces = "    ";
        sNumeros = "1234";
        sSimbolos = "$%&?";
        sNull = null;
    }

    @BeforeEach
    public void inicializarCadena() {
        cNormal = new Cadena("HOLA");
        cNormalTrim = new Cadena("   HOLA     ");
        cNumeros = new Cadena("12345");
        cSimbolos = new Cadena("/&&&&/");
        cSpaces = new Cadena("    ");
    }

    @Test
    public void testFunctionEquals() {
        // assertTrue(cadenaBase.equals(new Cadena("HOLA")));
        assertFalse(vCharsLetras.equals(new char[] { 'a', 'b', 'c' }));
        assertFalse(vCharsNumeros.equals(new char[] { '1', '0', '2' }));
        assertFalse(vCharsSimbolos.equals(new char[] { '%', '$', '?' }));
        assertFalse(vCharsSimbolos.equals(new char[] { '%', '$', '?' }));
    }

    @Test
    public void testFunctionEliminarCaracteres() { // TODO Comprobar comparaciones
        assertEquals(1, cNormal.eliminarCaracteres('A'));
        assertEquals("HOL", cNormal);
        assertEquals(0, cNormalTrim.eliminarCaracteres(' ')); // Trim set
        assertEquals(1, cNumeros.eliminarCaracteres('1'));
        assertEquals(4, cSimbolos.eliminarCaracteres('&'));
    }
}

/*
 * 4. Realiza un diseño completo de test JUnit con pruebas de software para las
 * funciones equals y eliminar de la clase Cadena (ejercicio 3 boletín 6). Crea
 * un
 * único objeto en @BeforeAll que usarás en los distintos test que programes.
 * Puedes suponer que el constructor, el set y toString están bien programadas.
 * Recuerda cuando pruebes eliminar que debes comprobar tanto el n.º de
 * elementos eliminados que devuelve la función como que la cadnea quede bien.
 * Nota: En los ejercicios de JUnit, no es imprescindible tener hecho la función
 * o
 * funciones a testear, pues lo que se valida es la creación y el diseño de las
 * pruebas. Haz Mocks si no tienes las clases y/o funciones hechas.
 */