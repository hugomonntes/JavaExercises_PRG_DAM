import java.util.Scanner;
public class Ex10_b3 {
    public static int calcularArea(int base, int altura, boolean flag){
        return flag ? base * altura : base * altura / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int base;
        int altura;
        boolean flag;
        do{
            System.out.print("Escoge una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: System.out.println("Area de un triángulo");
                flag = false;
                System.out.print("Indica el tamaño de la base: ");
                base = sc.nextInt();
                System.out.print("Indica el tamaño de la altura: ");
                altura = sc.nextInt();
                System.out.println(calcularArea(base, altura, flag));
                break;

                case 2: System.out.println("Area de un rectángulo");
                flag = true;
                System.out.print("Indica el tamaño de la base: ");
                base = sc.nextInt();
                System.out.print("Indica el tamaño de la altura: ");
                altura = sc.nextInt();
                System.out.println(calcularArea(base, altura, flag));
                break;

                case 3: System.out.println("Area de un cuadrado");
                break;

                case 4: System.out.println("Area de un círculo");
                break;

                case 5: System.out.println("Salir");
                break;
            
                default: System.out.println("Introduce una opción válida!");
                break;
            }
        } while (opcion != 5);
    }
}

/*
10. a) Realizar un método que permita hallar el área de un rectángulo o de un
triángulo rectángulo a partir de la base, la altura y un parámetro booleano
(denominado bandera, flag o interruptor) para decidir si se trata de un rectángulo o
un triángulo. Es decir, si se pasa como parámetro true hace el cálculo del área de
un rectángulo, si se pasa false calcula el del triángulo.

Devuelve el área. Parámetros del método: base, altura y la bandera
*/