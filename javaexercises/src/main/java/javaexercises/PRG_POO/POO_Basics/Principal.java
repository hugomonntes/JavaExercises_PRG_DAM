/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2025 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
package javaexercises.PRG_POO.POO_Basics;

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
