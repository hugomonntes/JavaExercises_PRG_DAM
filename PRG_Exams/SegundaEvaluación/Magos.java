package SegundaEvaluación;

import java.text.StringCharacterIterator;

public class Magos {
    public static int[][] creaMatriz(int cantidadMagos){
        int[][] matrizMagos = new int[cantidadMagos][4]; //4 porque son el numero de elementos (aire, fuego, tierra y agua)
        for (int i = 0; i < matrizMagos.length; i++) {
            for (int j = 0; j < matrizMagos[i].length; j++) {
                matrizMagos[i][j] = (int)(Math.random()*5 + 1);
            }
        }
        return matrizMagos;
    }

    public static void muestraMatriz(int[][] matrizMagos){
        if (matrizMagos == null) {
            System.out.println();
        } else {
            String letras = "AFEW";
            System.out.printf("    ");
            for (int i = 0; i < letras.length(); i++) {
                System.out.printf("%4s", letras.charAt(i));
            }
            System.out.println();
            for (int i = 0; i < matrizMagos.length; i++) {
                System.out.printf("%4d", i + 1);
                for (int j = 0; j < matrizMagos[i].length; j++) {
                    System.out.printf("%4d" ,matrizMagos[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static int poderDeMago(int[][] matriz, int filaMatriz){
        int sumaPoderes = 0;
        if (filaMatriz < 0 || filaMatriz > matriz.length){
        } else {
            for (int numerosFila : matriz[filaMatriz]) {
                sumaPoderes += numerosFila;
            }
        }
        return sumaPoderes;
    }
}

/*
c) (1.5p) Función poderDeMago: Esta función tiene como parámetros la matriz y un número que representa la fila de la matriz, y por
tanto a un mago. Devuelve la suma de todos los poderes de dicho mago. Si se le pasa un valor de mago no existente lanzará una
excepción tipo WizardException (créala tú) con el mensaje “Fila no válida”. Debe usar un for extendido.

d) (1p) Como una de las capacidades de los magos es intercambiar su poder, se debe realizar una función denominada
intercambioDePoder a la cual se le pasan la matriz y dos números de fila. No es necesario comprobar rangos. Se valorará hacerlo sin
bucles. No devuelve nada.
*/