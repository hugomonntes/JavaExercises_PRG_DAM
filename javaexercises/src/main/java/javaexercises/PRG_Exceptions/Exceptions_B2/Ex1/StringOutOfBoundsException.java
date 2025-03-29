package javaexercises.PRG_Exceptions.Exceptions_B2.Ex1;

public class StringOutOfBoundsException extends IllegalArgumentException {
    public StringOutOfBoundsException(String mensajeDeError){
        super(mensajeDeError);
    }
} 