package prg_arrays.Arrays_Exercises.Ex5_Arrays;

import java.time.LocalDate;

public class Ventas {//TODO comentarios
    public int[] ventasAnuales = new int[12]; //12 por los meses de año
    private int año;

    public void setAño(int año) {
        if (año >= LocalDate.now().getYear()) {
            this.año = LocalDate.now().getYear() - 1;
        } else {
            this.año = año;
        }
    }

    public int getAño() {
        return año;
    }

    public Ventas(int año){
        setAño(año);
        for (int i = 0; i < ventasAnuales.length; i++) {
            ventasAnuales[i] = (int)(Math.random()*1000);
        }
    }
    
    public Ventas(int año, int[] ventasAnuales){//TODO revisar
        setAño(año);
        if (this.ventasAnuales.length != 12) {
            for (int i = 0; i < ventasAnuales.length; i++) {
                ventasAnuales[i] = (int)(Math.random()*1000);
            }
        }
        this.ventasAnuales = ventasAnuales;
    }

    //MÉTODOS
    public double calcularMedia(){
        double acumulador = 0;
        for (int i = 0; i < ventasAnuales.length; i++) {
            acumulador += ventasAnuales[i];
        }
        return acumulador / ventasAnuales.length;
    }

    public void mostrarGrafica(){ //TODO revisar nº de # y paréntesisf("%d ; 
        System.out.printf("Año %d:\n", getAño());
        for (int i = 1; i <= ventasAnuales.length; i++) {
            int calculoHastags = ventasAnuales[i - 1] / 100;
            System.out.printf("Mes %2d (%3d):", i, ventasAnuales[i - 1]);
            if (ventasAnuales[i - 1] < 100) {
                System.out.print("#");
            }
            for (int j = 0; j < calculoHastags; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}