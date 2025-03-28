package javaexercises.PRG_Exceptions.Exceptions_B1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex15_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        double valorEuroALibra = 0.83;
        double valorLibraAEuro = 1.15;
        double resultadoFinal;
        int opcion;
        do {
            System.out.println("1 --> Conversor de Euros a Libras");
            System.out.println("2 --> Conversor de Libras a Euros");
            System.out.println("3 --> Salir");
            try {
                System.out.print("Introduce la opción: ");
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce un numero!");
                sc.nextLine();
                opcion = 0;
            }
            switch (opcion) {
                case 1:
                boolean isChecked;
                    do {
                        isChecked = true;
                        try {
                            System.out.print("Introduce tu cantidad en Euros (€): ");
                            cantidad = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce un numero!");
                            sc.nextLine();
                            isChecked = false;
                        }
                    } while (!isChecked);
                    sc.nextLine();
                    resultadoFinal = cantidad * valorEuroALibra;
                    System.out.printf("%.2f Euros (€) es equivalente a %.2f Libras (£) \n", cantidad, resultadoFinal);
                    break;
                case 2:
                    do {
                        isChecked = true;
                        try {
                            System.out.print("Introduce tu cantidad en Libras (£): ");
                            cantidad = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Introduce un numero!");
                            sc.nextLine();
                            isChecked = false;
                        }
                    } while (!isChecked);
                    sc.nextLine();
                    resultadoFinal = cantidad * valorLibraAEuro;
                    System.out.printf("%.2f Libras (£) es equivalente a %.2f Euros (€) \n", cantidad, resultadoFinal);
                    break;
                case 3:
                    System.out.println("Adiós!");
                    break;
            }
        } while (opcion != 3);
    }
}
