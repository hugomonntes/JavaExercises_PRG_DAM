import java.util.Scanner;

public class Ex3_b3 {//TODO comentar(Comentado)
    /**
     * Pide un dato  lo devuelve
     * @return dato introducido por el usuario
     */
    public static int pedirDato() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("Introduce un numero: ");
            number = sc.nextInt();
        } while (number < 0);
        return number;
    }

    /**
     * Calcula la superficie de un Cilindro
     * @param radio
     * @param altura
     * @return el resultado del area
     */
    public static double superficieCilindro(int radio, int altura) {
        return 2 * radio * altura * Math.PI;
    }
    /**
     * Muestra el resultado un mensaje más el resultado del area
     * @param msg
     * @param resultadoArea
     */
    public static void mostrarDato(String msg, double resultadoArea) {
        System.out.printf("%s %.3f \n", msg, resultadoArea);
    }
    public static void main(String[] args) {
        int altura = pedirDato();
        int radio = pedirDato();
        double calcularArea = superficieCilindro(radio, altura);
        mostrarDato("La superficie es de: ", calcularArea);
    }
}

/*
3. Realiza un programa que halle la superficie de un cilindro sabiendo que:
Superficie=2*π*radio*altura
Debe constar de 3 métodos:

• pedirDato: pide un dato real usuario comprobando que sea un valor
positivo. Al final devuelve dicho dato.

• superficieCilindro: Se le pasa como parámetros el radio y la altura,
hace el cálculo de la superficie y lo devuelve (sin nada de interfaz de
usuario).

• mostrarDato: Función que tiene un real como parámetro y un String.
Muestra en la misma línea el String y a continuación el real con 3
decimales. No devuelve nada.

Por tanto en el programa principal (main) solo debe llamarse a los tres
funciones (y declarar variables auxiliares para recoger los datos). Dos veces
al primero para
pedir primero radio y después la altura, luego se llama al segundo para hacer
el
cálculo, y finalmente se llama al tercero para mostrar el resultado. Si lo
necesitas
usa variables intermedias para quedar con resultados de las funciones.
*/