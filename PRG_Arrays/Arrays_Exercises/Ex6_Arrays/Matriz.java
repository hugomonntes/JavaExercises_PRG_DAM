package PRG_Arrays.Arrays_Exercises.Ex6_Arrays;

public class Matriz {

    public int[][] numerosEnteros;
    //CONSTRUCTORES
    public Matriz(int n){
        int[][] numerosEnteros = new int[n][n];
        for (int i = 0; i < numerosEnteros.length; i++) {
            for (int j = 0; j < numerosEnteros[i].length; j++) {
                numerosEnteros[i][j] = (int)((Math.random() * 10));
            }
        }
    }
    //MÉTODOS
    public static void mostrarMatriz(int[][] tabla){
        // for (int i = 0; i <= tabla.length; i++) {
        //     System.out.printf("%4d", i);
        // }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            // System.out.printf("%4d", i);
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        } 
    }
    public int sumarElementosMatriz(){
        int acumulador = 0;
        for (int i = 0; i < numerosEnteros.length; i++) {
            for (int j = 0; j < numerosEnteros[i].length; j++) {
                acumulador += numerosEnteros[i][j];
            }
        }
        return acumulador;
    }
    public int sumarElementosMatriz2(boolean flag){
        int acumulador = 0;
        for (int i = 0; i < numerosEnteros.length; i++) {
            if (flag) {
                acumulador += numerosEnteros[i][i];
            }
            for (int j = 0; j < numerosEnteros[i].length; j++) {
                if (!flag) {
                    acumulador += numerosEnteros[i][j];
                }
            }
        }
        return acumulador;
    }
    public int sumarElementosMatriz3(int fila){
        int acumulador = 0;
        if (fila < 0 || fila > numerosEnteros.length) {
            return -1;
        } else{
            for (int i = 0; i < numerosEnteros[fila].length; i++) {
                acumulador += numerosEnteros[fila][i];
            }
            return acumulador;
        }
    }
    public static int[][] borrarFila(int[][] numerosEnteros,int filaBorrar){
        int[][] tablaModificada = new int[numerosEnteros.length][numerosEnteros.length];
        int j = 0;
        for (int i = 0; i < numerosEnteros.length; i++){
            tablaModificada[i][j] = numerosEnteros[i][j];
            j++;
        }
        return tablaModificada;
    }
    public static void main(String[] args) {
        int[][] numerosEnteros = new int[5][5];
        mostrarMatriz(numerosEnteros);
        System.out.println();
        mostrarMatriz(borrarFila(numerosEnteros, 2));
    }
}

/*
Función denominada borraFila a la cual se le pasa un entero y devuelve la
matriz pero sin la fila indicada por el número del parámetro (debes crear una
matriz con una fila menos). Si el número está fuera del rango válido devuelve
la matriz completa.
*/
