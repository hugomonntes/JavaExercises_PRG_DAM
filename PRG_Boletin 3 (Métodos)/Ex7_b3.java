import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex7_b3 {
    public static String readFile(String fileName) throws Exception{
        Scanner f = new Scanner(new File(fileName));
        String contentFile = "";
        while (f.hasNext()) {
            contentFile = f.nextLine();
            System.out.println(contentFile);
        }
        f.close();
        return contentFile;
    }

    public static String appendFile(String fileName, String msg) throws Exception {
        String content = "";
        content = readFile(fileName) + msg;
        return content;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter fwritter = new PrintWriter("PRG_Archivos/Ex7_b3.txt");
        String msg; // Almacena mensaje del user
        System.out.println("Introduce un mensaje");
        msg = sc.nextLine();
        System.out.println(readFile("PRG_Archivos/Ex2_b3.txt")); // Mostrar en la consola los datos del archivo
        appendFile("PRG_Archivos/Ex7_b3.txt", msg);
        // fwritter.print(appendFile("PRG_Archivos/Ex7_b3.txt", msg));
        // fwritter.close();
    }
}

/*
 ** 7. a) Haz una función llamada saveFile a la cual se le pasa una cadena que
representa el nombre de un archivo. Dicha función debe leer un archivo
completo y
devolverlo como string.
Para probarla en el main usa el archivo del ejercicio 2.
b) Realiza una función denominada appendFile a la que se le pasan dos
cadenas, la
primera es el nombre de un archivo y la segunda es un texto que debe añadir
al
final del archivo. Para ello primero lee el archivo, concatena la nueva
cadenas y lo
guarda de nuevo. Utiliza la función creada en (a) para la lectura.
c) Realiza una función denominada appendFile2 que hace lo mismo que la
realizada
en (b) pero usando el método explicado en el Apéndice II de los apuntes.
 */
