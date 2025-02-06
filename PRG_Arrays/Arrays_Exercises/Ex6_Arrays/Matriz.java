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
        // for (int i = 0; i <= tabla.length; i++) {
        //     System.out.printf("%4d", i);
        // }
        // System.out.println();
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
        int acumuladorDiagonal = 0;
        int acumuladorTotal = 0;
            for (int i = 0; i < numerosEnteros.length; i++) {
                acumuladorDiagonal += numerosEnteros[i][i];
                if (flag) {
                    return acumuladorDiagonal;
                } else {
                    acumuladorTotal += numerosEnteros[i][i+1];
                    return acumuladorTotal;
                }
            }
    }
    public static void main(String[] args) {
        int[][] numerosEnteros = new int[5][5];
        for (int i = 0; i < numerosEnteros.length; i++) {
            for (int j = 0; j < numerosEnteros[i].length; j++) {
                numerosEnteros[i][j] = (int)((Math.random() * 10) + 1);
            }
        }
        mostrarMatriz(numerosEnteros);
        // sumarElementosMatriz2(numerosEnteros, false);
    }
}

/*
Un parámetro boolean: Si está a true devuelve la suma de los
elementos de la diagonal principal de la matriz (la que va de 0,0 a
n,n). Si está a false la suma del resto de los elementos (todos menos
la diagonal)
Trata de hacerlo con solo un bucle para la diagonal y ninguno para los
que no son de la diagonal (si no te sale hazlo con varios bucles, se te
dará pista en la validación).
*/
