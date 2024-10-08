import java.util.Scanner;

public class Ejercicio7Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros;
        int contador = 0;
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
        } while (numeros != 0);
        calcularMedia = acumulador / contador;

        System.out.println("La media es: " + calcularMedia);
    }
}

/*
7. a) Realizar un programa que acepte 5 números del usuario y calcule y muestre
su media (la media es la suma de los números dividido entre 5). Al final debe
permitir ejecutar de nuevo el programa o salir del mismo.
Nota: Puedes hacer directamente el apartado (b) y saltarte el (a).
b) Mejorar el apartado anterior (o realiza otro programa) de forma que admita
una cantidad indefinida de números. Es decir, el usuario introduce números y
acaba cuando pulse el 0. En ese momento calcula la media (el 0 no se incluirá
en el cálculo de la media). 
*/