import java.util.Scanner;
import java.util.Arrays;

public class Ex9_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numerosIntroducidos;
        int[] numbers;

        System.out.print("Cuantos números deseas introducir: ");
        numerosIntroducidos = sc.nextInt();

        numbers = new int[numerosIntroducidos];

        for(int i = 0; i < numerosIntroducidos; i++){
            System.out.print("Introduce número: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}