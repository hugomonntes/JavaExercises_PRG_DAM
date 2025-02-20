package javaexercises.PRG_Métodos;

public class Ex17_b3 {
    public static void conversion(int limit, boolean flag){
        String hex = "HEX";
        String dec = "DEC";
        String oct = "OCT";
        if (flag) {
            System.out.printf(" %4s | %4s \n", dec, oct);
            System.out.println("---------------");
            for (int i = 0; i < 10; i++) {
                System.out.printf(" %4d | %4o \n", i, i);
            }
        } else {
            System.out.printf(" %4s | %4s \n", dec, hex);
            System.out.println("---------------");
            for (int i = 0; i < 10; i++) {
                System.out.printf(" %4d | %4h \n", i, i);
            }
        }
    }
    public static void main(String[] args) {
        conversion(100, true);
    }
}
