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
package javaexercises.PRG_POO.POO_Adv.Ex1_poo;

public class Geometria {
    private boolean figura;
    private double altura;
    private double base;

    public boolean getFigura() {
        return figura;
    }

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
        altura = 2;
        base = 2;
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
        return figura ? base * 2 + altura * 2 : base + altura + diagonal();
    }

    public double diagonal(){
        return Math.sqrt(base * base + altura * altura);
    }

    public String tipo(){
        return figura ? "Rectángulo" : "Triangulo";
    }
}
