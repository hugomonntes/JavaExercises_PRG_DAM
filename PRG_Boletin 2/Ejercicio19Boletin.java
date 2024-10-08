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
            for(int i = 0; i < numeroAstersicos; i++){
                for(int contadorEspacios = (numeroAstersicos - i); contadorEspacios > 0; contadorEspacios--){
                    System.out.print(space);
                }
            System.out.println(asterisco);
        }
    }                                                      
    System.out.println("Prueba");
    }
}

/*
19.a) Realizar un programa que dibuje una ristra de N asteriscos en pantalla (N es
un número introducido polo usuario).
Ejemplo:
Cuantos asteriscos deseas dibujar? 10
**********
b) Repetirlo pero dibujando la ristra en diagonal. El usuario escogerá se la
dibuja de izquierda la derecha o de derecha la izquierda.
*/