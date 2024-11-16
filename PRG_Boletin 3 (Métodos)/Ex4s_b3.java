public class piramide {
    public static void mostrarPiramide(){
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        mostrarPiramide();
    }
}
