package javaexercises.PRG_Exams.SegundaEvaluación.P2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Astro> universo = new ArrayList<>();
        universo.add(new Astro("Sol", 1.3));
        universo.add(new Planeta("Tierra", 1.7, true));
        universo.add(new Planeta("Marte", 1.8, false));

        for (Astro elemento : universo) {
            System.out.println("Nombre con separación: " + elemento.getNombre('.'));
        }
    }
}
