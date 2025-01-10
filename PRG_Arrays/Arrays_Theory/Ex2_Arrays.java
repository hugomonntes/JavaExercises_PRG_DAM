package PRG_Arrays.Arrays_Theory;

public class Ex2_Arrays {
    public static double[][] crearBidimensional(int numeroFilas, int numeroColumnas){
        double[][] numbers = new double[numeroFilas][numeroColumnas];
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                numbers[i][j] = Math.random() * 10 + 20;
            }
        }
        return numbers;
    }

    public static void mostrarBidimensional(double[][] numbers){
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%.2f ", numbers[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        double[][] array1 = crearBidimensional(4, 3);
        mostrarBidimensional(array1);

        double[][] array2 = crearBidimensional(3, 4);
        mostrarBidimensional(array2);
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
