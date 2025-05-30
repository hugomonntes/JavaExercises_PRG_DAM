package javaexercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javaexercises.PRG_PooAdv.PooAdv_B2.Ex1.Ex1_Excep;
import javaexercises.PRG_PooAdv.PooAdv_B2.Ex1.StringOutOfBoundsException;

public class Test_Ex2 {
    static String fraseComprobar;
    @BeforeAll
    public static void inicializarCadena(){
        fraseComprobar = "Hola";
    }

    @Test
    public void testSubString() {
        assertEquals("Hola", Ex1_Excep.subCadena(fraseComprobar, 0, 4));
        assertEquals("H", Ex1_Excep.subCadena(fraseComprobar, 0, 1));
        assertEquals("", Ex1_Excep.subCadena(fraseComprobar, 0, 0));
    }

    @Test
    public void testsSubStringNegativos() {
        try {
            Ex1_Excep.subCadena(fraseComprobar, 0, -2);
            fail("Error de longitud");
        } catch (StringOutOfBoundsException e1) {
            assertTrue(true);
        }

        try {
            Ex1_Excep.subCadena(fraseComprobar, 0, -1);
            fail("Error de longitud");
        } catch (StringOutOfBoundsException e1) {
            assertTrue(true);
        }

        try {
            Ex1_Excep.subCadena(fraseComprobar, -1, 0);
            fail("Error de longitud");
        } catch (StringOutOfBoundsException e1) {
            assertTrue(true);
        }

        try {
            Ex1_Excep.subCadena(fraseComprobar, -1, 99);
            fail("Error de longitud");
        } catch (StringOutOfBoundsException e1) {
            assertTrue(true);
        }

        try {
            Ex1_Excep.subCadena(fraseComprobar, -1, 1);
            fail("Error de longitud");
        } catch (StringOutOfBoundsException e) {
            assertTrue(true);
        }
    }
}

// Realiza pruebas con el JUnit para la función subCadena (ejercicio 1 boletín
// de
// POO y Excepciones 6b ) con los valores siguientes (Una afirmación es un
// assert):
// Afirmación 1: “Hola”, inicio 0, longitud 4
// Afirmación 2: “Hola”, inicio 0, longitud 5
// Afirmación 3: “Hola”, inicio 3, longitud 1
// Afirmación 4: “Hola”, inicio 4, longitud 1
// Añade al menos 3 afirmaciones más: una que pruebe una clase de equivalencia
// válida y dos inválidas con valores negativos, una en inicio y la otra en
// longitud.
// Usa @Test distintos para la comprobación de asserts y lanzamiento de
// excepciones.
// La variable con la palabra Hola debe inicializarse solo una vez antes de todos los tests.