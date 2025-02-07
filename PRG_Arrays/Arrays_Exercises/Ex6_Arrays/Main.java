package PRG_Arrays.Arrays_Exercises.Ex6_Arrays;

public class Main {
    public static void main(String[] args) {
        //Objeto
        Matriz matriz = new Matriz(5);
        matriz.mostrarMatriz(matriz.numerosEnteros); //Mostrar matriz
        matriz.sumarElementosMatriz(); //Mostrar suma de todos los elementos
        matriz.sumarElementosMatriz2(false); //Mostrar suma diagonal
        matriz.sumarElementosMatriz3(2); //Mostrar suma de elementos de una fila
        matriz.numerosEnteros = matriz.borrarFila(matriz.numerosEnteros, 2);//Mostrar matriz sin una fila
        System.out.println();
        matriz.mostrarMatriz(matriz.numerosEnteros);//Mostrar matriz sin una fila
    }
}
