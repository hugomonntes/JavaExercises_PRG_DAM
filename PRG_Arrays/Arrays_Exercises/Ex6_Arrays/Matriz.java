package PRG_Arrays.Arrays_Exercises.Ex6_Arrays;

public class Matriz {

    public int[][] numerosEnteros;
    //CONSTRUCTORES
    public Matriz(int n){
        this.numerosEnteros = new int[n][n];
        for (int i = 0; i < numerosEnteros.length; i++) {
            for (int j = 0; j < numerosEnteros[i].length; j++) {
                numerosEnteros[i][j] = (int)((Math.random() * 10));
            }
        }
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
    public int[][] borrarFila(int[][] numerosEnteros,int filaBorrar){
        if (filaBorrar < 0 || filaBorrar >= numerosEnteros.length) {
            return numerosEnteros;
        }
        int[][] tablaModificada = new int[numerosEnteros.length -1][numerosEnteros[0].length];
        int j = 0;
        for (int i = 0; i < numerosEnteros.length; i++){
            if (i == filaBorrar) {
                continue;
            }
            for (int k = 0; k < numerosEnteros[i].length; k++) {
                tablaModificada[j][k] = numerosEnteros[i][k];
            }
            j++;
        }
        return tablaModificada;
    }
}