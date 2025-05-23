package javaexercises.PRG_PooAdv.PooAdv_B2.Ex3;

public class Main {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Cadena cadena = new Cadena("HOLA");
        Character[] chars = new Character[] {'a', 'b', 'c'};
        // System.out.println(cadena.equals("   HOLA  "));
        System.out.println(cadena.equals(chars));
        
    }
}
