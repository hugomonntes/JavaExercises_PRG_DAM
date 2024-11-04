public class Ex14_b3 {
    public static void main(String[] args) {
        double dado1 = Ex13_b3.tirarDado(6);
        double dado2 = Ex13_b3.tirarDado(6);
        double resultadoDados = dado1 + dado2;
        if (resultadoDados == 7 || resultadoDados == 11) {
            System.out.println("Has ganado");
        }
        if (resultadoDados == 2 || resultadoDados == 3 || resultadoDados == 12) {
            System.out.println("Has perdido gana la CPU");
        }
    }
}

/*
14. Juego Craps: Se desea simular este juego de dados. Para ello:
• Se simula que el jugador tira dos dados de seis caras y se calcula la suma
de ambos.
• Si la suma es 7 u 11 en la primera tirada el jugador gana.
• Si la suma es 2, 3 o 12 en la primera tirada (se denomina craps) el jugador
pierde (gana la CPU).
• Si la suma es un nº entre 4 y 10 salvo el 7, dicha suma son los puntos del
jugador.
• Luego tira la CPU con las mismas reglas. Si al final ambos sacan puntuación
gana la de mayor valor o empate en caso de igualdad.
Deben existir al menos las siguientes funciones:
• tirada: Tira dos dados, muestra sus valores en pantalla y devuelve la suma.
• comprobacion: Se el pasa un valor y devuelve -1 si pierde, 0 si gana o la
puntuación en otro caso.
Como siempre haz otras para organizar código y evitar repetir código. 
*/