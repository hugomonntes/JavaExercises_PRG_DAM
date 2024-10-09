public class Ejercicio1Boletin {
    public static void main(String[] args) {
        int contador = 0;
        int contadorDoWhile = 0;

        while (contador < 20) {
            contador++;
            System.out.println("while " + contador);
        }

        do{
            contadorDoWhile++;
            System.out.println("DoWhile " + contadorDoWhile);
        } while(contadorDoWhile < 20);
        
    
        for(int i = 1; i<=20; i++){
            System.out.println("For " + i);            
        }
        
        for(int i = 2; i<=50; i = i + 2){
            System.out.printf("Pares %5d \n ", i);      
        }
    }
}
