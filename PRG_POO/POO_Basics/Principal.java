public class Principal {
    public static void main(String[] args) {
        Pelota pelota = new Pelota();
        Pelota pelota2 = new Pelota();
        Pelota pelota3 = new Pelota("Futbol", 22);
        pelota.tipo = "Baloncesto";
        pelota.radio = 20;
        System.out.printf("Tipo: %s, Radio: %f", pelota.tipo, pelota.radio);
        // System.out.printf("Tipo: %s, Radio: %f", pelota.tipo, pelota.radio);
        // System.out.printf("Tipo: %s, Radio: %f", pelota.tipo, pelota.radio);
    }
}
