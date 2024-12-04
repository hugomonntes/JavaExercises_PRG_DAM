public class Principal {
    public static void main(String[] args) {
        Pelota pelota = new Pelota();
        pelota.tipo = "Baloncesto";
        pelota.radio = 20;
        System.out.printf("Tipo: %s, Radio: %d", pelota.tipo, pelota.radio);
    }
}
