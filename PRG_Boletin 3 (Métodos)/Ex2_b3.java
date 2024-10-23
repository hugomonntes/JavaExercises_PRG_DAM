import java.io.PrintWriter;
import java.util.Scanner;
public class Ex2_b3 {
    public static void lineasEnBlanco(int numeroLineas){//coment
        for (int i = 0; i <= numeroLineas; i++){
            System.out.println("");
        }
    }

    /**
     * Comprobar si es Par.
     * @param number
     * @return true si es par, false si es impar.
     */
    public static boolean isPar(int number){
        return number % 2 == 0  ;
    }

    /**
     * Comprobar si es Positivo.
     * @param number2
     * @return "P" si es positivo, "N" si es negativo.
     */
    public static String isPositive(int number2){ //char no string
        return number2 >= 0 ? "P" : "N";
    }
    public static void main(String[] args) throws Exception {
        String userName;
        int userNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        userName = sc.nextLine();
        lineasEnBlanco(10);
        System.out.print("Introduce un número: ");
        userNumber = sc.nextInt();
        System.out.println(isPar(userNumber));
        System.out.println(isPositive(userNumber));

        //EX2
        PrintWriter f = new PrintWriter("Ex2_b3.txt");
        f.printf("%s \n", userName);
        f.printf("%d \n", userNumber);
        if (isPar(userNumber) && isPositive(userNumber).equals("P")) {//TODO reducir el código
            f.printf("El número %d es par y positivo", userNumber);
        } else if (!isPar(userNumber) && isPositive(userNumber).equals("P")){
            f.printf("El número %d es impar y positivo", userNumber);
        } else if (isPar(userNumber) && isPositive(userNumber).equals("N")){
            f.printf("El número %d es par y negativo", userNumber);
        } else{
            f.printf("El número %d es impar y negativo", userNumber);
        }

        f.close();
    }
}
/*
**2. Amplia el programa anterior (directamente el main) para que guarde en un
archivo los siguientes datos: el nombre en una línea, el número en la siguiente y si
es par/impar y positivo/negativo.
El archivo queda algo así:
Minerva McGonagall
-5
El n.º es impar in negativo.
*/