import java.util.Scanner;

public class Ex15s_b3 {
    public static String generarPj(){
        int numeroAleatorio = (int) (Math.random()*2);
        return numeroAleatorio == 0 ? "Bandido" : "Cliente";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionPuerta;
        String opcionDisparo;
        boolean shoot;
        int contadorDinero = 5;
        while (contadorDinero > 0) {
            System.out.print("Elige una puerta 1 o 2: ");
            opcionPuerta = sc.nextInt();
            sc.nextLine();
            System.out.print("Quieres disparar(s/n): ");
            opcionDisparo = sc.nextLine();
            shoot = opcionDisparo.equals("s") ? true : false;
            System.out.printf("En la puerta había: %s \n", generarPj());
            if (shoot && generarPj().equals("Cliente")) {
                contadorDinero--;
            } else {
                contadorDinero++;
            }
            System.out.println(contadorDinero);
        }
    }
}
/*
15. West Bank: Eres el valeroso sheriff de un perdido pueblo del viejo oeste y te
has enterado que una horda de bandidos ha decidido atracar el banco. Dicho banco
tiene tres puertas de entrada numeradas como 1 y 2. En el juego llegan bandidos o
clientes y debes actuar en consecuencia. Para ello la secuencia de juego será de
esta manera:
El sheriff (usuario) elige puerta (1 o 2) y si dispara o no.
Alguien abre una puerta aleatoria (1 o 2). Puede ser una bandido o un cliente.
Si la puerta del sheriff coincide con la de la persona que entra y este es un bandido
sucede lo siguiente:
• Si el sheriff había decidido disparar, mata al bandido y gana 1 punto.
• Si el sheriff había decidido no disparar tiene un 50% de probabilidad de
perder una vida (el juego comienza con 3 vidas).
Si la puerta del sheriff coincide con la de la persona que entra y este es un cliente
sucede lo siguiente:
• Si el sheriff había decidido disparar, tiene un 50% de posibilidades de matar
al cliente. En caso de matarlo pierde una vida.
• Si el sheriff había decidido no disparar el cliente puede entrar sin problema.
Por cada 3 clientes que entran se le da al sheriff una vida extra.
Busca modificaciones en probabilidades para hacer el juego lo más entretenido
posible.
Nota: La idea de este juego está basada de forma muy básica en el West Bank de
Dinamic o Bank Panic! de Sega
*/