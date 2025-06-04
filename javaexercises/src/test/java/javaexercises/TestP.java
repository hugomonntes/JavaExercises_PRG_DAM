package javaexercises;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javaexercises.PRG_Arrays.Arrays_Exercises.Ex1_Arrays.Ex1_Arrays;

public class TestP {
    public static int mockPrueba(){
        return 1;
    }

    public int[] vPositivos;
    public int[] vNegativos;
    public int[] vMezclados;
    public int[] vIguales;
    public int[] vVacio;
    public int[] vNull;

    @BeforeEach
    public void inicializarVectores(){
        vPositivos = new int[]{1, 5, 8, 2, 0};
        vNegativos = new int[]{-1, -5, -8, -2, 0};
        vMezclados = new int[]{13, -5, -1, 0, 1};
    }

    @Test
    public void testIntercambio(){
        assertTrue(Ex1_Arrays.intercambiarDatos(vPositivos, 0, 1));
        assertArrayEquals(new int[]{5, 1, 8, 2, 0}, vPositivos);

        try {
            Ex1_Arrays.intercambiarDatos(vNull, 0, 0);
            fail("Vector Nulo");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
