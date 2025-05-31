package prueba_examen.Principal;

import java.util.ArrayList;
import java.util.Scanner;

import prueba_examen.geometria.Circunferencia;
import prueba_examen.geometria.Figura;
import prueba_examen.geometria.Linea;
import prueba_examen.geometria.Poligono;
import prueba_examen.geometria.Punto;
import prueba_examen.interfaz.Libreria;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Figura> colecciónDeFiguras = new ArrayList<>();
        int opcion;
        int opcion2;
        do {
            System.out.println("1. Insertar figura (línea, triángulo, cuadrado o circunferencia)");
            System.out.println("2. Mostrar nombres de las figuras (y radio si es circunferencia)");
            System.out.println("3. Mostrar los datos de una figura (por índice)");
            System.out.println("4. Borrar elementos de un tipo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            try {
                opcion = Libreria.pedirEntero();
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
                                    colecciónDeFiguras.add(new Poligono("Cuadrado", new Punto(), 4));
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
                            System.out.println(figura.getNombre());
                            if (figura.getClass() == Circunferencia.class) {
                                System.out.println(((Circunferencia) figura).getRadio());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Introduce de que elemento quieres ver sus datos");
                        colecciónDeFiguras.get(sc.nextInt() - 1).mostrarDatos();
                        break;
                    case 4:
                        do {
                            System.out.println("1. Linea");
                            System.out.println("2. Poligono (Triangulo y Cuadrado)");
                            System.out.println("3. Circunfererencia");
                            System.out.print("¿Que elementos quieres eliminar? ");
                            opcion2 = Libreria.pedirEntero();
                            switch (opcion2) {
                                case 1:
                                    for (int i = 0; i < colecciónDeFiguras.size(); i++) {
                                        if (colecciónDeFiguras.get(i).getClass() == Linea.class) {
                                            colecciónDeFiguras.remove(i);
                                            i--;
                                        }
                                    }
                                    break;
                                case 2:
                                    for (int i = 0; i < colecciónDeFiguras.size(); i++) {
                                        if (colecciónDeFiguras.get(i).getClass() == Poligono.class) {
                                            colecciónDeFiguras.remove(i);
                                            i--;
                                        }
                                    }
                                    break;
                                case 3:
                                    for (int i = 0; i < colecciónDeFiguras.size(); i++) {
                                        if (colecciónDeFiguras.get(i).getClass() == Circunferencia.class) {
                                            colecciónDeFiguras.remove(i);
                                            i--;
                                        }
                                    }
                                    break;

                                default:
                                    System.out.println("Elige una opción del 1 al 3");
                                    break;
                            }
                        } while (opcion2 < 1 || opcion2 > 3);
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
