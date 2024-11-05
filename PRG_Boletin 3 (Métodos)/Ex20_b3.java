public class Ex20_b3 {
    public static double numeroAleatorio(){
        double numero = Math.ceil(Math.random()*10);
        return numero;
    }
    public static void main(String[] args) {
        int tamañoBarco = 2;
        int tamañoTablero = 10;
        double numeroAleatorio = numeroAleatorio();
        String[] columnaLetras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int[] columnaNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i <= columnaNumeros.length; i++) {
            System.out.println(columnaNumeros[i]);
            if (columnaNumeros[i] == numeroAleatorio) {
                System.out.println("Ganaste");
                System.out.println(numeroAleatorio);
            }
        }
    }
}

/*
20. Programar un juego “mini-hundir-la-flota” contra el ordenador. Se hará con un
barco de 2 casillas en un tablero de 10x10 posiciones. Las columnas con una letra
de la A a la J y la fila con un número del 1 al 10.
La CPU sacará coordenadas aleatorias y dirección aleatoria (horizontal/vertical).
Se debe sacar una coordenada aleatoria, y una dirección aleatoria (horizontal o
vertical). A partir de ahí se crean las 2 coordenadas del barco.
Si el ordenador acierta una casilla no sigue tirando aleatoriamente si no que lo
intenta en las coordenadas de alrededor en horizontal o vertical (no diagonal).
Si sabes algo de arrays, puedes hacerlo más completo con estas estructuras.
También puedes usar archivos para marcar tiradas.
*/