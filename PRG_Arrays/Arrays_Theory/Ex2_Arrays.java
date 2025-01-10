package PRG_Arrays.Arrays_Theory;

public class Ex2_Arrays {
    public static int[][] crearBidimensional(int numeroFilas, int numeroColumnas){
        int[][] numerosReales = new int[numeroFilas][numeroColumnas];
        // numerosReales[][] = (int)(Math.random()*10 + 20);
        return numerosReales;
    }
    public static void main(String[] args) {
        
    }
}

/*
Actividad: Realiza una función a la cual se le pasan dos parámetros enteros
(nº de filas y nº de columnas) y cree un array bidimensional de números
reales (aleatorios entre 20 y 30) del tamaño indicado por los parámetros y lo
devuelva.
Realiza también otra función a la que se le pasa un array bidimensional de
doubles y la muestra por pantalla indicando el número de fila y el de columna
como cabeceras. Los datos muestra los con 2 decimales. Trata de hacerla con
for mejorado.
En el main crea dos arrays mediante la primera función (de 4x3 y de 3x4).
Luego muéstralos mediante la segunda función.
*/
