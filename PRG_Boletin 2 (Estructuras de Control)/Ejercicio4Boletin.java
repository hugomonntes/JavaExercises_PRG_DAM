import java.util.Scanner;

public class Ejercicio4Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroEntero;
        double numeroReal;

        System.out.println("Introduce un numero entero: ");
        numeroEntero = sc.nextInt();
        System.out.println("Introduce un numero real: ");
        numeroReal = sc.nextDouble();

        System.out.printf("El numero en decimal es: %d \n El numero en octal es: %05o \n El numero en octal es: %X", numeroEntero, numeroEntero, numeroEntero);
        System.out.printf("El número real es: %7.3f", numeroReal);
    }
}

/*
 * Haz un programa que pida un nº entero al usuario y luego un número real.
 * El entero debe mostrarlo primero en decimal; luego en octal ocupando 5
 * caracteres y rellenando los vacíos a la izquierda con ceros (busca como
 * hacerlo); y en hexadecimal poniendo los dígitos “letra” en mayúscula.
 * El real lo mostrará con 3 decimales y ocupando al menos 7 caracteres.
 */