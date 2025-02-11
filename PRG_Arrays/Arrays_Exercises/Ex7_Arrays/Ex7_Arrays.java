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
    public static ArrayList<Integer> pedirNumerosUsuario(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numerosUser = new ArrayList<>();
        String numeros;
        boolean isChecked;
        do {
            System.out.println("Introduce seis numeros separados por comas: ");
            numeros = sc.nextLine();
            String[] numerosSeparados = numeros.split(",");
            try {
                for (String numero : numerosSeparados) {
                    numerosUser.add(Integer.parseInt(numero));
                }
                isChecked = true;
            } catch(Exception e){
                System.out.println("Introduce bien los valores separados por comas y sin caracteres especiales");
                isChecked = false;
            };
        } while (!isChecked);
        return numerosUser;
    }
    // public static boolean validarNumeros(ArrayList<Integer> numerosUsuario){ //Comprobar tamaño y numeros repetidos
    // }
    public static void main(String[] args) {
        pedirNumerosUsuario();
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