package PRG_Arrays.Arrays_Exercises;

public class Ex1_Arrays { @SuppressWarnings("unused")
    public static int[] creaArrayNumeros(int n){
        int[] numerosUsuario = new int[n];
        int numeroAleatorio;
        for (int i = 0; i < numerosUsuario.length; i++){
            numerosUsuario[i] = numeroAleatorio = (int)(Math.random() * (5000 - 1000 + 1)) + 1000;
        }
        return numerosUsuario;
    }
    public static void muestraArray(int[] numeros){
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    public static int maximo(int[] numeros){
        int auxiliar = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > auxiliar) {
                auxiliar = numeros[i];
            }
        }
        return auxiliar;
    }
    public static int minimo(int[] numeros){
        int auxiliar = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < auxiliar) {
                auxiliar = numeros[i];
            }
        }
        return auxiliar;
    }
    public static void main(String[] args) {
        int[] numeros = creaArrayNumeros(10);
        muestraArray(numeros);
        System.out.println("Número mayor: " + maximo(numeros));
        System.out.println("Número mínimo: " + minimo(numeros));
    }
}

/*
e) Función a la que se le pasa como parámetros un vector cualquiera de enteros y
dos índices (son dos números enteros) e intercambia los datos que hay en las
posiciones indicadas por los índices. Si hay un error de rango devuelve false si no
devuelve true. Por ejemplo si se le pasa (v, 2, 5) debe intercambiar los datos v [2]
con v[5] siempre que existan dichas posiciones.
*/