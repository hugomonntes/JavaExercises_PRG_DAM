import java.util.Scanner;
public class Ex5_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double gradosCelsius;
        double gradosFarenheit;
        double gradosKelvin;
        int opcion;
        

        do{
            System.out.print("Tienes que introducir la temperatura en grados Celsius: ");
            gradosCelsius = sc.nextDouble();

            System.out.println("Introduce el número de la opción que deseas!");
            System.out.println("Tienes 3 opciones: ");
            System.out.println("1 --> Convertir a Farenheit");
            System.out.println("2 --> Convertir a Kelvin");
            System.out.println("3 --> Salir del programa");
            System.out.print("Introduce la opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: System.out.println(("Grados Farenheit:" + gradosCelsius*1.8)+32) ;
                break;
                case 2: System.out.println("Grados Kelvin:" + gradosCelsius + 273.15);
                break;
                case 3: System.out.println("Hasta luego! Gracias");
                break;    
                default: System.out.println("Opción no válida!");
                    break;
            }
            
        }   while (opcion != 3);
    }
}

/*
5. Programa un conversor de temperaturas:
Al usuario se le pide los grados Celsius y se le da dos opciones: si los quiere
convertir a Farenheit (1) o a Kelvin (2). Las opciones serán 1 y 2 para pedir
tipo de conversión y 3 salir.
Usa como plantilla el código que hay en el apartado de la estructura do-while
pero solo con las 3 opciones aquí indicadas.
El programa se repetirá hasta que se elija 3.
Finalmente muestra el resultado de la conversión con 2 decimales. Usa doubles
para las conversiones.
Las funciones de conversión son:
K=C+273.15
F=1.8*C+32
 */