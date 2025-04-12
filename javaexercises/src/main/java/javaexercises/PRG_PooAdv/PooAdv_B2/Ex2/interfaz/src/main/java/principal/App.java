package javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.principal;

import java.util.ArrayList;
import java.util.Scanner;

import javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria.Circunferencia;
import javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria.Figura;
import javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria.Linea;
import javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria.Poligono;
import javaexercises.PRG_PooAdv.PooAdv_B2.Ex2.interfaz.src.main.java.geometria.Punto;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figura> colecciónDeFiguras = new ArrayList<>();
        int opcion;
        do {
            System.out.println("1. Insertar figura (línea, triángulo, cuadrado o circunferencia)");
            System.out.println("2. Mostrar nombres de las figuras (y radio si es circunferencia)");
            System.out.println("3. Mostrar los datos de una figura (por índice)");
            System.out.println("4. Borrar elementos de un tipo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("1. Línea");
                        System.out.println("2. Triángulo");
                        System.out.println("3. Cuadrado");
                        System.out.println("4. Circunferencia");
                        System.out.print("Elige una figura: ");
                        int tipoFigura;
                        try {
                            tipoFigura = sc.nextInt();
                            switch (tipoFigura) {
                                case 1:
                                    colecciónDeFiguras.add(new Linea());
                                    break;
                                case 2:
                                    colecciónDeFiguras.add(new Poligono());
                                    break;
                                case 3:
                                    colecciónDeFiguras.add(new Poligono("Cuadrado",new Punto(), 4));
                                    break;
                                case 4:
                                    colecciónDeFiguras.add(new Circunferencia(new Punto(0, 0), 4));
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Introduce un número válido.");
                        }
                        break;
                    case 2:
                        for (Figura figura : colecciónDeFiguras) {
                            if (figura.getNombre().equals("Circunferencia")) {
                                System.out.println(figura.getNombre());
                                System.out.println(((Circunferencia) figura).getRadio()); // NO Olvidar Parentesis Casting a Figura
                            } else {
                                System.out.println(figura.getNombre());
                            }
                        }
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número válido.");
                opcion = 0;
            }
        } while (opcion != 5);
        sc.close();
    }
}

// Simplemente estará el main. En el debes crear una colección de objetos tipo
// Figura.
// Un menú dará opciones de:
// • Insertar una línea, un triángulo un cuadrado o una circunferencia.
// • Mostrar los elementos de la colección (sólo el nombre y, en el caso de
// circunferencias, también el radio).
// • Mostrar los datos de un elemento de la colección (buscando por el índice).
// • Borrar elementos de un tipo.
// • Salir. Como siempre, solo acaba el programa al elegir esta opción.
// Recuerda el control de excepciones necesario.