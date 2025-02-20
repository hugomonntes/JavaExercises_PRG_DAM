package javaexercises.PRG_Arrays.Arrays_Exercises.Ex7_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_Arrays {
    /**
     * Muestra 6 numeros aleatorios entre 1 y 49
     * @param numerosLoteria Colección en la que se almacenan los numeros
     */
    public static void rellenaCol(ArrayList<Integer> numerosLoteria){
        numerosLoteria.clear();
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
    /**
     * Pide y alamacena numeros al usuario en una coleccion
     * @return la colección de numeros del usuario
     */
    public static ArrayList<Integer> pedirNumerosUsuario(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numerosUser = new ArrayList<>();
        boolean isChecked = false;
        while (!isChecked) {
            numerosUser = new ArrayList<>();
            System.out.println("Introduce seis números separados por comas: ");
            String numeros = sc.nextLine();
            String[] numerosSeparados = numeros.split(",");

            try {
                for (String numero : numerosSeparados) {
                    numerosUser.add(Integer.parseInt(numero));
                }
                isChecked = validarNumeros(numerosUser);
                if (!isChecked) {
                    System.out.println("Los números no son válidos.");
                }
            } catch (Exception e) {
                System.out.println("Introduce solo números separados por comas.");
            }
        }
        return numerosUser;
    }
    /**
     * Valida que los numeros de usuario estén bien introducidos y que sean 6 
     * @param numerosUsuario colección que almacena los numeros del usuario
     * @return true si estan bien introducidos o false si no.
     */
    public static boolean validarNumeros(ArrayList<Integer> numerosUsuario){
        if (numerosUsuario.size() != 6) {
            return false;
        }
        for (int i = 0; i < numerosUsuario.size(); i++) {
            int num = numerosUsuario.get(i);

            if (num < 1 || num > 49) {
                return false;
            }

            for (int j = i + 1; j < numerosUsuario.size(); j++) {
                if (num == numerosUsuario.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] listaAciertos = new int[7];
        ArrayList<Integer> numerosLoteriaCPU = new ArrayList<>();
        ArrayList<Integer> numerosLoteriaUsuario = pedirNumerosUsuario();

        for (int i = 0; i < 1000000; i++) {
            rellenaCol(numerosLoteriaCPU);
            int contadorAciertos = comparaValores(numerosLoteriaCPU, numerosLoteriaUsuario);
            listaAciertos[contadorAciertos]++;
        }

        System.out.println("Resultados:");
        int i = 0;
        while (i < listaAciertos.length) {
            System.out.println(i + " aciertos: " + listaAciertos[i]);
            i++;
        }
    }
}

/*
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