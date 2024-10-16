import java.util.Scanner;

public class Ex9_2_b2 {
    public static void main(String[] args) { // TODO negativos
        Scanner sc = new Scanner(System.in);
        int n;
        int n1;
        int maximo = 0;

        System.out.print("Cuanto numeros desea introducir: ");
        n = sc.nextInt();
        n = Math.abs(n);

        for (int cont = 0; cont < n; cont++) {
            System.out.print("Introduzca un numero: ");
            n1 = sc.nextInt();
            n1 = Math.abs(n1);
            if (maximo <= n1) {
                maximo = n1;
            }
        }
        System.out.printf("Maximo es: %d \n", maximo);
    }
}
