import java.util.Scanner;

public class Ejercicio11Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int N = 0;

        while (suma <= 10000) {
            N++;
            suma = suma + N;
        }

        System.out.println("El valor de N es: " + N);
        System.out.println("La suma es: " + suma);
    }
}

/*
11.Escribir un programa que encuentre el primer valor de N para el cuál se cumple
que la suma
1+2+3+...+N > 10000. (Nota: la solución es 141).
*/