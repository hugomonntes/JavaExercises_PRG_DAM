import java.util.Scanner;

public class Ejercicio20Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAstersicos;
        String asterisco = "*";
        String space = " ";
        String opcionD;

        System.out.print("Introduce el numero de asteriscos: ");
        numeroAstersicos = sc.nextInt();
        System.out.print("Introduce Derecha o Izquierda (D/I): ");
        sc.nextLine();
        opcionD = sc.nextLine();

        if (opcionD.equals("d")) {
            for (int i = 0; i <= numeroAstersicos; i++) {
                System.out.println(asterisco);
                for (int contadorEspacios = 0; contadorEspacios <= i; contadorEspacios++) {
                    System.out.print(space);
                }
            }
        }
        System.out.print("Prueba");
    }
}

/*
20.a) Visualizar en pantalla una figura similar a la siguiente:
*
**
***
****
*****
siendo variable (decidido por el usuario) el número de líneas a mostrar.
b) A continuación, y con la misma cantidad de líneas que en el caso anterior, dibuja
una pirámide como esta:
  *
 ***
 *****
 *******
*********
*/