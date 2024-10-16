import java.util.Scanner;

public class Ex15_b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cantidad = 0;
        double valorEuroALibra = 0.83;
        double valorLibraAEuro = 1.15;
        double resultadoFinal;
        int opcion;

        do {
            System.out.println("Introduce el número de la opción que deseas!");
            System.out.println("Tienes 3 opciones: ");
            System.out.println("1 --> Conversor de Euros a Libras");
            System.out.println("2 --> Conversor de Libras a Euros");
            System.out.println("3 --> Salir");
            System.out.print("Introduce la opción: ");
            opcion = sc.nextInt();

            switch (opcion) { //TODO no admitir negativos
                case 1:
                    System.out.print("Introduce tu cantidad en Euros (€): ");
                    cantidad = sc.nextInt();
                    while (cantidad <= 0) {
                        System.out.println("No puedes introducir una cantidad negativa!");
                        System.out.print("Introduce tu cantidad en Euros (€): ");
                        cantidad = sc.nextInt();
                    }
                    resultadoFinal = cantidad * valorEuroALibra;
                    System.out.printf("%.2f Euros (€) es equivalente a %.2f Libras (£) \n", cantidad, resultadoFinal);
                break;

                case 2:
                System.out.print("Introduce tu cantidad en Libras (£): ");
                cantidad = sc.nextInt();
                while (cantidad <= 0) {
                    System.out.println("No puedes introducir una cantidad negativa!");
                    System.out.print("Introduce tu cantidad en Euros (€): ");
                    cantidad = sc.nextInt();
                }
                resultadoFinal = cantidad * valorLibraAEuro;
                System.out.printf("%.2f Libras (£) es equivalente a %.2f Euros (€) \n", cantidad, resultadoFinal);
                break;
                case 3:
                    System.out.println(" \n_________________ \n");
                    System.out.println("Adiós!");
                    System.out.println("_________________ \n");
                    break;
                default:
                if (cantidad < 0) {
                    System.out.println("Opción no válida!");
                }
                break;
            }

        } while (opcion != 3);
    }
}

/*
 * 15.Realizar un conversor de euros a libras y de libras a euros. No debe
 * admitir
 * valores negativos: si el usuario mete negativo, informa del error y lo vuelve
 * a
 * pedir hasta que meta positivo. Debe ejecutarse de forma continua hasta que el
 * usuario lo desee (plantea un menú con dos opciones de conversión y salir).
 * Debe presentar los datos con 2 decimales.
 */