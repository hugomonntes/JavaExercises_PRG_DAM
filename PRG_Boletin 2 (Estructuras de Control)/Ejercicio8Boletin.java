import java.util.Scanner;
public class Ejercicio8Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int maxNumber;

        System.out.println("Dame tres números");
        System.out.print("Primer número: ");
        firstNumber = sc.nextInt();
        System.out.print("Segundo número: ");
        secondNumber = sc.nextInt();
        System.out.print("Tercer número: ");
        thirdNumber = sc.nextInt();

        maxNumber = Math.max(firstNumber ,Math.max(secondNumber, thirdNumber));//TODO Con ifs

        System.out.printf("El número mayor es: %d \n", maxNumber);
    }
}