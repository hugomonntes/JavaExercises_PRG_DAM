import java.util.Scanner;

public class Ex21_b2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //#region VARIABLES INICIALES 
        int posSpirit, posAndrea, posCarla, posMaripi;
        int lineaDeMeta = 260;
        String SpiritDibujo = ":--:º";
        String AndreaDibujo = ":--:º";
        String CarlaDibujo = ":--:º";
        String MaripiDibujo = ":--:º";
        String espaciosAvanzar = " ";
        String circuito = "========================================================================================================================================================================";
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
            posAndrea = 0;
            posCarla = 0;
            posMaripi = 0;

            if (saldoInicial <= 0) {
                System.out.println("Te has quedado sin saldo. ¡Gracias por jugar!");
                break;
            }

            System.out.println("\nElige tu caballo:");
            System.out.println("1. Spirit (Dorsal 13)");
            System.out.println("2. Andrea (Dorsal 45)");
            System.out.println("3. Carla (Dorsal 98)");
            System.out.println("4. Maripi (Dorsal 66)");
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
                    System.out.println("Has seleccionado a Andrea ¡Suerte!");
                    break;
                case 3:
                    caballoSeleccionado = 3;
                    System.out.println("Has seleccionado a Carla ¡Suerte!");
                    break;
                case 4:
                    caballoSeleccionado = 4;
                    System.out.println("Has seleccionado a Maripi ¡Suerte!");
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


            while (posSpirit < lineaDeMeta && posAndrea < lineaDeMeta && posCarla < lineaDeMeta && posMaripi < lineaDeMeta) {
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }

                posSpirit += (int) (Math.ceil(Math.random() * 5));
                posAndrea += (int) (Math.ceil(Math.random() * 5));
                posCarla += (int) (Math.ceil(Math.random() * 5));
                posMaripi += (int) (Math.ceil(Math.random() * 5));

                System.out.println(circuito);

                for (int i = 0; i < posSpirit; i++) {
                    System.out.print(espaciosAvanzar);
                }
                System.out.println("(Spirit) " + SpiritDibujo);

                for (int i = 0; i < posAndrea; i++) {
                    System.out.print(espaciosAvanzar);
                }
                System.out.println("(Andrea) " + AndreaDibujo);

                for (int i = 0; i < posCarla; i++) {
                    System.out.print(espaciosAvanzar);
                }
                System.out.println("(Carla) " + CarlaDibujo);

                for (int i = 0; i < posMaripi; i++) {
                    System.out.print(espaciosAvanzar);
                }
                System.out.println("(Maripi) " + MaripiDibujo);

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
            } else if (posAndrea >= lineaDeMeta) {
                ganador = 2;
                System.out.println("¡Andrea ha ganado la carrera!");
            } else if (posCarla >= lineaDeMeta) {
                ganador = 3;
                System.out.println("¡Carla ha ganado la carrera!");
            } else if (posMaripi >= lineaDeMeta) {
                ganador = 4;
                System.out.println("¡Maripi ha ganado la carrera!");
            }

            //APUESTAS
            if (ganador == caballoSeleccionado) {
                saldoInicial += saldoApostado;
                System.out.println("¡Felicidades! Has ganado " + (saldoInicial) + "€.");
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
