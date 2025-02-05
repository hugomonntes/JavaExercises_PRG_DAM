package PRG_Arrays.Arrays_Exercises.Ex6_Arrays;

public class Matriz {

    public int[][] numerosEnteros;
    //CONSTRUCTORES
    public Matriz(int n){
        n = (int)(Math.random()*10);
        numerosEnteros = new int[n][n];
    }

    //MÉTODOS
    public static void mostrarMatriz(int[][] tabla){
        for (int[] fila : tabla) {
            System.out.println(fila);
            for (int[] columna : tabla) {
                System.out.println(columna);
            }
        }
    }

    public static void main(String[] args) {
        int[][] numerosEnteros = new int[5][5];
        mostrarMatriz(numerosEnteros);
    }
}
