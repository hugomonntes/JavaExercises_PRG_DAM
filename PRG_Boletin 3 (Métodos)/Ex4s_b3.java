import java.io.FileWriter;
import java.io.PrintWriter;

public class Ex4s_b3 {
    public static void bucles(){
        for (int i = 40; i >= 5; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        int acumulador = 1;
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                acumulador *= i;
                System.out.println(acumulador);
            }
        }
    }
    public static void mostrarPiramide() throws Exception {
        PrintWriter fWriter = new PrintWriter(new FileWriter("piramide.txt"));
        for (int i = 10; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.printf("%2d", j);
                fWriter.printf("%2d", j);
            }
            System.out.println();
            fWriter.printf("\n");
        }
        fWriter.close();
    }
    public static void main(String[] args) throws Exception {
        mostrarPiramide();
    }
}
