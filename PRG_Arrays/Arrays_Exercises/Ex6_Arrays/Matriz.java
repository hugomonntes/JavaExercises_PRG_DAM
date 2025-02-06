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
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%3d", tabla[i][j]);
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
        for (int i = 0; i < numerosEnteros.length; i++) {
            
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] numerosEnteros = new int[5][5];
        mostrarMatriz(numerosEnteros);
    }
}
