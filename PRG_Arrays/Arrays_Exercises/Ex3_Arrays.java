package PRG_Arrays.Arrays_Exercises;

import java.util.ArrayList;

public class Ex3_Arrays {
    public static ArrayList<Integer> creaArrayNumeros(int n){
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        for (int i = 0; i < numerosAleatorios.size(); i++){
            numerosAleatorios.add(i, (int)(Math.random() * (4001)) + 1000);
        }
        return numerosAleatorios;
    }
    public static void muestraArray(ArrayList<Integer> numeros){
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = creaArrayNumeros(10);
        muestraArray(numeros);
    }
}

/*
3. Repite el primer ejercicio adaptándolo a un ArrayList<Integer>. Pruébalo con
una colección de 10 elementos en el programa principal.
Añade una función que se le pase un valor como parámetro y elimine de la
colección todos los elementos mayores que dicho parámetro.
*/