package javaexercises.PRG_Exams.SegundaEvaluación.P2;

public class Main {
    public static void main(String[] args) {
        Astro astro = new Astro();
        astro.setNombre("HOLA");
        System.out.println(astro.getNombre('_'));
        astro.muestraDatos();
    }
}
