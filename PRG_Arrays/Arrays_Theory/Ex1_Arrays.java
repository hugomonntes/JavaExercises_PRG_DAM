package PRG_Arrays;

import java.util.Scanner;

public class Ex1_Arrays {
    public double calcularMedias(double[] vector) {
        return 1.0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] almacenNumeros = new int[10];
        int suma = 0;
        for (int i = 0; i < almacenNumeros.length; i++) {
            System.out.print("Introduce un número: ");
            almacenNumeros[i] = sc.nextInt();
        }
        // for (int i = 0; i < almacenNumeros.length; i++) {
        //     suma = suma + almacenNumeros[i];
        // }
        for (int num : almacenNumeros) {
            suma = suma + num;
        }
        System.out.println(suma / almacenNumeros.length);
        for (int i : almacenNumeros) {
            System.out.print(i + ", ");
        }
    }
}
/*
 * Ha un programa con las siguientes características (todo en el main salvo que
 * se indique otra cosa):
 * a) Mediante un bucle pide 10 números enteros al usuario y almacénalos en un
 * array.
 * Mediante un segundo bucle calcula la media de los números (como real).
 * Finalmente, mediante un tercer bucle, muestra el contenido del array y luego
 * la media (Esta ya fuera del bucle, claro).
 * b) Cambia los bucles que puedas por for mejorado (deja comentado el clásico
 * y hazlo justo debajo con el foreach).
 * c) Pasa la parte del cálculo de las medias a una función con parámetro el
 * vector y que devuelva un double.
*/
