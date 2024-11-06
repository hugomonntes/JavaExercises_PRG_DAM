import java.io.PrintWriter;
import java.util.Scanner;

public class Ex13_b3 {
    /**
     * Genera un número del 1 al numero de caras indicado por el usuario
     * @param numeroCarasDado Numero de caras del dado
     * @return un numero aleatorio entre 1 y el numero máximo de caras
     */
    public static double tirarDado(int numeroCarasDado) {
        double randomNumber = Math.ceil(Math.random() * numeroCarasDado);
        return randomNumber;
    }

    public static void main(String[] args) throws Exception {//TODO  Comprobacion  neg y rangos
        Scanner sc = new Scanner(System.in);
        String userName;
        int numeroCarasDado;
        double userNumber;
        String volverJugar;
        int contadorNumerosAcertados = 0;
        System.out.print("Introduce tu nombre: ");
        userName = sc.nextLine();
        do {
            System.out.print("Introduce el número de caras del dado: ");
            numeroCarasDado = sc.nextInt();
            double dado1 = tirarDado(numeroCarasDado);
            double dado2 = tirarDado(numeroCarasDado);
            for (int i = 0; i < 3; i++) {
                System.out.print("Introduce un número: ");
                userNumber = sc.nextInt();
                if (userNumber == dado1 || userNumber == dado2) {
                    contadorNumerosAcertados++;
                }
            }
            System.out.printf("%s has acertado %d números \n", userName, contadorNumerosAcertados);
            System.out.println("Quieres volver a jugar? (S/N)");
            sc.nextLine();
            volverJugar = sc.nextLine().toUpperCase();
        } while (volverJugar.equals("S"));
        sc.close();//TODO añadir record y en cada juego
        
        PrintWriter fwriter = new PrintWriter("JavaExercises-PRG_Boletin2/PRG_Archivos/Records.txt");
        fwriter.printf("Nombre: %s,  Numero Caras Dado: %d, Numero Aciertos: %d", userName, numeroCarasDado,
                contadorNumerosAcertados);
        fwriter.close();
    }
}

/*
Dados d20. Realizar un programa que pida al usuario su nombre y 3
números distintos al usuario entre 1 y 20 (usar 3 variables) y luego que el
ordenador “tira” dos dados de 20 caras. Si el segundo dado sale repetido,
debe
volver a tirarse hasta que salga distinto.
Debe indicar los aciertos que ha tenido el usuario. Evita repetir código
haciendo
funciones. El usuario debe poder repetir el juego al finalizar.
b) Modifica el programa anterior para que el usuario pueda elegir la cantidad
de
caras de los dados antes de jugar.
Además en un archivo de récords debe añadirse en una nueva línea el nombre de
usuario, el número de caras del dado ocupando 4 posiciones y los aciertos
ocupando 4 posiciones (debes guardar usando printf todo en una nueva línea).
Cuando el usuario decida finalizar, antes de terminar el programa se mostrará
el
archivo de récords entero.
 */
