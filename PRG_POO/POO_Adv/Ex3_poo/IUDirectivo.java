package PRG_POO.POO_Adv.Ex3_poo;

import java.util.Scanner;

public class IUDirectivo {
    Scanner sc = new Scanner(System.in);
    Directivo directivo = new Directivo();

    public IUDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }

    //#region MÉTODOS MOSTRAR & PEDIR
    public void mostrar(){
        System.out.println("Nombre: " + directivo.getNombre());
        System.out.println("Apellido: " + directivo.getApellido());
        System.out.println("Edad: " + directivo.getEdad());
        System.out.println("DNI: " + directivo.getDni());
        System.out.println("Nombre del Departamento: " + directivo.getNombreDepartamento());
        System.out.println("Beneficios: " + directivo.getBeneficios());
        System.out.println("Beneficios totales: " + directivo.calcularBeneficio());
    }

    public void pedir(){
        System.out.print("Introduzca el nombre: ");
        directivo.setNombre(sc.nextLine());
        System.out.print("Introduzca el apellido: ");
        directivo.setApellido(sc.nextLine());
        System.out.print("Introduzca la edad: ");
        directivo.setEdad(sc.nextInt());
        sc.nextLine(); // Salto de línea para INT
        System.out.print("Introduzca el DNI: ");
        directivo.setDni(sc.nextLine());
        System.out.print("Introduzca el nombre del departamento: ");
        directivo.setNombreDepartamento(sc.nextLine());
        System.out.print("Introduzca los beneficios: ");
        directivo.setBeneficios(sc.nextDouble());
    }
    //#endregion
}
