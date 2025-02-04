package PRG_Arrays.Arrays_Exercises.Ex5_Arrays;

import java.time.LocalDate;

public class Ventas {
    public int[] ventasDelMes = new int[12];

    private int año;

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        int añoActual = LocalDate.now().getYear();
        if (año >= añoActual) {
            this.año = añoActual - 1;
        } else {
            this.año = año;
        }
    }

    public Ventas(int año) {
        setAño(año);
        for (int i = 0; i < ventasDelMes.length; i++) {
            this.ventasDelMes[i] = (int) (Math.random() * 999 + 1);
        }

    }

    public Ventas(int año, int[] ventasDelMes) {
        setAño(año);
        if (ventasDelMes.length != 12) {
            for (int i = 0; i < ventasDelMes.length; i++) {
                this.ventasDelMes[i] = (int) (Math.random() * 999 + 1);
            }
        } else {
            this.ventasDelMes = ventasDelMes;
        }
    }

    public int calcularMedia() {
        int acu = 0;
        for (int i = 0; i < ventasDelMes.length; i++) {
            acu = acu + ventasDelMes[i];
        }
        int mediaVentas = acu / ventasDelMes.length;
        return mediaVentas;
    }

    public void mostrarGrafica(int año, int[] ventasDelMes) {
        setAño(año);
        System.out.println("Año ");
        String unidades = "#";
        for (int i = 1; i < ventasDelMes.length + 1; i++) {
            System.out.printf("Mes %d (%d): %s", i, ventasDelMes, unidades);
        }
    }
}