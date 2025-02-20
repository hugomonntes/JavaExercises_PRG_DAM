package javaexercises.PRG_Métodos;

import java.io.PrintWriter;
public class EscrituraArchivo {
    public static void main(String[] args) throws Exception {
        //Apertura
        PrintWriter f = new PrintWriter("prueba.txt");

        //Escritura
        f.print(Math.PI);

        //Cierre
        f.close();
    }
}