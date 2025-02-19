import java.util.Scanner;

public class Ex20_b2 {
    public static void pintar(int n){
        int numeroAsteriscos = n;
        String asterisco = "*";
        String space = " ";
        for (int i = 1; i <= numeroAsteriscos; i++) {
            for (int j = 1; j <= numeroAsteriscos - i; j++) {
                System.out.print(space);
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(asterisco);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAsteriscos;
        String asterisco = "*";
        String space = " ";
        int sumaAst = 0;

        System.out.print("Introduce el numero de asteriscos: ");
        numeroAsteriscos = sc.nextInt();

        for (int i = 1; i <= numeroAsteriscos; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(asterisco);
            }
            System.out.println(space);
        }

        System.out.println("\n");
        pintar(numeroAsteriscos);
    }
}
