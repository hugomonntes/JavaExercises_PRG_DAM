import java.util.Scanner;

public class Ejercicio21Boletin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //#region VARIABLES INICIALES 
        int posSpirit, posSombra, posTornado, posBucefalo;
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
        int saldoApostado = 0;
        int opcion = 0;
        String opcionVerificarApuesta = "";
        int caballoSeleccionado = 0;
        String jugarDeNuevo = "";
        //#endregion

        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                 ¡Bienvenid@ al Hipódromo!                ║");
        System.out.println("║                   Saldo Inicial de 500€                  ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        do {
            posSpirit = 0;
            posSombra = 0;
            posTornado = 0;
            posBucefalo = 0;

            if (saldoInicial <= 0) {
                System.out.println("Te has quedado sin saldo. ¡Gracias por jugar!");
                break;
            }

            System.out.println("\nElige tu caballo:");
            System.out.println("1. Spirit (Dorsal 13)");
            System.out.println("2. Sombra (Dorsal 45)");
            System.out.println("3. Tornado (Dorsal 98)");
            System.out.println("4. Bucefalo (Dorsal 66)");
            System.out.println("5. Salir del hipódromo.");
            System.out.print("Selecciona tu caballo (1/4) o Pulsa (5) para Salir: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    caballoSeleccionado = 1;
                    System.out.println("Has seleccionado a Spirit ¡Suerte!");
                    break;
                case 2:
                    caballoSeleccionado = 2;
                    System.out.println("Has seleccionado a Sombra ¡Suerte!");
                    break;
                case 3:
                    caballoSeleccionado = 3;
                    System.out.println("Has seleccionado a Tornado ¡Suerte!");
                    break;
                case 4:
                    caballoSeleccionado = 4;
                    System.out.println("Has seleccionado a Bucefalo ¡Suerte!");
                    break;

                case 5:
                System.out.println("Hasta luego, te esperamos de vuelta!");
                jugarDeNuevo = "N";
                break;

                default:
                    System.out.println("Introduce una opción válida!");
                    continue;
            }

            do {
                System.out.print("Cantidad a apostar (Saldo actual: " + saldoInicial + "€): ");
                saldoApostado = sc.nextInt();

                while (saldoApostado > saldoInicial) {
                    System.out.println("No tienes suficiente saldo para esa apuesta.");
                    System.out.print("Por favor, introduce una cantidad válida (Saldo actual: " + saldoInicial + "€): ");
                    saldoApostado = sc.nextInt();
                }

                System.out.println("Has apostado: " + saldoApostado + "€");
                System.out.print("Pulsa (S) para continuar o (N) para cancelar: ");
                sc.nextLine();
                opcionVerificarApuesta = sc.nextLine().toUpperCase();
            } while (opcionVerificarApuesta.equals("N"));


            while (posSpirit < lineaDeMeta && posSombra < lineaDeMeta && posTornado < lineaDeMeta && posBucefalo < lineaDeMeta) {
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }

                posSpirit += (int) (Math.ceil(Math.random() * 3));
                posSombra += (int) (Math.ceil(Math.random() * 3));
                posTornado += (int) (Math.ceil(Math.random() * 3));
                posBucefalo += (int) (Math.ceil(Math.random() * 3));

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

            // Caballo Ganador
            int ganador = 0;
            if (posSpirit >= lineaDeMeta) {
                ganador = 1;
                System.out.println("¡Spirit ha ganado la carrera!");
            } else if (posSombra >= lineaDeMeta) {
                ganador = 2;
                System.out.println("¡Sombra ha ganado la carrera!");
            } else if (posTornado >= lineaDeMeta) {
                ganador = 3;
                System.out.println("¡Tornado ha ganado la carrera!");
            } else if (posBucefalo >= lineaDeMeta) {
                ganador = 4;
                System.out.println("¡Bucefalo ha ganado la carrera!");
            }

            //APUESTAS
            if (ganador == caballoSeleccionado) {
                saldoInicial += saldoApostado * 2;
                System.out.println("¡Felicidades! Has ganado " + (saldoApostado * 2) + "€.");
            } else {
                saldoInicial -= saldoApostado;
                System.out.println("Lo siento, has perdido " + saldoApostado + "€. Saldo restante: " + saldoInicial + "€.");
            }

            System.out.print("¿Quieres volver a jugar? (S/N): ");
            jugarDeNuevo = sc.nextLine().toUpperCase();

        } while (jugarDeNuevo.equals("S") && saldoInicial > 0);

        System.out.println("Gracias por jugar. Tu saldo final es: " + saldoInicial + "€.");
    }
}
