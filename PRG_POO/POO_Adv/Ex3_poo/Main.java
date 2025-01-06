package PRG_POO.POO_Adv.Ex3_poo;

public class Main {
    public static void main(String[] args) {
        Directivo directivo = new Directivo();
        Empleado empleado1 = new Empleado("Fran", "Martinez", 32, "123456789V", 1900.0);
        Empleado empleado2 = new Empleado("Jaime", "Perez", 20, "987456321Z", 1300.0);
        Empresa empresa = new Empresa(directivo, empleado1, 200000);
    }
}
