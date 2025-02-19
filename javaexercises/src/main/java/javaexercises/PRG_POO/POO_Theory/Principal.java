package javaexercises_prg_dam.PRG_POO.POO_Theory;
public class Principal {
    public static void main(String[] args) {
        //Perro p = new Perro();
        Perro p1 = new Perro("Poncho", "Yorkshire", 18, 36);
        if (p1.setTemperatura(40)) {
            System.out.println("Tiene fiebre");
        }
    }
}
