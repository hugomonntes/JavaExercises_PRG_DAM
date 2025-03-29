package javaexercises.PRG_Exceptions.Exceptions_B2.Ex1;

public class StringTooLongException extends IllegalArgumentException{
    public StringTooLongException(){
        super("Cadena demasiado larga");
    }
}