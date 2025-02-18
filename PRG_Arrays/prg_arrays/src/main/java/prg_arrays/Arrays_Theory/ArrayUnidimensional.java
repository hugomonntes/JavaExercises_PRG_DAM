package prg_arrays.Arrays_Theory;

public class ArrayUnidimensional {
    public static void main(String[] args) {
        int[] temperaturas = new int[4]; //Declaración de un Array y declaración longitud del Array
        // Rellena un array con valores aleatorios
        for (int i = 0; i < temperaturas.length; i++){
            temperaturas[i] = (int)(Math.random()*5) + 1;
        }
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(temperaturas[i]);
        }
    }
}