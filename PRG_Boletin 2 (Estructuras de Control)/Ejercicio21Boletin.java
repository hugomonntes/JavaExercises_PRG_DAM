import java.util.Scanner;

public class Ejercicio21Boletin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //#region VARIABLES INICIALES 
        int posSpirit = 0;
        int posSombra = 0;
        int posTornado = 0;
        int posBucefalo = 0;
        int lineaDeMeta = 50;
        String spiritDibujo = ":--:º";
        String sombraDibujo = ":--:º";
        String tornadoDibujo = ":--:º";
        String bucefaloDibujo = ":--:º";
        String espaciosAvanzar = " ";
        String circuito = "================================================================";
        //#endregion
        //#region VARIABLES APUESTAS.
        int saldoInicial = 500;
        int saldoApostado;
        int opcion;
        String opcionVerificarApuesta;
        //#endregion
        //#region TODO'S
        //TODO Crear una función que pinte la linea de meta maxima pasar como parametro el Num RAndom MAYOR comparados entre ellos con Math.Max();
        //TODO Hacer como un metodo de apostar por cada caballo
        //TODO Que tengas un saldo inicial y si pierde dependiendo X posicion del caballo t reste hasta que llegues a importe 0
        //TODO Hacer el IF para saber quien es el ganador
        //TODO Sumar porcentaje a la victoria por ganar y sumar saldo al inicial
        //TODO Restar saldos en caso de derrota del caballo
        //TODO Hacer que los dorsales y los nombres de los caballos salgan aleatoriamente en cada carrera
        //TODO Hacer array con todos los caballos que el user escoja uno, y los otros tres corran aleatoriamente
        //#endregion;
        do{
            System.out.println("╔══════════════════════════════════════════════════════════╗");
            System.out.println("║                 ¡Bienvenid@ al Hipódromo!                ║");
            System.out.println("║                   Saldo Inicial de 500€                  ║");
            System.out.println("║                     Elige tu caballo:                    ║");
            System.out.println("╚══════════════════════════════════════════════════════════╝");

            System.out.println("1. Spirit (Dorsal 13)");
            System.out.println("2. Sombra (Dorsal 45)");
            System.out.println("3. Tornado (Dorsal 98)");
            System.out.println("4. Bucefalo (Dorsal 66)");
            System.out.println("5. Salir del hipódromo.");
            System.out.print("Selecciona tu caballo (1/4) o Pulsa (5) para Salir: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("Has seleccionado a Spirit ¡Suerte!");
                break;

                case 2:
                System.out.println("Has seleccionado a Sombra ¡Suerte!");
                break;

                case 3:
                System.out.println("Has seleccionado a Tornado ¡Suerte!");
                break;

                case 4:
                System.out.println("Has seleccionado a Bucefalo ¡Suerte!");
                break;

                case 5: //FIXME Al introducir el 5 juega la carrera y no sale, sale dsps
                System.out.println("Hasta luego te esperamos de vuelta!");
                break;
                
                default:
                System.out.println("Introduce una opción válida!");
                break;
            }

            do{
                System.out.print("Cantidad a apostar: ");
                saldoApostado = sc.nextInt();
                System.out.println("Has apostado: " + saldoApostado + "€");
                System.out.print("Pulsa (S) para continuar o (N) para cancelar: ");
                sc.nextLine();
                opcionVerificarApuesta = sc.nextLine().toUpperCase();
            } while (opcionVerificarApuesta.equals("N"));

            if (opcion != 5) {
                while (posSpirit < lineaDeMeta && posSombra < lineaDeMeta && posTornado < lineaDeMeta && posBucefalo < lineaDeMeta) {
                    for (int i = 0; i < 50; i++) {
                        System.out.println();
                    }
        
                    posSpirit += (int)(Math.ceil(Math.random() * 3));
                    posSombra += (int)(Math.ceil(Math.random() * 3));
                    posTornado += (int)(Math.ceil(Math.random() * 3));
                    posBucefalo += (int)(Math.ceil(Math.random() * 3));
        
                    System.out.println(circuito);
        
                    for (int i = 0; i < posSpirit; i++) {
                        System.out.print(espaciosAvanzar);
                    }
                    System.out.println("(Spirit) " + spiritDibujo);
        
                    for (int i = 0; i < posSombra; i++) {
                        System.out.print(espaciosAvanzar);
                    }
                    System.out.println("(Sombra) " + sombraDibujo);
        
                    for (int i = 0; i < posTornado; i++) {
                        System.out.print(espaciosAvanzar);
                    }
                    System.out.println("(Tornado) " + tornadoDibujo);
        
                    for (int i = 0; i < posBucefalo; i++) {
                        System.out.print(espaciosAvanzar);
                    }
                    System.out.println("(Bucefalo) " + bucefaloDibujo);
        
                    System.out.println(circuito);
        
                    long startTime = System.currentTimeMillis();
                    while (System.currentTimeMillis() - startTime < 200) {
                    }
                }
            }
        } while(opcion != 5);
    }
}