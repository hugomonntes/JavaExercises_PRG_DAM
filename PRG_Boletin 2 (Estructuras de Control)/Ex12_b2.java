public class Ejercicio12Boletin {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            System.out.println(i);
        }
        System.out.println(" \n_________________ \n");

        for(int i = 50; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println(" \n_________________ \n");

        for(int i = 2; i < 20; i = i + 2){
            System.out.println(i);
        }
        System.out.println(" \n_________________ \n");

        for(int i = 91; i <= 130; i = i + 2){
            System.out.println(i);
        }
        System.out.println(" \n_________________ \n");
        
        for(int i = 70; i >= 25; i = i - 5){
            System.out.println(i);
        }
    }
}

/*
12.Realizar un programa que saque los siguientes datos por pantalla (usa bucles
for y haz en un único programa todos los apartados).
a) Los números del 1 al 50.
b) En orden inversa del 50 al 1
c) Los números pares menores que 20 por orden creciente (2, 4, 6, 8, ... 16,
18)
d) Los números impares entre lo 90 y el 130 por orden creciente
e) Los múltiplos de 5 entre el 70 y el 25 por orden decreciente (70, 65, ...
30,25).
*/