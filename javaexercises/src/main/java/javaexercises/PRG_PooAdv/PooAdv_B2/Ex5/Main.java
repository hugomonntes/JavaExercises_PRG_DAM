package javaexercises.PRG_PooAdv.PooAdv_B2.Ex5;

public class Main {
    public static void main(String[] args) {
        Astro sol = new Astro();
        sol.setNombre("hugo");
        System.out.println(sol.getNombre('_'));
    }
}

// c) En el programa principal (Mételo en otra clase y package distintos a las clases
// anteriores) se crea una colección de Astros y el siguiente menú:
// • Añade Planeta: Pregunta si es gaseoso y pide el nombre y radio. También
// pregunta cantidad de lunas y se introducirán sus nombres y radios.
// • Añade otro astro: Pide su nombre y radio.
// • Mostrar datos: Muestra toda la colección detectando si es Astro o Planeta
// para mostrar todos sus datos. En el caso de Astro simplemente llama a
// toString() y lo muestra, en el caso de Planetas muestra todos los datos y en
// particular llamando a getNombre con parámetro ‘.’
// • Elimina repetidos. Busca Astros/Planetas iguales (aprovecha el
// equals/indexOf/lastIndexOf ) y elimina todas las apariciones menos la
// primera.
// • Salir. Como siempre no sale de la aplicación hasta que se selecciona esta
// opción.