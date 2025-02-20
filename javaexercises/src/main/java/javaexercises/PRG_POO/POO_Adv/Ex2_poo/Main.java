package javaexercises.PRG_POO.POO_Adv.Ex2_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //#region VARIABLES
        int dia;
        int mes;
        int año;
        System.out.println("Introduce una fecha");
        System.out.print("Introduce el día: ");
        dia = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduce el año: ");
        año = sc.nextInt();
        int dia2;
        int mes2;
        int año2;
        System.out.println("Introduce una fecha");
        System.out.print("Introduce el día: ");
        dia2 = sc.nextInt();
        System.out.print("Introduce el mes: ");
        mes2 = sc.nextInt();
        System.out.print("Introduce el año: ");
        año2 = sc.nextInt();
        //#endregion
        //#region OBJ
        Fecha fecha = new Fecha(dia, mes, año);
        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAño(año);
        System.out.println(fecha.fechaFormateada(true));
        System.out.println(fecha.fechaFormateada(false));

        Fecha fecha2 = new Fecha(dia2, mes2, año2);
        fecha2.setDia(dia2);
        fecha2.setMes(mes2);
        fecha2.setAño(año2);
        System.out.println(fecha2.fechaFormateada(true));
        System.out.println(fecha2.fechaFormateada(false));
        System.out.println(Fecha.diferenciaFechas(fecha, fecha2));
        sc.close();
        //#endregion
    }
}
