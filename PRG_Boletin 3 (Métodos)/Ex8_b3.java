import java.util.Scanner;
public class Ex8_b3 {
    public static boolean isPrimo(int number){
            return number % 2 == 0 ? false : number % 3 == 0 ? false : true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrimo(102));
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