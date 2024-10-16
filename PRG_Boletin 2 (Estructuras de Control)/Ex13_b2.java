import java.util.Scanner;

public class Ejercicio13Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMaximo;
        int opcion;
        int acumulador1 = 0;
        int acumulador2 = 0;

        do {
            System.out.println("Introduce el número de la opción que deseas!");
            System.out.println("Tienes 3 opciones: ");
            System.out.println("1 --> Numeros pares");
            System.out.println("2 --> Numeros impares");
            System.out.println("3 --> Suma de los números pares e impares");
            System.out.println("4 --> Salir");
            System.out.print("Introduce la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el numero hasta el que quieras los números pares:");
                    numeroMaximo = sc.nextInt();
                    for (int i = 0; i <= numeroMaximo; i = i + 2) {
                        acumulador1 = acumulador1 + i;
                    }
                    System.out.println(acumulador1);
                    System.out.println(" \n_________________ \n");
                    break;

                case 2:
                    System.out.print("Introduce el numero hasta el que quieras los números pares:");
                    numeroMaximo = sc.nextInt();
                    for (int i = 1; i <= numeroMaximo; i = i + 2) {
                        acumulador2 = acumulador2 + i;
                    }
                    System.out.println(acumulador2);
                    System.out.println(" \n_________________ \n");
                    break;

                case 3:
                    System.out.print("Introduce el numero hasta el que quieras los números pares:");
                    numeroMaximo = sc.nextInt();
                    for (int i = 0; i <= numeroMaximo; i++) {
                        if (i % 2 == 0) {
                            acumulador1 += i;
                        } else {
                            acumulador2 += i;
                        }
                    }
                    System.out.println(acumulador1+acumulador2);
                    
                    System.out.println(" \n_________________ \n");
                    break;
                case 4:
                    System.out.println(" \n_________________ \n");
                    System.out.println("Adiós!");
                    System.out.println(" \n_________________ \n");
                    break;
                default:
                    System.out.println(" \n_________________ \n");
                    System.out.println("Opción no válida!");
                    System.out.println(" \n_________________ \n");
                    break;
            }

        } while (opcion != 4);

    }
}

/*
 * 13.Hacer con bucles for (en un único programa todos los apartados):
 * a) Programa que dé el resultado de la suma de números pares entre 0 y N (N lo
 * decide el usuario).
 * b) Programa que dé el resultado de la suma de números impares entre 0 y N (N
 * lo decide el usuario).
 * c) Programa que dé el resultado de la suma de números pares por una parte e
 * impares por otro entre 0 y N (N lo decide el usuario). Debe realizarse con
 * un único bucle.
 */