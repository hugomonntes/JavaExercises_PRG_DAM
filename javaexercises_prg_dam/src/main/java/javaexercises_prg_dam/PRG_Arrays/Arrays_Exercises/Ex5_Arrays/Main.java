package javaexercises_prg_dam.PRG_Arrays.Arrays_Exercises.Ex5_Arrays;

import java.io.File;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        File archivo = new File("ventas.txt");
        int[] ventasFinales = new int[12];
        int añoActual = LocalDate.now().getYear();
        if (args.length != 0) {
            archivo = new File(args[0]);
        }
        if (archivo.exists()) {
            Scanner leerArgs = new Scanner(archivo);
            String añosArgs = leerArgs.nextLine();
            args = leerArgs.nextLine().split(";");
            leerArgs.close();
            for (int i = 0; i < args.length; i++) {
                int ventas = Integer.parseInt(args[i]);
                ventasFinales[i] = ventas;
            }
            int año = Integer.parseInt(añosArgs);
            Ventas ventaArgs = new Ventas(año, ventasFinales);
            ventaArgs.mostrarGrafica();
            System.out.println();
            System.out.printf("%.2f", ventaArgs.calcularMedia());
        } else {
            Ventas segundaVenta = new Ventas(añoActual - 1);
            segundaVenta.mostrarGrafica();
            System.out.println();
            System.out.printf("%.2f", segundaVenta.calcularMedia());
            System.out.println();
            File escribirArchivo = new File("ventas" + (añoActual - 1) + ".txt");
            PrintWriter escribir = new PrintWriter(escribirArchivo);
            escribir.print(añoActual - 1 + "\n");
            int[] datos = segundaVenta.ventasAnuales;
            for (int i = 0; i < datos.length; i++) {
                escribir.printf("%d ; ", datos[i]);
            }
            escribir.close();
        }
    }
}