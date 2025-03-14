package javaexercises.PRG_Arrays.Arrays_Exercises.Ex8_Arrays;

import java.time.LocalDate;
import java.util.ArrayList;

public class Videojuego {//TODO coment
    private String titulo;
    private String fabricante;
    private int año;

    public void setAño(int año) {//TODO revisar set
        if (año < 1950) {
            this.año = LocalDate.now().getYear();
        }
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante.toUpperCase();
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }

    public String getTitulo() {
        return titulo;
    }

    // CONSTRUCTORES
    public Videojuego() {
        setTitulo("");
        setFabricante("");
        setAño(0);
    }

    public Videojuego(String titulo) {
        setTitulo(titulo);
        setFabricante("");
        setAño(0);
    }

    public Videojuego(int año) {
        setTitulo("");
        setFabricante("");
        setAño(año);
    }

    public Videojuego(String titulo, String fabricante) {
        setTitulo(titulo);
        setFabricante(fabricante);
        setAño(0);
    }

    public Videojuego(String titulo, int año) {
        setTitulo(titulo);
        setFabricante("");
        setAño(año);

    }

    public Videojuego(int año, String fabricante) {
        setTitulo("");
        setFabricante(fabricante);
        setAño(año);
    }

    public static String truncarString(String cadenaOriginal) {
        return cadenaOriginal.length() > 23 ? cadenaOriginal.substring(0, 19) + "..." : cadenaOriginal;
    }

    public String getDatosAgrupados(){
        return "Título: " + Videojuego.truncarString(getTitulo()) + ", Fabricante: " + Videojuego.truncarString(getFabricante()) + ", Año: " + getAño();
    }

    public String toString(){
        return getDatosAgrupados();
    }
}

// 8. Diseño de una colección (ArrayList) de videojuegos.
// Se parte de una clase muy sencilla denominada Videojuego con los campos
// Titulo,
// año y fabricante. En los set de título y fabricante se hará que los textos
// se guarden
// en mayúsculas, y en el de año si este es anterior a 1950 se pondrá el año
// actual.
// En otra clase denominada Coleccion tendrá una propiedad privada denominada
// videojuegos que será un ArrayList de objetos Videojuego.
// Dispondrá de la función menu en la que se debe permitir al usuario las
// siguientes
// opciones:
// • Insertar nuevo videojuego (se permite decidir al usuario al principio o al
// final de la colección si hubiera ya algún elemento).
// • Visualizar toda las lista de videojuegos: Se muestra en cada fila un
// videojuego bien formateado en columnas incluido el índice en la colección y
// con cabeceras. Si el título o el fabricante ocupa más de 23 caracteres lo
// trunca a tamaño 20 y añade puntos suspensivos (...).
// • Buscar videojuegos: En este punto el usuario mete el principio del título y
// mostrar todos los títulos que empiecen por dicho fragmento.
// • Eliminar videojuego (por posiciones). Se pide un índice y borra el
// videojuego
// de dicha posición.
// • Borrar videojuegos de un año determinado. Se pide un año al usuario y borra
// • todos los videojuegos de ese año.
// • Salir del programa. Finaliza la aplicación y guarda todos los datos en un
// archivo denominado videojuegos.txt con el formato que se explica más abajo.
// Al ejecutar el programa se debe inicializar la colección a partir de un
// archivo
// denominado videojuegos.txt. Si el archivo no existe la colección comienza
// vacía
// (Usa File.exists()). Dicho archivo tiene en cada línea los tres datos del
// videojuego
// separados por punto y coma (;). Por ejemplo:
// Pacman;1980;Capcom
// Undertale;2015;Toby Fox
// Ghost of Tsushima;2020;Sucker Punch
// Hollow Knight;2017;Team Cherry
// Debe haber una comprobación básica de cada línea leída de que tiene tres
// datos y
// que el del medio son 4 digitos (puedes usar Character.isDigit()). Si alguna
// no
// cumple la saltas. Esto hazlo en una función a la que le pasas un string con
// la
// línea leída del archivo y te devuelve un objeto tipo Videojuego con los datos
// o null
// si la línea es incorrecta.
// Debes hacer otras funciones para modularizar mejor el código y evitar repetir
// subrutinas.
// Finalmente en una tercera clase denominada Principal estará el main en el que
// se
// instancia un objeto tipo Coleccion y llama a su función menu.
// Por supuesto se debe hacer un programa claro para el usuario informando o
// salvando los posibles errores que se puedan producir (eliminar titulo no
// existente,
// que introduzca con mayúsculas o minúsculas, que introduzca espacios al
// principio o
// al final de la cadena, etc.)