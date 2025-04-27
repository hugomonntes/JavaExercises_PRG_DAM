package javaexercises.PRG_PooAdv.PooAdv_B2.Ex5;

import java.util.ArrayList;

public class Planeta extends Astro{
    private boolean gaseoso;
    public ArrayList<Astro> satelites;

    public void setGaseoso(boolean gaseoso) {
        this.gaseoso = gaseoso;
    }

    public boolean getGaseoso(){
        return gaseoso;
    }

    public Planeta(String nombre, double radio, boolean gaseoso){
        setNombre(nombre);
        setRadio(radio);
        setGaseoso(gaseoso);
        satelites = new ArrayList<>();
    }

    public Planeta(){
        this("", 0, false);
    }
}