package javaexercises.PRG_PooAdv.PooAdv_B2.Ex1;

public class StringTooLongException extends IllegalArgumentException{
    public StringTooLongException(){
        super("Cadena demasiado larga");
    }
}