import java.util.Scanner;

public class Ejercicio14Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int contador = 0;
        int contadorNumerosNegativos = 0;
        int acumulador = 0;
        double calcularMedia;
        
        System.out.println("Introduce 0 para parar el programa.");

        do{
            System.out.print("Introduce un numero:");
            numeros = sc.nextInt();
            if (numeros != 0) {
                contador++;
                acumulador = acumulador + numeros;
            }
            if (numeros < 0) {
                contadorNumerosNegativos++;
            }
        } while (numeros != 0);
        System.out.printf("Se introdujeron %d números negativos de un total de %d \n",contadorNumerosNegativos, contador);

    }
}

/*
14.Contar la cantidad de números negativos introducidos por el usuario. Se termina
cuando el usuario introduce el cero. Se debe informar también del total de
números introducidos (no se cuenta el cero).
Ejemplo de salida:
Introduce número: -10
Introduce número: -2
Introduce número: 3
Introduce número: 0
Se introdujeron 2 números negativos de un total de 3.
 */