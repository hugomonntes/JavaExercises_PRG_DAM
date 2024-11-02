import java.util.Scanner;

public class Ex13_b3 {
    public static double tirarDado(){
        double randomNumber = Math.ceil(Math.random()*20);
        return randomNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName;
        double userNumber;
        double dado1 = tirarDado();
        double dado2 = tirarDado();
        int contadorNumerosAcertados = 0;
        System.out.print("Introduce tu nombre: ");
        userName = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print("Introduce un número: ");
            userNumber = sc.nextInt();
            if (userNumber == dado1 || userNumber == dado2) {
                contadorNumerosAcertados++;
            }
        }
        System.out.printf("%s has acertado %d números \n",userName,contadorNumerosAcertados);
    }
}

/*
Dados d20. Realizar un programa que pida al usuario su nombre y 3
números distintos al usuario entre 1 y 20 (usar 3 variables) y luego que el
ordenador “tira” dos dados de 20 caras. Si el segundo dado sale repetido, debe
volver a tirarse hasta que salga distinto.
Debe indicar los aciertos que ha tenido el usuario. Evita repetir código haciendo
funciones. El usuario debe poder repetir el juego al finalizar.
b) Modifica el programa anterior para que el usuario pueda elegir la cantidad de
caras de los dados antes de jugar.
Además en un archivo de récords debe añadirse en una nueva línea el nombre de
usuario, el número de caras del dado ocupando 4 posiciones y los aciertos
ocupando 4 posiciones (debes guardar usando printf todo en una nueva línea).
Cuando el usuario decida finalizar, antes de terminar el programa se mostrará el
archivo de récords entero.
*/

/*
Bienvenido al juego de los dados de 20 caras.
Por favor, introduce tu nombre: Hugo

Hola, Hugo. Por favor, introduce 3 números diferentes entre 1 y 20.
Número 1: 7
Número 2: 15
Número 3: 19

El ordenador tira los dados...

Dado 1: 12
Dado 2: 15

¡Has acertado 1 número!

¿Quieres jugar otra vez? (s/n): s
*/