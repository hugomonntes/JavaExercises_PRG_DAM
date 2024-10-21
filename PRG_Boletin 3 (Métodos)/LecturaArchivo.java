import java.io.File;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;
public class LecturaArchivo {
    public static void main(String[] args) throws Exception {
        Scanner f = new Scanner(new File("prueba.txt"));
        String auxiliar;

        auxiliar = f.nextLine();
        System.out.println(Double.parseDouble(auxiliar));
        
        f.close();
    }
}

//SHIFT + ALT + "O" --> Busca Imports Necesarios