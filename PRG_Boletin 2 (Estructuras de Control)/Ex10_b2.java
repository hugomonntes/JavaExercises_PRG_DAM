import java.util.Scanner;

public class Ejercicio10Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primerNumero;
        int medianera;
        int segundoNumero;

        System.out.println("Introduce dos números");
        System.out.print("Primer número: ");
        primerNumero = sc.nextInt();
        System.out.print("Segundo número: ");
        segundoNumero = sc.nextInt();

        medianera = primerNumero;
        primerNumero = segundoNumero;
        segundoNumero = medianera;

        System.out.println("Primer número " + primerNumero + " y segundo número " + segundoNumero);
    }
}