package PRG_Arrays.Arrays_Exercises;

public class Ex1_Arrays {
    public static int creaArrayNumeros(int n){
        int[] numerosUsuario = new int[n];
        int numeroAleatorio;
        for (int i = 0; i < numerosUsuario.length; i++) {
            numeroAleatorio = (int)(Math.random()*1000);
            while (numeroAleatorio >= 1000 && numeroAleatorio <= 5000) {
                numerosUsuario[i] = numeroAleatorio;
            }
            return numerosUsuario[i];
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(creaArrayNumeros(5));
    }
}

/*
1. Realiza los métodos estáticos que se citan a continuación. Realiza en el
programa principal una prueba de los mismos con un vector de tamaño 10 (Ojo, el
tamaño 10 es solo en el principal, las funciones han de ser genéricas y válidas para
vectores de cualquier tamaño).
a) Función que crea y devuelva un vector con n números enteros con valores
aleatorios entre 1000 y 5000 ambos incluidos (n es un parámetros de la función).
b) Función a la que se le pasa un vector cualquiera de números enteros y muestra
sus elementos por pantalla. Debes usar un for mejorado mostrando elemento a
elemento.
c) Función a la que se le pasa un vector cualquiera de enteros (no tiene porque ser
el del apartado a) y devuelve el valor máximo que contiene. Usa for clásico.
d) Función a la que se le pasa un vector cualquiera de enteros y devuelve el valor
mínimo que contiene. Usa for mejorado.
e) Función a la que se le pasa como parámetros un vector cualquiera de enteros y
dos índices (son dos números enteros) e intercambia los datos que hay en las
posiciones indicadas por los índices. Si hay un error de rango devuelve false si no
devuelve true. Por ejemplo si se le pasa (v, 2, 5) debe intercambiar los datos v [2]
con v[5] siempre que existan dichas posiciones.
*/