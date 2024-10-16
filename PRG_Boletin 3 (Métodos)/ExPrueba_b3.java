import java.util.Scanner;
public class ExPrueba_b3 {
    
    public static int sumNumbers(int number){
        int acumulador = 0;
        
        for (int i = 1; i <= number; i++) {
            acumulador += i;
        }

        return acumulador;
    }

    public static String sayMesg(String msg){
        return msg;
    }

    public static void main(String[] args) {
        int numbers;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numbers = sc.nextInt();
        System.out.println(sumNumbers(numbers));
        System.out.println(sayMesg("Hello"));
    }       
}

/*
1. Realizar una función que sume 1+2+3+…+n y devuelva el resultado.
n será un parámetro. En el programa principal ejecútala dos veces para
luego mostrar la suma hasta 10 y hasta 10000.
*/