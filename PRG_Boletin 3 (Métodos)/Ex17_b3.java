public class Ex17_b3 {
    public static void conversion(){
        String hex = "HEX";
        String dec = "DEC";
        String oct = "OCT";
        System.out.printf(" %4s | %4s | %4s \n", dec, hex, oct);
        System.out.println("----------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %4d | %4h | %4o \n", i, i, i);
        }
    }
    public static void main(String[] args) {
        conversion();
    }
}
