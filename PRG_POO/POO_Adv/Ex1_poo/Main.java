package PRG_POO.POO_Adv.Ex1_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;
        System.out.println("Introduce la base: ");
        base = sc.nextInt();
        System.out.println("Introduce la altura: ");
        altura = sc.nextInt();
        Geometria rectangulo = new Geometria(20, 13);
        Geometria triangulo = new Geometria();
        triangulo.setAltura(altura);
        triangulo.setBase(base);
        System.out.println(rectangulo.getAltura() + " // " + rectangulo.getBase());
        System.out.println(triangulo.getAltura() + " // " + triangulo.getBase());
    }
}
