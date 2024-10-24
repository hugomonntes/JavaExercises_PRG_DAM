import java.util.Scanner;
public class Ex9_b3 {
    /**
     * Averigua si el numero es primo o no.
     * @param number
     * @return true (Si es primo) o false (Si no es primo)
     */
    public static boolean isPrimo(int number){
        if (number <= 1) return false; //Si es menor que uno no es primo
        if (number == 2 || number == 3) return true; //Si es 2 / 3 es primo
        if (number % 2 == 0 || number % 3 == 0) return false; // Si es divisible entre 2 / 3 no es primo
        for (int i = 2; i < number; i++){
            if (number % i == 0) return false;
        }
        return true;
    }
    /**
     * Imprime todos los números primos hasta X número.
     * @param number
     */
    public static void mostrarPrimos(int number){
        for (int i = 3; i <= number; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int opcion;
        String fileUser;
        System.out.println("Introduce un número: ");
        number = sc.nextInt();
        System.out.println(isPrimo(number)); //Print si es Primo o No.
        mostrarPrimos(number); //Print los números primos hasta X número.
        do{
            System.out.printf("1.Mostrar numeros primos menores a %d", number);
            System.out.printf("2.Primos en archivo");
            System.out.printf("3.Archivo con primos");
            System.out.printf("4.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: isPrimo(number);
                break;
                case 2: System.out.println("Introduce el nombre de un archivos");
                        fileUser = sc.nextLine();
                break;
            
                default:
                    break;
            }
        } while(true);
    }
}

/*
**9. Modifica el ejercicio anterior de los números primos (solo el main) de forma
que hagas un menú clásico con estas opciones:
1. Mostrar primos menores que uno dado: Esto es lo que ya estaba del
ejercicio previo.
2. Primos en archivo: Pide el nombre de un archivo que debe contener
números, cada uno en una línea. Lee dicho archivo y muestra dichos números
en pantalla diciendo si son o no primos.
3. Archivo con primos: Similar a 1, se le pide un número mayor que 2 al
usuario y guarda en un archivo todos los primos desde 2 hasta el que meta el
usuario. Estarán todos en la misma línea separados por punto y coma (;).
4 Salir: El programa solo finaliza si se selecciona esta opción. 
*/