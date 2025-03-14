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
package javaexercises.PRG_POO.POO_Adv.Ex3_poo;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private double salarioAnual;
    private double irpf;

    // #region SET & GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
        if (salarioAnual < 6000) {
            irpf = 7.5;   
        } else if (salarioAnual >= 6000 && salarioAnual < 30000) {
            irpf = 15;
        } else {
            irpf = 20;
        }
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public double getIrpf() { 
        return irpf;
    }
    //#endregion
    //#region CONSTRUCTORES
    public Empleado(){
        nombre = "";
        apellido = "";
        edad = 0;
        dni = "";
        salarioAnual = 0;
        irpf = 7.5;
    }

    public Empleado(String nombre, String apellido, int edad, String dni, double salarioAnual) { //IRPF va sin parametro ya que no tiene set
        setApellido(apellido);
        setNombre(nombre);
        setEdad(edad);
        setDni(dni);
        setSalarioAnual(salarioAnual);
    }
    //#endregion
    //#region MÉTODOS
    public double calcularHacienda(){
        return getSalarioAnual() * (getIrpf() / 100);
    }
    //#endregion
}
