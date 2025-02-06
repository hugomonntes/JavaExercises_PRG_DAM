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
        for (int i = 0; i <= tabla.length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%4d", i);
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
    public int[][] borrarFila(int filaBorrar){
        int[][] tablaOriginal = new int[5][5];
        int[][] tablaModificada = new int[numerosEnteros.length - 1][numerosEnteros.length];
        for (int i = 0; i < numerosEnteros.length; i++){
            if (i == filaBorrar) {
                // numerosEnteros = numerosEnteros[filaBorrar+1][i];
            }
        }
        return tablaOriginal;
    }
    public static void main(String[] args) {
        int[][] numerosEnteros = new int[5][5];
        for (int i = 0; i < numerosEnteros.length; i++) {
            for (int j = 0; j < numerosEnteros[i].length; j++) {
                numerosEnteros[i][j] = (int)((Math.random() * 10) + 1);
            }
        }
        mostrarMatriz(numerosEnteros);
    }
}

/*
Función denominada borraFila a la cual se le pasa un entero y devuelve la
matriz pero sin la fila indicada por el número del parámetro (debes crear una
matriz con una fila menos). Si el número está fuera del rango válido devuelve
la matriz completa.
*/
