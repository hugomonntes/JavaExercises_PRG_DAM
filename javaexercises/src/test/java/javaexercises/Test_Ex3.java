package javaexercises;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javaexercises.PRG_Arrays.Arrays_Exercises.Ex1_Arrays.Ex1_Arrays;

public class Test_Ex3 {
    public static int[] ordenaVector(int[] v) {
        return v;
    }

    public static int sumaRango(int[] v, int inicio, int fin) {
        return 0;
    }

    private int[] vOrdenado;
    private int[] vNegativos;
    private int[] vPositivos;
    private int[] vIguales;
    private int[] vUno;
    private int[] vVacio;

    @BeforeEach
    public void incializarVectores() {
        vOrdenado = new int[] { 1, 2, 3, 4, 5 };
        vNegativos = new int[] { -1, -2, -3, -4, -9999 };
        vPositivos = new int[] { 1, 2, 999, 4, 0 };
        vIguales = new int[] { 0, 0, 0, 0, 0 };
        vUno = new int[] { 0 };
        vVacio = new int[] {};
    }

    @Test
    public void testVectorMaximo() {
        assertEquals(999, Ex1_Arrays.maximo(vPositivos));
        assertEquals(0, Ex1_Arrays.maximo(vIguales));
        assertEquals(-1, Ex1_Arrays.maximo(vNegativos));
        assertEquals(0, Ex1_Arrays.maximo(vUno));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Ex1_Arrays.maximo(vVacio);
        });
        assertThrows(NullPointerException.class, () -> {
            Ex1_Arrays.maximo(null);
        });
    }

    @Test
    public void testVectorMinimo() {
        assertEquals(0, Ex1_Arrays.minimo(vPositivos));
        assertEquals(0, Ex1_Arrays.minimo(vIguales));
        assertEquals(-9999, Ex1_Arrays.minimo(vNegativos));
        assertEquals(0, Ex1_Arrays.minimo(vUno));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            Ex1_Arrays.minimo(vVacio);
        });
        assertThrows(NullPointerException.class, () -> {
            Ex1_Arrays.minimo(null);
        });
    }

    @Test
    public void testVectorIntercambio() {
        assertTrue(Ex1_Arrays.intercambiarDatos(vOrdenado, 0, 2));
        assertArrayEquals(new int[] { 3, 2, 1, 4, 5 }, vOrdenado);

        assertTrue(Ex1_Arrays.intercambiarDatos(vNegativos, 0, 4));
        assertArrayEquals(new int[] { -9999, -2, -3, -4, -1 }, vNegativos);

        assertFalse(Ex1_Arrays.intercambiarDatos(vPositivos, 0, 9));
        assertFalse(Ex1_Arrays.intercambiarDatos(vPositivos, -1, 2));
    }

    @Test
    public void testOrdenaVector() {
        assertArrayEquals(new int[] { 0, 1, 2, 4, 999 }, ordenaVector(vPositivos));
        assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, ordenaVector(vIguales));
        assertArrayEquals(new int[] { -9999, -4, -3, -2, -1 }, ordenaVector(vNegativos));
        assertArrayEquals(new int[] { 0 }, ordenaVector(vUno));
        assertArrayEquals(new int[] {}, ordenaVector(vVacio));
        assertEquals(null, ordenaVector(null));
    }

    @Test
    public void testSumarRangos(){
        assertEquals(3, sumaRango(vPositivos, 0, 1));
        assertEquals(-1008, sumaRango(vNegativos, 1, vNegativos.length - 1));
        assertEquals(0, sumaRango(vIguales, 1, vNegativos.length - 1));
        assertEquals(0, sumaRango(vUno, 0, vNegativos.length - 1));

        assertThrows(IllegalArgumentException.class, () -> { // Test v == null
            sumaRango(null, 0, 2);
        });

        assertThrows(IllegalArgumentException.class, () -> { // Test inicio > fin
            sumaRango(vPositivos, 3, 2);
        });

        assertThrows(IllegalArgumentException.class, () -> { // Test fin > longitud
            sumaRango(vPositivos, 0, vPositivos.length);
        });

        assertThrows(IllegalArgumentException.class, () -> { // Test tamaño 0
            sumaRango(vVacio, 0, vPositivos.length);
        });
    }
}

// ◦ int sumaRango(int[] v, int inicio, int fin): Función a la que se le pasa un
// vector v y dos índices y devuelve la suma de los datos entre esos índices
// ambos incluidos. Si alguno de los índices está fuera de rango o el inicio es
// mayor que el fin o el vector es null o de tamaño 0 lanza
// IllegalArgumentException.