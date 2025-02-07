package PRG_Arrays.Arrays_Exercises.Ex6_Arrays;

public class Main {
    public static void main(String[] args) {
        //Objeto
        Matriz matriz = new Matriz(5);
        matriz.mostrarMatriz(matriz.numerosEnteros);
        matriz.numerosEnteros = matriz.borrarFila(matriz.numerosEnteros, 2);
        System.out.println();
        matriz.mostrarMatriz(matriz.numerosEnteros);
        
    }
}
