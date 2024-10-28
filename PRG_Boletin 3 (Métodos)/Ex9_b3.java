import java.io.File;
import java.util.Scanner;

public class Ex9_b3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int number;
        int opcion;
        String fileUser;
        System.out.println("Introduce un número: ");
        number = sc.nextInt();
        do {
            System.out.printf("1.Mostrar numeros primos menores a %d \n", number);
            System.out.printf("2.Primos en archivo \n");
            System.out.printf("3.Archivo con primos \n");
            System.out.printf("4.Salir \n");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    Ex8_b3.mostrarPrimos(number);
                    break;
                case 2:
                    fileUser = "PRG_Archivos/Ex9_b3_Numeros.txt";
                    Scanner freader = new Scanner(new File(fileUser));
                    int contenido;
                    while (freader.hasNext()) {
                        contenido = freader.nextInt();
                        System.out.printf(Ex8_b3.isPrimo(contenido) ? "%d es primo \n" : "%d no es primo \n", contenido);
                    }
                    break;
                default:
                    break;
            }
        } while (true);
    }
}

/*
 ** 9. Modifica el ejercicio anterior de los números primos (solo el main) de
 * forma
 * que hagas un menú clásico con estas opciones:
 * 1. Mostrar primos menores que uno dado: Esto es lo que ya estaba del
 * ejercicio previo.
 * 2. Primos en archivo: Pide el nombre de un archivo que debe contener
 * números, cada uno en una línea. Lee dicho archivo y muestra dichos números
 * en pantalla diciendo si son o no primos.
 * 3. Archivo con primos: Similar a 1, se le pide un número mayor que 2 al
 * usuario y guarda en un archivo todos los primos desde 2 hasta el que meta el
 * usuario. Estarán todos en la misma línea separados por punto y coma (;).
 * 4 Salir: El programa solo finaliza si se selecciona esta opción.
 */