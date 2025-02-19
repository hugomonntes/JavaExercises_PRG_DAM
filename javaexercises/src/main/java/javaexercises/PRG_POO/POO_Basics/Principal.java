package javaexercises_prg_dam.PRG_POO.POO_Basics;

public class Principal {
    public static void intercambiaRadios(Pelota a, Pelota b){
        double aux;
        aux = a.getRadio();
        a.setRadio(b.getRadio());
        b.setRadio(aux);
    }
    public static void main(String[] args) {
        Pelota pelota = new Pelota();
        pelota.tipo = "Baloncesto";
        pelota.setRadio(20);
        pelota.inflar();
        pelota.inflar(10);
        System.out.println("Tengo una pelota de "+pelota.tipo+" de "+ pelota.getRadio()+" cm de radio");
        Pelota pelota2 = new Pelota();
        pelota2.tipo = "Playa";
        pelota2.getRadio();
        System.out.println("Tengo una pelota de "+pelota2.tipo+" de "+ pelota2.getRadio()+" cm de radio");
        Pelota pelota3 = new Pelota("Futbol", 22);
        System.out.println("Tengo una pelota de "+pelota3.tipo+" de "+ pelota3.getRadio()+" cm de radio");
        intercambiaRadios(pelota2, pelota3);
    }
}
