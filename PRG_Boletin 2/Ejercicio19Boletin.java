import java.util.Scanner;

public class Ejercicio19Boletin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAstersicos;
        String asterisco = "*";
        String space = " ";
        String opcionD;

        System.out.print("Introduce el numero de asteriscos: ");
        numeroAstersicos = sc.nextInt();
        System.out.print("Introduce Derecha o Izquierda (D/I): ");
        sc.nextLine();
        opcionD = sc.nextLine();

        if(opcionD.equals("d")){
            for(int i = 0; i <= numeroAstersicos; i++){
                System.out.println(asterisco);
                for(int contadorEspacios = 0; contadorEspacios <= i; contadorEspacios++){
                    System.out.print(space);
                }
            }
        }
        
        if (opcionD.equals("i")) {
            for(int i = numeroAstersicos; i >= 0; i--){
                System.out.println(asterisco);
                for(int contadorEspacios = numeroAstersicos; contadorEspacios >= 0; contadorEspacios--){
                    System.out.print(space);
                }
            }
        }
    }                                                            
}

/*

*/