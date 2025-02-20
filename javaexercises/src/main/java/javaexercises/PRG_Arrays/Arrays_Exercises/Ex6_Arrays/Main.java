package javaexercises.PRG_Arrays.Arrays_Exercises.Ex6_Arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //TODO revisar mostrar cab col
        Scanner sc = new Scanner(System.in);
        Matriz matriz = new Matriz(3);
        int opcion;
        do {
                System.out.println("\nElija una de las siguiente:");
                System.out.println("1.- Mostrar matriz.");
                System.out.println("2.- Mostrar suma de todos los elementos.");
                System.out.println("3.- Mostrar suma de la diagonal.");
                System.out.println("4.- Mostrar suma de los elementos salvo diagonal "); //TODO falla (Check)
                System.out.println("5.- Mostrar suma de elementos de una fila."); //TODO revisar rangos
                System.out.println("6.- Mostrar matriz sin una fila.");
                System.out.println("7.- Salir");
                System.out.print("Introduce una opcion: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        matriz.mostrarMatriz(matriz.numerosEnteros);
                        break;
                    case 2:
                        System.out.printf("Suma de todo: %d \n", matriz.sumarElementosMatriz());
                        break;
                    case 3:
                        System.out.printf("Suma de la diagonal: %d \n", matriz.sumarDiagonal(true));
                        break;
                    case 4:
                        System.out.printf("Suma de todos los elementos restando la diagonal: %d \n", matriz.sumarDiagonal(false));
                        break;
                    case 5:
                        System.out.print("Introduce la fila de la que quieres sumar sus datos: ");
                        System.out.printf("Suma de elementos de la fila: %d \n", matriz.sumarElementosFila(sc.nextInt()));
                        break;
                    case 6:
                        System.out.print("\n ¿Que fila quieres eliminar de la matriz?: ");
                        int[][] matrizModificada = matriz.borrarFila(matriz.numerosEnteros, sc.nextInt());
                        Matriz.mostrarMatriz(matrizModificada);
                        break;
                    default:
                        System.out.println("Fin");
                        break;
                }
        } while (opcion != 7);
        sc.close();
    }
}
