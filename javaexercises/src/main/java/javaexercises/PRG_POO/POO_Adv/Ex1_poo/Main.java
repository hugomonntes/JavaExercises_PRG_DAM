package javaexercises.PRG_POO.POO_Adv.Ex1_poo;

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
        Geometria rectangulo = new Geometria(true, 20, 13);
        Geometria triangulo = new Geometria();
        triangulo.setAltura(altura);
        triangulo.setBase(base);
        System.out.printf("Perímetro: %.2f, Área: %.2f, Figura: %s, Base: %.2f, Altura: %.2f", rectangulo.perimetro(), rectangulo.area(), rectangulo.tipo(), rectangulo.getAltura(), rectangulo.getBase());
        System.out.printf("\nPerímetro: %.2f, Área: %.2f, Figura: %s, Base: %.2f, Altura: %.2f, Diagonal: %.2f", triangulo.perimetro(), triangulo.area(), triangulo.tipo(), triangulo.getAltura(), triangulo.getBase(), triangulo.diagonal());
        sc.close();
    }
}
