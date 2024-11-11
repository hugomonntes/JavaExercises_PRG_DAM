import java.util.ArrayList;

public class Ex20_b3 {
    public static String partidosJornada(){
        ArrayList<String> equiposLaLiga = new ArrayList<String>();
        String[] equiposLaLiga = {"FC Barcelona", "Real Madrid", "Celta De Vigo", "Atlético de Madrid", "Athletic Club", "Real Sociedad", "Villareal", "Valencia", "Sevilla", "Espanyol", "Rayo Vallecano", "Betis", "Deportivo De A Coruña", "Ourense CF"};
        int numeroAleatorio = 0;
        int numeroAleatorio2 = 0;
        do{
            numeroAleatorio = (int)(Math.random()*equiposLaLiga.length);
            numeroAleatorio2 = (int)(Math.random()*equiposLaLiga.length);
            equiposLaLiga.remove(numeroAleatorio);
        } while(numeroAleatorio == numeroAleatorio2);
        String partido1 = "";
        String equipo1 = equiposLaLiga[numeroAleatorio];
        String equipo2 = equiposLaLiga[numeroAleatorio2];
        partido1 = equipo1 + " vs " + equipo2;
        return partido1;
    }
    public static void main(String[] args) {
        System.out.println(partidosJornada());
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