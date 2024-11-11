public class Ex20_b3 {
    public static int numeroAleatorio(){
        int numero = (int)(Math.random()*14);
        return numero;
    }
    public static void main(String[] args) {
        int numeroAleatorio = numeroAleatorio();
        int numeroAleatorio2 = numeroAleatorio();
        String[] equiposLaLiga = {"FC Barcelona", "Real Madrid", "Celta De Vigo", "Atlético de Madrid", "Athletic Club", "Real Sociedad", "Villareal", "Valencia", "Sevilla", "Espanyol", "Rayo Vallecano", "Betis", "Deportivo De A Coruña", "Ourense CF"};
        String partido1 = "";
        String equipo1 = equiposLaLiga[numeroAleatorio];
        String equipo2 = equiposLaLiga[numeroAleatorio2];
        partido1 = equipo1 + " vs " + equipo2;
        System.out.println(partido1);
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