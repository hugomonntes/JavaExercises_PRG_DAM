package javaexercises;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import javaexercises.PRG_Arrays.Arrays_Exercises.Ex1_Arrays.Ex1_Arrays;

public class Test_Ex3 {
    public static int[] ordenaVector(int[] v) {
        return v;
    }

    public static int sumaRango(int[] v, int inicio, int fin) {
        return 0;
    }

    int[] vNegativos = new int[]{-1, -2, -3, -4, -9999};
    int[] vPositivos = new int[]{1, 2, 3, 4, 0};
    int[] vIguales = new int[] { 0, 0, 0, 0, 0 };
    int[] vUno = new int[] {0};
    int[] vVacio = new int[] {};

    @Test
    public void testVectorMaximo() {
        assertEquals(0, Ex1_Arrays.maximo(new int[] { -4, -3, -2, -1, 0 }));
        assertEquals(0, Ex1_Arrays.maximo(new int[] { 0, 0, 0, 0, 0 }));
        assertEquals(4, Ex1_Arrays.maximo(new int[] { 1, 2, 3, 4, 0 }));
        assertEquals(-1, Ex1_Arrays.maximo(new int[] { -1, -2, -3, -4, -9999 }));
        assertEquals(1, Ex1_Arrays.maximo(new int[] {1}));
        assertThrows(NullPointerException.class,() -> {
                    Ex1_Arrays.maximo(null);
                });
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> {
                    Ex1_Arrays.maximo(new int[]{});
                });
    }

    @Test
    public void testVectorMinimo() {
        assertEquals(-4, Ex1_Arrays.minimo(new int[] { -4, -3, -2, -1, 0 }));
        assertEquals(0, Ex1_Arrays.minimo(new int[] { 0, 0, 0, 0, 0 }));
        assertEquals(0, Ex1_Arrays.minimo(new int[] { 1, 2, 3, 4, 0 }));
        assertEquals(-9999, Ex1_Arrays.minimo(new int[] { -1, -2, -3, -4, -9999 }));
        assertEquals(1, Ex1_Arrays.minimo(new int[] {1}));
        assertThrows(NullPointerException.class,() -> {
                    Ex1_Arrays.minimo(null);
                });
        assertThrows(ArrayIndexOutOfBoundsException.class,() -> {
                    Ex1_Arrays.minimo(new int[]{});
                });
    }

    @Test
    public void testVectorIntercambio(){
        assertTrue(Ex1_Arrays.intercambiarDatos(new int[] { -4, -3, -2, -1, 0 }, 0, 2));
        assertFalse(Ex1_Arrays.intercambiarDatos(new int[] { -4, -3, -2, -1, 0 }, 0, 9));
        assertFalse(Ex1_Arrays.intercambiarDatos(new int[] { -4, -3, -2, -1, 0 }, -1, 2));
        assertArrayEquals(new int[] { -4, -3, -2, -1, 0 }, );
    }
}

// 3. a) Realiza pruebas de software de las funciones máximo, mínimo e
// intercambio
// del ejercicio 1 básico de vectores.
// Debes inicializar vectores de números fijos para poder tener control sobre
// los
// resultados. Es decir, no uses la función de generación de vector aleatorio.
// El tamaño estándar de vector para la pruebas será 5. Además debe probarse el
// uso de vector null y tamaños 0 y 1, es estos casos si alguna función falla no
// pasa el test.

// Debes usar las anotaciones @BeforeAll y/o @BeforeEach si hay elementos que
// inicializas de forma común para las distintas pruebas.
// b) Desde el departamento de diseño te indican que se van a crear dos
// funciones
// nuevas con el siguiente funcionamiento:
// ◦ int[] ordenaVector(int[] v): Función a la que se le pasa un vector y
// devuelve el vector ordenado de forma ascendente. Si el vector es null
// devuelve null.

// ◦ int sumaRango(int[] v, int inicio, int fin): Función a la que se le pasa un
// vector v y dos índices y devuelve la suma de los datos entre esos índices
// ambos incluidos. Si alguno de los índices está fuera de rango o el inicio es
// mayor que el fin o el vector es null o de tamaño 0 lanza
// IllegalArgumentException.