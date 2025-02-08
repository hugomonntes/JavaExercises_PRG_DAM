package PRG_Arrays.Arrays_Exercises.Ex5_Arrays;

import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Ventas ventas = new Ventas(2050);
        ventas.mostrarGrafica();
        Scanner freader = new Scanner(new File("Ventas.txt"));
        File fwriter = new File("archivo.txt");
        if (fwriter.exists()){
            
        }
    }
}
