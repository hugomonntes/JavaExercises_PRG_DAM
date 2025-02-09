package PRG_Arrays.Arrays_Exercises.Ex7_Arrays;

import java.util.ArrayList;

public class Ex7_Arrays {
    public static void rellenaCol(ArrayList<Integer> numerosLoteria){
        for (int i = 0; i < 6; i++) {
            numerosLoteria.add((int)(Math.random()*20));
        }
        System.out.println(numerosLoteria);
    }
    public static int comparaValores(ArrayList<Integer> numerosLoteria, ArrayList<Integer> numerosLoteria2){
        ArrayList<Integer> numerosRepetidos = new ArrayList<>();
        int numeroComparar;
        for (int i = 0; i < numerosLoteria.size(); i++) {
            numeroComparar = numerosLoteria.get(i);
            for (int j = 0; j < numerosLoteria2.size(); j++) {
                if (numeroComparar == numerosLoteria2.get(j)) {
                    numerosRepetidos.add(numeroComparar);
                    continue;
                }
            }
        }
        return numerosRepetidos.size();
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(6);
        ArrayList<Integer> numeros2 = new ArrayList<>(6);
        rellenaCol(numeros);
        rellenaCol(numeros2);
        System.out.println(comparaValores(numeros, numeros2));
    }
}

/*
7. Realiza una simulación de aciertos en el juego de la lotería primitiva usando
colecciones. Para ello haz las siguientes funciones:
Realiza una función (denominada rellenaCol) que tenga como parámetro una
colección de enteros. Debe limpiarla y rellenarla con 6 valores aleatorios distintos
entre 1 y 49 ambos inclusive.
Otra función (denominada compara) a la que se le pasan dos colecciones de
enteros y comprueba cuantos elementos de una colección están en la otra.
Devuelve dicho valor. 
*/