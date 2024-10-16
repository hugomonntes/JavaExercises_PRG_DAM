import java.util.Scanner;

public class Ex18_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numero;
        long acumulador = 1;
        int contador = 1;

        System.out.print("Introduce un número para calcular su factorial: ");
        numero = sc.nextLong();
        for(long i = 1; i <= numero; i++){
            acumulador = acumulador * i;
        }
        System.out.println("Solución For: " + acumulador);

        //Reiniciar variables.
        acumulador = 1;
        contador = 1;

        while (contador <= numero) {
            acumulador = acumulador * contador;
            contador++;
        }
        System.out.println("Solución While: " + acumulador);

        
        //Reiniciar variables.
        acumulador = 1;
        contador = 1;

        do{
            acumulador = acumulador * contador;
            contador++;
        }
        while (contador <= numero);
        System.out.println("Solución DoWhile: " + acumulador);
    }                                                            
}

/*
18.Realizar un programa que calcule el factorial de un número (usar tipo long o
real) introducido por el usuario (haz sólo un programa que realice 3 veces el
cálculo). No se permite el uso de sentencias if:
a) Con un bucle for.
b) Con un bucle do-while
c) Con un bucle while
Nota: El factorial de un número es el número multiplicado por los anteriores incluso
el 1. Como por ejemplo, factorial de 7 es 7*6*5*4*3*2*1. La excepción es el 0
cuyo factorial es 1 (0!=1).
*/