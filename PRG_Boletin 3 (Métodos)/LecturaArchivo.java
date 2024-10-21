import java.io.File;
import java.util.Scanner;
public class LecturaArchivo {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("prueba.txt"));
        String auxiliar;

        auxiliar = f.nextLine();
        System.out.println(auxiliar);
        
        f.close();
    }
}

//SHIFT + ALT + "O" --> Busca Imports Necesarios