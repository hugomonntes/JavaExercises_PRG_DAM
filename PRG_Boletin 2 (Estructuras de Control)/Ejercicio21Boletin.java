import java.util.Scanner;

public class Ejercicio21Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //#region variables inicio caballos + dibujos de los caballos. 
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
        //TODO Hacer que los dorsales y los nombres de los caballos salgan aleatoriamente en cada carrera
        //TODO Hacer como un metodo de apostar por cada caballo
        //TODO Que tengas un saldo inicial y si pierde dependiendo X posicion del caballo t reste hasta que llegues a importe 0
        //TODO Hacer el IF para saber quien es el ganador
        //TODO Sumar porcentaje a la victoria por ganar y sumar saldo al inicial
        //TODO Restar saldos en caso de derrota del caballo

        int saldoInicial = 500;
        int saldoApostado;
        int opcion;

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
                System.out.println("Cantidad a apostar: ");
                saldoApostado = sc.nextInt();
                break;

                case 2:
                System.out.println("Has seleccionado a Sombra ¡Suerte!");
                System.out.println("Cantidad a apostar: ");
                saldoApostado = sc.nextInt();
                break;

                case 3:
                System.out.println("Has seleccionado a Tornado ¡Suerte!");
                System.out.println("Cantidad a apostar: ");
                saldoApostado = sc.nextInt();
                break;

                case 4:
                System.out.println("Has seleccionado a Bucefalo ¡Suerte!");
                System.out.println("Cantidad a apostar: ");
                saldoApostado = sc.nextInt();
                break;

                case 5: //FIXME Al introducir el 5 juega la carrera y no sale, sale dsps
                System.out.println("Hasta luego te esperamos de vuelta!");
                break;
                
                default:
                System.out.println("Introduce una opción válida!");
                break;
            }

            while (posSpirit < lineaDeMeta && posSombra < lineaDeMeta) {
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

        } while(opcion != 5);

        // System.out.println("--Carreras de Caballos--");
        // System.out.println("1. Spirit / Dorsal 70");
        // System.out.println("2. Sombra / Dorsal 45");
        // System.out.println("3. Tornado / Dorsal 13");
        // System.out.println("4. Bucéfalo / Dorsal 51");
        // for(int i = 0; Spirit < lineaDeMeta && Sombra < lineaDeMeta && Tornado <
        // lineaDeMeta && Bucefalo < lineaDeMeta; i++){
        // Spirit += (int)(Math.ceil(Math.random() * 3));
        // for(int x = 0; x <= i; x++){
        // System.out.println(espaciosAvanzar);
        // }
        // Sombra += (int)(Math.ceil(Math.random() * 3));
        // Tornado += (int)(Math.ceil(Math.random() * 3));
        // Bucefalo += (int)(Math.ceil(Math.random() * 3));
        // }

        // System.out.printf("Spirit lleva %d /50 \n", Spirit);
        // System.out.printf("Sombra lleva %d /50 \n", Sombra);
        // System.out.printf("Tornado lleva %d /50 \n", Tornado);
        // System.out.printf("Bucefalo lleva %d /50 \n", Bucefalo);
        // System.out.printf("\n");
    }
}