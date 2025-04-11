package javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria;

public class Poligono extends Figura{
    public Punto[] listaDePuntos;

    public Poligono(String nombre, Punto puntoOrigen, Punto cantidadPuntos){
        setNombre(nombre);
        setOrigen(puntoOrigen);
        listaDePuntos = new Punto[(int) (Math.random() * 10)];
    }

    public Poligono(){
        Figura triangulo = new Figura(new Punto(0, 0), "Triangulo");
        for (int i = 0; i < listaDePuntos.length; i++) {
            listaDePuntos[i] = new Punto((int) (Math.random() * 10), (int) (Math.random() * 10));
        }
    }
}

// • Hereda de Figura y contiene un array de puntos público. El origen no forma
// parte de la figura, equivaldrá a su centro.
// • Un constructor tiene como parámetros el nombre, el origen y la cantidad de
// puntos con lo que inicializa las propiedades correspondientes y el tamaño del
// array. Los puntos del array los inicializas con valores aleatorios.
// • Añade un constructor sin parámetros que inicialice un triángulo que tu
// decidas llamando al otro constructor y luego fijando los puntos (0,0), (1,1) y
// (1,0).
// • Amplía pedirDatos y mostrarDatos mediante sobreescritura. No es necesario
// realizar ninguna comprobación sobre los puntos (da igual que estén
// repetidos, en línea…).