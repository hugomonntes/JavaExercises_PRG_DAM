package javaexercises_prg_dam.PRG_Arrays.Arrays_Theory;

import java.util.ArrayList;

public class Colecciones {
    public static void main(String[] args) {
        //Definir ArrayList
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        //Array Methods
        names.add("a");
        names.add("b");
        names.add("v");
        names.add("s");
        names.add("a");
        names.remove(3);
        names.set(2, "n");
        System.out.println(names.contains("n"));
        System.out.println(names.indexOf("n"));
        System.out.println();

        //Recorrer ArrayList
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();

        for (String name : names) {
            System.out.println(name);
        }
    }
}
