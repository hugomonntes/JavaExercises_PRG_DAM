import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex5_b3 {
    /**
     * Es bisiesto o no
     * 
     * @param year Introducir el año
     * @return si es bisiesto(true) o no (false)
     */
    public static boolean isBisiesto(int year) {
        return year % 400 == 0 ? true : year % 100 == 0 ? false : year % 4 == 0;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter f = new PrintWriter("Ex5_b3.txt");
        int userYear;
        System.out.println("Introduce un año: ");
        userYear = sc.nextInt();
        if (isBisiesto(userYear)) {
            f.printf("%d Si es bisiesto \n", userYear);
        } else {
            f.printf("%d No es bisiesto \n", userYear);
        }
        //Escribir numeros bisiestos hasta año actual.
        for(int i = userYear; i <= 2024; i++){
            if (isBisiesto(i)){
                f.println(i);
            }
        }

        f.close();
    }
}

/*
**5. Haz un programa que realice las siguientes tareas:
Pide un año al usuario y guarda en un archivo dicho año en la primera línea
indicando si es o no bisiesto y a continuación todos los bisiestos desde ese
año hasta el año actual (cada uno en una línea).
Un ejemplo de como puede quedar el archivo:
2015 No es bisiesto.
2016
2020
2024
A continuación lee el archivo y muestra en pantalla todos los años menos el
primero. Debe estar separados por comas en la misma linea y ocupando 6
caracteres.
Si este programa lo tienes en la misma carpeta que el de bisiesto no es
necesario
que copies la función, puedes acceder a ella poniendo
NombreClase.nombreFuncion.
Por ejemplo:
Bol3Ejer4.bisiesto(2024);
 */