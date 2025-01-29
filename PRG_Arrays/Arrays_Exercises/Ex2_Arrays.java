package PRG_Arrays.Arrays_Exercises;

public class Ex2_Arrays {
    public static char[][] matrizChar(int n, int m){
        char[][] tabla = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tabla[i][j] = (char)((Math.random() * 26) + 65);
            }
        }
        return tabla;
    }

    public static void mostrarTabla(char[][] tabla){
        System.out.print("   ");
        for (int i = 0; i < tabla[0].length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%3d", i);
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%4c", tabla[i][j]);
            }
            System.out.println();
        }
    }
    public static char devolverLetraMayor(char[][] tabla){
        int auxiliar = tabla[0][0];
        char letraMayor = tabla[0][0];
        for (int i = 1; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] > auxiliar) {
                    auxiliar = tabla[i][j];
                    letraMayor = tabla[i][j];
                }
            }
        }
        return letraMayor;
    }
    public static char devolverLetraMenor(char[][] tabla){// TODO foreach (Check)
        char letraMenor = tabla[0][0];
        for (char[] fila : tabla) {
            for (char letra : fila) {
                if (letra < letraMenor) {
                    letraMenor = letra;
                }
            }
        }
        return letraMenor;
    }

    public static boolean intercambiarDatos(char[][] tabla, int indice1, int indice2, int indice3, int indice4){
        if (indice1 < 0 || indice1 >= tabla.length || indice2 < 0 || indice2 >= tabla.length || indice3 < 0 || indice3 >= tabla.length || indice4 < 0 || indice4 >= tabla.length){//TODO  3 y 4 y comparar 2 con cols(Check)
        return false;
        } else {
            char auxiliar = tabla[indice1][indice2];
            tabla[indice1][indice2] = tabla[indice3][indice4];
            tabla[indice3][indice4] = auxiliar;
            return true;
        }
    }

    
    public static void main(String[] args) {
        char[][] tabla1 = matrizChar(3, 4);
        mostrarTabla(tabla1);
        System.out.println(devolverLetraMayor(tabla1));
        System.out.println(devolverLetraMenor(tabla1));
        System.out.println(intercambiarDatos(tabla1, 1, 2, 6, 8));
    }
}

/*
2. Repite el ejercicio anterior pero adaptándolo a una matriz de tamaño n filas y m
columnas y que guarde caracteres (char) aleatorios entre ‘A’ y ‘Z’. En el main
pruébalo con una tabla de 3x4 y luego una de 4x3. Ten en cuenta que:
• Para sacar un carácter aleatorio, debes sacar un numero aleatorio en el
rango unicode de los caracteres deseados y castearlo a char.
• En el apartado (b) debes mostrar el array con formato de tabla, además cada
carácter de una fila debe tener una separación de al menos dos espacios con
los de al lado. Debes mostrar también como cabecera el número de fila y de
columna. Usa printf para la ordenación en columnas, no uses \t.
Ejemplo:
0 1 2 3
0 D R A Y
1 J O P C
2 H P A S
• El apartado (e) lógicamente tendrás que pasar 4 índices para intercambiar 2
posiciones. 
*/