import java.util.Scanner;
public class Ejercicio9Boletin2ºForma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int n1;
        int maximo = 0;
        
        System.out.print("Cuanto numeros desea introducir: ");
        n = sc.nextInt();

        for (int cont = 0; cont < n; cont++)  {
            System.out.print("Introduzca un numero: ");
            n1 = sc.nextInt();
            if (maximo <= n1){
                maximo = n1;
            }
        }
        System.out.printf("Maximo es: %d", maximo);
    }
}
