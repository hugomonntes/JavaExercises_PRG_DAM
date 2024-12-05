import java.util.Scanner;
public class Ex1_b3 {
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
    public static String isPositive(int number2){//char no string
        return number2 <= 0 ? "P" : "N";
    }
    public static void main(String[] args) {
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
        sc.close();
    }
}
/*
1. En el mismo archivo haz las siguientes funciones:

a) Codifica un método que deje en pantalla n líneas en blanco ( es un parámetro).
No devuelve nada.

b) Escribe una función denominada par con un único parámetro entero. Devuelve
true si el parámetro es número par y false si no lo es. No muestra nada.

c) Escribir una función que tenga un argumento (otra forma de llamar a un
parámetro) de tipo entero y que devuelva la letra ‘P’ (devuelve char) si el número
es positivo o cero y la letra ‘N’ si es negativo. Intenta hacerlo con el operador
ternario (ver Apéndice II del Tema 2); si no te sale hazlo con if.

d) En el programa principal primero pides el nombre del usuario. A continuación
dejas deja 10 líneas en blanco mediante la 1ª función. Luego pides un número
entero al usuario e indicas si es par y positivo o negativo
*/