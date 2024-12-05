package PRG_POO.POO_Adv.Ex1_poo;

public class Geometria {
    private boolean figura;
    private double altura;
    private double base;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public Geometria(){
        figura = false;
        setAltura(2);
        setBase(2);
    }
    public Geometria(double base, double altura){
        figura = false;
        setAltura(base);
        setBase(altura);
    }
}
