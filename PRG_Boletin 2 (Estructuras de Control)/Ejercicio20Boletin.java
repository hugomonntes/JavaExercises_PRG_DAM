import java.util.Scanner;

public class Ejercicio20Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAsteriscos;
        String asterisco = "*";
        String space = " ";

        System.out.print("Introduce el numero de asteriscos: ");
        numeroAsteriscos = sc.nextInt();

        for (int i = 0; i <= numeroAsteriscos; i++) {
            System.out.println(asterisco);
            for (int z = 0; z <= numeroAsteriscos; z++) {
                System.out.print(asterisco);
            }
        }
    }
}
