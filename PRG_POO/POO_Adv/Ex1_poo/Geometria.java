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
        this.altura = 2;
        this.base = 2;
    }
    
    public Geometria(double base, double altura){
        figura = false;
        this.altura = altura;
        this.base = base;
    }
    
    public Geometria(boolean figura,double base, double altura){
        this.figura = figura;
        this.altura = altura;
        this.base = base;
    }

    public double area() {
        return figura ? base * altura : base * altura / 2;
    }

    public double perimetro(){
        return base + altura + diagonal();
    }

    public double diagonal(){
        double calcularHipotenusa = Math.sqrt(base * base + altura * altura);
        return calcularHipotenusa;
    }

    public String tipo(){
        return figura ? "Rectángulo" : "Triangulo";
    }
}
