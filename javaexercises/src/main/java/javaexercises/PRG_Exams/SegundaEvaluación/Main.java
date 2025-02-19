package javaexercises_prg_dam.PRG_Exams.SegundaEvaluación;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Magos magos = new Magos();
        int[][] matrizMagos;
        int numeroMagoUsuario = 0;
        boolean isChecked;
        matrizMagos = magos.creaMatriz(11);
        magos.muestraMatriz(matrizMagos); //Mostrar matriz
        do {
            try{
                isChecked = true;
                do {
                    System.out.print("Introduce el mago que quieres: ");
                    numeroMagoUsuario = sc.nextInt();
                    if (numeroMagoUsuario < 0 || numeroMagoUsuario > matrizMagos.length) {
                        isChecked = false;
                    } else {
                        isChecked = true;
                    }
                } while (!isChecked);
                System.out.println("Poder: " + magos.poderDeMago(matrizMagos, numeroMagoUsuario));
            } catch (Exception e){
                System.out.println("Introduce un dato válido");
                isChecked = false;
                sc.nextLine();
            }
            int[] primeraPosicion = matrizMagos[0];
            int[] ultimaPosicion = matrizMagos[matrizMagos.length - 1];
            magos.intercambioDePoder(matrizMagos, primeraPosicion[0], ultimaPosicion[0]);
            magos.muestraMatriz(matrizMagos);
        } while(!isChecked);
    }
}

