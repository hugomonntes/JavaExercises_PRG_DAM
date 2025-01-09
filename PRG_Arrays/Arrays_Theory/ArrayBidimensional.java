package PRG_Arrays.Arrays_Theory;

public class ArrayBidimensional {
    @SuppressWarnings("unused") //Quitar warnings de variables no utilizadas.
    public static void main(String[] args) {
        int [][] temperaturas = new int[7][4];  //7 filas y 4 columnas.

        //Array predefinido al declarar.
        int [][] tabla = {
            {15, 12, 14},
            {10, 5, 4},
            {1, 2, 13}
        };

        //Array bidimensional con matrices de distintos tamaños.
        int[][] b = {
            {-5, 7, 7, 9},
            {1, 2},
            {4, 3}
        };
        
        // Obtener número de filas y columnas.
        System.out.println("Número de filas: " + temperaturas.length);
        System.out.println("Número de columnas: "+ temperaturas[0].length);

        //Recorrer Arrays bidimensionales
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.printf("%3d ", tabla[i][j]);
            }
            System.out.println();
        }
    }
}
