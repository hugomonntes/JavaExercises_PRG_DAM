import java.util.Scanner;

public class Ex11_b3 {
    public static double calcularFactorial(int number){
        double acumulador = 1;
        for(double i = 1; i <= number; i++){
            acumulador = acumulador * i;
        }
        return acumulador;
    }

    public static double calcularPotencia(double base, int exponente){
        double acumulador = 1;
        if ((exponente < 0)) {
            for (int i = 0; i > exponente; i--) {
                acumulador *= (1/base);
            }
        }
        for (int i = 1; i <= exponente; i++) {
            acumulador *= base;
        }
        return acumulador;
    }

    public static double calcularCoseno(int numerCos){
        return 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Introduce un numero: ");
        number = sc.nextInt();
        System.out.println(calcularFactorial(number));
    }
}
/*
11. a) Realizar una función que devuelva el factorial de un número según se
definió en el boletín anterior (recuerda que 0!=1). Hazlo con parámetro int pero
que devuelva double o long.

b) El cálculo del coseno de un ángulo se puede aproximar por el siguiente cálculo
(aproximación de Taylor):

Realizar un método que realice y devuelva dicho cálculo (hazlo al menos hasta el
termino de potencia 4. Si quiere mete más). Debes usar la función factorial hecha
en el apartado anterior y la de potencia hecha en un ejercicio previo.
c) Realizar un programa que muestre por pantalla los cosenos de los ángulos de 0.1
, 0.2, y hasta 1 radian. Además en cada línea mostrará el resultado del coseno
según tu función y el error absoluto obtenido de restarlo de la función Math.cos().
Usa 5 decimales de aproximación para todo y que los valores ocupen 8 posiciones.
Opcional: Realiza la función factorial aplicando recursividad (ver apéndice de
apuntes, evita buscar en internet).
*/