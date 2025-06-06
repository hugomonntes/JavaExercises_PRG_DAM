package javaexercises;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import javaexercises.PRG_Métodos.Ex3_b3;
import javaexercises.PRG_Métodos.Ex4_b3;
import javaexercises.PRG_Métodos.Ex6_b3;

public class Tests_Ex1 {
    @Test
    public void testAnosNoBisiestos(){
        assertFalse(Ex4_b3.isBisiesto(1800));
        assertTrue(Ex4_b3.isBisiesto(2000));
        assertTrue(Ex4_b3.isBisiesto(2004));
        assertFalse(Ex4_b3.isBisiesto(2006));
        assertFalse(Ex4_b3.isBisiesto(2021));
        assertFalse(Ex4_b3.isBisiesto(2021));
    }

    @Test
    public void testAreaCilindro(){
        double resultadoOriginal = Ex3_b3.superficieCilindro(1, 1);
        double resultadoModificado = (2 * 1 * 1 * Math.PI) + (2 * Math.PI * 1 * 1);
        assertEquals(resultadoModificado, resultadoOriginal , 0.00001);
        // Respuesta: No pasa el test
    }

    @Test
    public void testCalcularPotencia(){
        int [] bases = {1, 0, -1, 2, -2, -0, 99};
        int [] exponentes = {1, 0, -1, 2, 3, -2, -3, 99};
        for (int i = 0; i < bases.length; i++) {
            for (int j = 0; j < exponentes.length; j++) {
                assertEquals(Math.pow(i, j), Ex6_b3.calcularPotencia(i, j), 0);
            }
        }
    }
}

// 1. a) Realiza pruebas de software para la función bisiesto programada en el boletín
// 3. Las pruebas deben hacerse con los años: 1800, 2000, 2004, 2006 y 2021.

// b)Realiza una prueba de software para la función de cálculo del área de un
// cilindro (boletín 3). Debes modificar la función para que en lugar de Math.PI
// uses el número PI escrito directamente con cuatro cifras decimales (3,1416). El
// error máximo permitido para el resultado es de ±0.00001 para los valores de
// radio=1 y altura=1. ¿Pasa la prueba?

// c) Diseña las pruebas en JUnit que consideres adecuadas para probar la función
// potencia del ejercicio 6 del boletín 3.