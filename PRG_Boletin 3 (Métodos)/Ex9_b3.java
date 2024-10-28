import java.util.Scanner;
public class Ex9_b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int opcion;
        String fileUser;
        System.out.println("Introduce un número: ");
        number = sc.nextInt();
        System.out.println(Ex8_b2.isPrimo(number)); //Print si es Primo o No.
        Ex8_b2.mostrarPrimos(number); //Print los números primos hasta X número.
        do{
            System.out.printf("1.Mostrar numeros primos menores a %d", number);
            System.out.printf("2.Primos en archivo");
            System.out.printf("3.Archivo con primos");
            System.out.printf("4.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: Ex8_b2.mostrarPrimos(number);
                break;
                case 2: System.out.println("Introduce el nombre de un archivos");
                        fileUser = sc.nextLine();
                break;
            
                default:
                    break;
            }
        } while(true);
    }
}

/*
**9. Modifica el ejercicio anterior de los números primos (solo el main) de forma
que hagas un menú clásico con estas opciones:
1. Mostrar primos menores que uno dado: Esto es lo que ya estaba del
ejercicio previo.
2. Primos en archivo: Pide el nombre de un archivo que debe contener
números, cada uno en una línea. Lee dicho archivo y muestra dichos números
en pantalla diciendo si son o no primos.
3. Archivo con primos: Similar a 1, se le pide un número mayor que 2 al
usuario y guarda en un archivo todos los primos desde 2 hasta el que meta el
usuario. Estarán todos en la misma línea separados por punto y coma (;).
4 Salir: El programa solo finaliza si se selecciona esta opción. 
*/