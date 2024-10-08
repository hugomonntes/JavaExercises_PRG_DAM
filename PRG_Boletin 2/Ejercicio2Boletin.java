import java.util.Scanner;

public class Ejercicio2Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Introduce dos números enteros");
        System.out.println("Introduce el primero: ");
        num1 = sc.nextInt();
        System.out.println("Introduce el segundo: ");
        num2 = sc.nextInt();
    
        System.out.println(num1 == num2 ? "Son números iguales" : num1 > num2 ? "El número " +num1+ " es mayor." : "El número " +num2+ " es mayor.");

        System.out.println(num1 % num2 == 0 || num2 % num1 == 0 ? "Son múltiplos" : "No son múltiplos");
        
    }
}
