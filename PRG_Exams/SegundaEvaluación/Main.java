package SegundaEvaluación;

public class Main {
    public static void main(String[] args) {
        Magos magos = new Magos();
        int[][] matrizMagos;
        matrizMagos = magos.creaMatriz(10);
        magos.muestraMatriz(matrizMagos);
        System.out.println(magos.poderDeMago(matrizMagos, 1));
    }
}
