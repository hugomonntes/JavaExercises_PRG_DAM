import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex20_b3 {
    public static ArrayList<String> generarJornada(){
        ArrayList<String> equiposLaLiga = new ArrayList<String>(Arrays.asList("FC Barcelona", "Real Madrid", "Celta De Vigo", "Atlético de Madrid", "Athletic Club", "Real Sociedad", "Villareal", "Valencia", "Sevilla", "Espanyol", "Rayo Vallecano", "Betis", "Deportivo De A Coruña", "Ourense CF"));

        ArrayList<String> partidosJornada = new ArrayList<>();

        while (equiposLaLiga.size() > 1) {
            int numeroAleatorio = (int) (Math.random() * equiposLaLiga.size()); //Numero aleatorio hasta la longitud máxima del array
            String equipo1 = equiposLaLiga.get(numeroAleatorio);
            equiposLaLiga.remove(numeroAleatorio); //Borra del Array el equipo que salió

            int numeroAleatorio2 = (int) (Math.random() * equiposLaLiga.size());
            String equipo2 = equiposLaLiga.get(numeroAleatorio2);
            equiposLaLiga.remove(numeroAleatorio2);

            partidosJornada.add(equipo1 + " vs " + equipo2);  //Añade el partido al ArrayList de partidosJornada
        }
        return partidosJornada;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> jornadaCompleta = generarJornada();
        String opcion;

        System.out.println("Partidos de la jornada:");
        System.out.println("Introduce 1 (Gana el equipo Local) X (Empate) 2 (Gana el equipo Visitante)");
        for (int i = 0; i < 7; i++) {
            System.out.print(jornadaCompleta.get(i) + ": ");
            opcion = sc.nextLine();
        }
    }
}

/*
partidos almacenados en un array []
sacar 6 partidos ramdon 
generar resultados ramdon de los partidos 
Hacer menu con 1 X 2 
Saldo Inicial de 10€
incrementa 1€ por partido acertado, si fallas -1€
*/