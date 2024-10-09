import java.util.Scanner;

public class Ejercicio21Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Spirit = 0;
        int Sombra = 0;
        int Tornado = 0;
        int Bucefalo = 0;
        int lineaDeMeta = 50;

        System.out.println("--Carreras de Caballos--");
        System.out.println("1. Spirit");
        System.out.println("2. Sombra");
        System.out.println("3. Tornado");
        System.out.println("4. Bucéfalo");

        for(int i = 0; Spirit < lineaDeMeta && Sombra < lineaDeMeta && Tornado < lineaDeMeta && Bucefalo < lineaDeMeta; i++){
            Spirit += (int)(Math.ceil(Math.random() * 3));
            Sombra += (int)(Math.ceil(Math.random() * 3));
            Tornado += (int)(Math.ceil(Math.random() * 3));
            Bucefalo += (int)(Math.ceil(Math.random() * 3));
        }

        System.out.printf("Spirit lleva %d /50 \n", Spirit);
        System.out.printf("Sombra lleva %d /50 \n", Sombra);
        System.out.printf("Tornado lleva %d /50 \n", Tornado);
        System.out.printf("Bucefalo lleva %d /50 \n", Bucefalo);
        System.out.printf("\n");
    }
}

/*
 * 21.Carreras de “caballos”. Se pide al usuario que seleccione un caballo entre
 * el 1 y
 * el 4. Una vez seleccionado empieza la carrera: Aleatoriamente se selecciona
 * un
 * caballo entre 1 y 4 y se mueven entre una y 3 posiciones. Se debe ir viendo
 * como avanzan todos los caballos. Ver las notas del final.
 */