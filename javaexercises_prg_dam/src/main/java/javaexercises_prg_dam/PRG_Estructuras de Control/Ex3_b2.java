import java.util.Scanner;

public class Ex3_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userNum;
        int acumulador = 0;

        System.out.print("Dame tu numero de usuario: ");
        userNum = sc.nextInt();

        if (userNum > 0) {
            for (int i = 1; i <= userNum; i++) {
                //System.out.println("Contador: " +i);
                acumulador = acumulador + i;
            }
            System.out.println("Acumulador: " + acumulador);
        } else {
            System.out.println("Error! Introduce un número positivo");
        }
    }
}
