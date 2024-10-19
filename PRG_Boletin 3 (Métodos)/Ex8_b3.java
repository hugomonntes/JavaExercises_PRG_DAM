import java.util.Scanner;
public class Ex8_b3 {
    /**
     * Averigua si el numero es primo o no.
     * @param number
     * @return true (Si es primo) o false (Si no es primo)
     */
    public static boolean isPrimo(int number){
        boolean isPrimo = true;
        if (number <= 1) {
            isPrimo = false;
        }
        if (number == 2 || number == 3) {
            isPrimo = true;
        } else if (number % 2 == 0 || number % 3 == 0) {
            isPrimo = false;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                isPrimo = false;
            }
        }
        return isPrimo;
    }
    /**
     * Imprime todos los números primos hasta X número.
     * @param number
     */
    public static void mostrarPrimos(int number){
        for (int i = 2; i <= number; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Introduce un número: ");
        number = sc.nextInt();
        System.out.println(isPrimo(number)); //Print si es Primo o No.
        mostrarPrimos(number); //Print los números primos hasta X número.
    }
}

/*
8. a) Escribir una función que se le pase un número y que devuelva true o false
dependiendo de si dicho número es o no es primo.

b) Para probarla haz un programa principal que pida un n.º mayor que 2 al usuario
y muestra los números primos menores que dicho número.

Nota: Un número es primo si y sólo si es divisible únicamente por 1 y por él mismo.
Por tanto para saber si un número es primo se debe dividir por todos los números
menores que él y mayores que 1, y si alguna de esas divisiones exacta entonces el
número NO es primo. Existen métodos de optimizar lo anterior, piensa a ver si se te
ocurre alguno. El 1 actualmente no se considera primo.
*/