package javaexercises;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import javaexercises.PRG_Arrays.Arrays_Exercises.Ex1_Arrays.Ex1_Arrays;

public class Test_Ex3 {
    public static int[] ordenaVector(int[] v) {
        if (v == null) {
            return null;
        }
        Arrays.sort(v);
        return v;
    }

    public static int sumaRango(int[] v, int inicio, int fin) {
        if (v == null || v.length == 0 || inicio < 0 || fin >= v.length || inicio > fin) {
            throw new IllegalArgumentException("Parámetros inválidos!");
        }

        int suma = 0;
        for (int i = inicio; i <= fin; i++) {
            suma += v[i];
        }
        return suma;
    }

    private int[] listaNumeros = new int[] {
            1, 2, 3, 4, 0
    };

    @Test
    public void testVector() {
        // assertEquals(9, Ex1_Arrays.maximo(null));
        assertEquals(4, Ex1_Arrays.maximo(listaNumeros));
        assertEquals(0, Ex1_Arrays.minimo(listaNumeros));
        assertArrayEquals(new int[] { 3, 2, 1, 4, 0 }, Ex1_Arrays.intercambiarDatos(listaNumeros, 0, 2));
        // assertArrayEquals(null, Ex1_Arrays.intercambiarDatos(null, 0, 2));
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4 }, ordenaVector(listaNumeros));
        assertEquals(10, sumaRango(listaNumeros, 0, 4));
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