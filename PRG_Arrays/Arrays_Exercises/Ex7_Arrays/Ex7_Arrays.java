package PRG_Arrays.Arrays_Exercises.Ex7_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_Arrays {
    /**
     * Muestra 6 numeros aleatorios entre 1 y 49
     * @param numerosLoteria Colección en la que se almacenan los numeros
     */
    public static void rellenaCol(ArrayList<Integer> numerosLoteria){
        for (int i = 0; i < 6; i++) {
            boolean isUnique;
            int numeroAleatorioCandidato;
            do {
                numeroAleatorioCandidato = (int)(Math.random()*48 + 1);
                isUnique = true;
                for (int j = 0; j < numerosLoteria.size() && isUnique; j++) {
                    if (numeroAleatorioCandidato == numerosLoteria.get(j)) {
                        isUnique = false;
                    }
                }
            } while (!isUnique);
            numerosLoteria.add(numeroAleatorioCandidato);
        }
        System.out.println(numerosLoteria);
    }
    /**
     * Compara si los numeros aleatorios del user coinciden con los obtenidos por la CPU
     * @param numerosLoteriaCPU numeros de la CPU
     * @param numerosLoteriaUsuario numeros introducidos por el User
     * @return numero de coincidencias que existen entre User y CPU
     */
    public static int comparaValores(ArrayList<Integer> numerosLoteriaCPU, ArrayList<Integer> numerosLoteriaUsuario){
        ArrayList<Integer> numerosRepetidos = new ArrayList<>();
        int numeroComparar;
        for (int i = 0; i < numerosLoteriaCPU.size(); i++) {
            numeroComparar = numerosLoteriaCPU.get(i);
            for (int j = 0; j < numerosLoteriaUsuario.size(); j++) {
                if (numeroComparar == numerosLoteriaUsuario.get(j)) {
                    numerosRepetidos.add(numeroComparar);
                    continue;
                }
            }
        }
        return numerosRepetidos.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numerosUser = new ArrayList<>(6);
        ArrayList<Integer> numerosGanadores = new ArrayList<>(6);
        rellenaCol(numerosUser);
        rellenaCol(numerosGanadores);
        System.out.println(comparaValores(numerosUser, numerosGanadores));
        // System.out.println("Introduce seis numeros");
        // for (int i = 0; i < 6; i++) {
        //     System.out.print("Introduce un numero: ");
        //     numerosUser.add(sc.nextInt());
        // }
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

En el main el usuario introducirá 6 números diferentes entre 1 y 49 separados por
comas y se guardarán en una colección (se deben hacer las comprobaciones
pertinentes). Si quieres haz alguna función más para modularizar esta parte.
A continuación lanza un millón de loterías mediante la función rellenaCol y por cada
una comprueba los aciertos que ha tenido el usuario mediante compara. Usa un
array de 7 posiciones para ir incrementando cada una de ellas según los aciertos.
Es decir, si compara devuelve 0 incrementas la posición 0 de ese array, si compara
devuelve 3 pues rellenas la posición 3. De esa forma al final de la simulación tienes
la cantidad de veces que han salido 0 aciertos, 1 acierto, 2, aciertos, etc. Muestra
estos datos por pantalla y comprueba que efectivamente no vale la pena jugar.
*/