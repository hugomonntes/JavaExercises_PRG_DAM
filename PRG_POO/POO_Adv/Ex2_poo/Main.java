package PRG_POO.POO_Adv.Ex2_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha fecha = new Fecha();
        int dia;
        int mes;
        int año;
        System.out.println("Introduce una fecha");
        System.out.print("Introduce el día: ");
        dia = sc.nextInt();
        fecha.setDia(dia);
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        fecha.setDia(mes);
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        fecha.setDia(año);


        Fecha fecha2 = new Fecha();
        int dia2;
        int mes2;
        int año2;
        System.out.println("Introduce una fecha");
        System.out.print("Introduce el día: ");
        dia2 = sc.nextInt();
        fecha2.setDia(dia2);
        System.out.print("Introduce el mes: ");
        mes2 = sc.nextInt();
        fecha2.setDia(mes2);
        System.out.print("Introduce el año: ");
        año2 = sc.nextInt();
        fecha2.setDia(año2);
        System.out.println(Fecha.diferenciaFechas(fecha, fecha2));
        sc.close();
    }
}
