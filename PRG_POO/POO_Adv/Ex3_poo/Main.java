package PRG_POO.POO_Adv.Ex3_poo;

public class Main {
    public static void main(String[] args) {
        Directivo directivo = new Directivo();
        Empleado empleado1 = new Empleado("Fran", "Martinez", 32, "123456789V", 1900.0);
        Empleado empleado2 = new Empleado("Jaime", "Perez", 20, "987456321Z", 1300.0);
        Empresa empresa = new Empresa(directivo, empleado1, 200000);
        /*
        A continuación se plantea un menú con las siguientes opciones:
        1. Ver datos empleados: Submenú que pregunta si se desean ver todos los
        datos de ambos empleados o solo un dato de ambos empleados (se usarán
        los métodos correspondientes). Este submenú tendrá un apartado salir. Este
        apartado debe estar en una función aparte.
        2. Ver datos directivo: Mostrará los datos del directivo incluido el beneficio
        final en euros.
        3. Modificar datos: Submenú que pregunta por el cambio en directivo o uno de
        los empleados. Este apartado debe estar en una función aparte.
        4. Pagar: Se disminuyen las ganancias de la empresa según lo que cobren los
        empleados. Se muestra el valor antes y después de pagar.
        5. Cobrar: Simplemente se pide una valor al usuario que incrementa en el
        campo ganancias. Se muestra el valor antes y después de pagar.
        6. Salir: Como siempre, el programa no terminará hasta que se selecciones
        esta opción.
        */
    
    }
}
