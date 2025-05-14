package javaexercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import javaexercises.PRG_PooAdv.PooAdv_B2.Ex1.Ex1_Excep;

public class Test_Ex2 {
    @Test
    public void testSubString(){
        assertEquals("Hola", Ex1_Excep.subCadena("Hola", 0, 4));
        assertEquals("H", Ex1_Excep.subCadena("Hola", 0, 1));
    }

    @Test
    public void testsSubStringNegativos(){ // StringOutOfBoundsException
        assertEquals("", Ex1_Excep.subCadena("Hola", 0, -2));
        assertEquals("Hola", Ex1_Excep.subCadena("Hola", -5, 4));
    }
}

// Realiza pruebas con el JUnit para la función subCadena (ejercicio 1 boletín de
// POO y Excepciones 6b ) con los valores siguientes (Una afirmación es un
// assert):
// Afirmación 1: “Hola”, inicio 0, longitud 4
// Afirmación 2: “Hola”, inicio 0, longitud 5
// Afirmación 3: “Hola”, inicio 3, longitud 1
// Afirmación 4: “Hola”, inicio 4, longitud 1
// Añade al menos 3 afirmaciones más: una que pruebe una clase de equivalencia
// válida y dos inválidas con valores negativos, una en inicio y la otra en longitud.
// Usa @Test distintos para la comprobación de asserts y lanzamiento de
// excepciones.
// La variable con la palabra Hola debe inicializarse solo una vez antes de todos
// los tests.