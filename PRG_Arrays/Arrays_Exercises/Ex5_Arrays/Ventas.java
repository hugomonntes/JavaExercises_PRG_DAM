package PRG_Arrays.Arrays_Exercises.Ex5_Arrays;

import java.time.LocalDate;

public class Ventas {
    public int[] mesesAño = new int[12];
    private int año;

    public void setAño(int año) {
        this.año = año;
        if (año >= LocalDate.now().getYear()) {
            this.año = (LocalDate.now().getYear()) - 1;
        }
    }

    public int getAño() {
        return año;
    }
    
    public Ventas(int año) {
        
    }
}

/*
- Un constructor que inicialice el vector con números aleatorios entre 0 y 999
(ambos incluidos) y el año con un parámetro.
- Un constructor sobrecargado con dos parámetros: el año y el array de
tamaño 12 con el que inicializa el vector de ventas. Si no fuera de tamaño 12
lo crea automáticamente como en el otro constructor.
- Un método denominado media que devuelve la media de valores del vector.
- Un método denominado grafica que muestra en pantalla un gráfico de
barras de forma que cada 100 unidades vendidas aparezca un nuevo bloque
# aumentado a la barra de ese mes. Será algo así (fíjate que quede bien
formateado):
*/