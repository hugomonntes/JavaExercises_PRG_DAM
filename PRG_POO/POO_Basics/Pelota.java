public class Pelota {
    public String tipo;
    private double radio;

    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public Pelota(){
        tipo = "Playa";
        radio = 40;
    }
    public Pelota(String tipo, double radio){
        this.tipo = tipo;
        this.radio = radio;
    }
}
