public class Principal {
    public static void main(String[] args) {
        Perro p = new Perro();
        if (p.setTemperatura(40)) {
            System.out.println("Tiene fiebre");
        }

    }
}
