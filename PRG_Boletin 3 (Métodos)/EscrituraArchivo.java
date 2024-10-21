import java.io.PrintWriter;
public class EscrituraArchivo {
    public static void main(String[] args) throws Exception {
        //Apertura
        PrintWriter f = new PrintWriter("prueba.txt");

        //Escritura
        f.print("Prueba de archivos");

        //Cierre
        f.close();
    }       
}