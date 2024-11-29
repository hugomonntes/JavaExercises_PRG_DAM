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
    public static void mostrarPiramide(){
        // for (int i = 10; i >= 1; i--) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.printf("%2d", j);
        //     }
        //     System.out.println();
        // }

        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.printf(" ");
            }
            for (int a = i; a <= 10; a++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        mostrarPiramide();
        //bucles();
    }
}
