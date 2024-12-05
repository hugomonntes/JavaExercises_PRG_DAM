package PRG_POO.POO_Adv.Ex1_poo;

public class Main {
    public static void main(String[] args) {
        Geometria rectangulo = new Geometria(20, 13);
        Geometria triangulo = new Geometria();
        triangulo.setAltura(20);
        triangulo.setBase(13);
        System.out.println(rectangulo.getAltura() + " // " + rectangulo.getBase());
        System.out.println(triangulo.getAltura() + " // " + triangulo.getBase());
    }
}
