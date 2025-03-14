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

public class Directivo {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private String nombreDepartamento;
    private double beneficios;

    // #region SET & GET
    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
    public String getNombre() {
        return "\"" + nombre + "\"";
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
    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }
    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
    public double getBeneficios() {
        return (beneficios >= 0 && beneficios <= 100) ? beneficios : 0;
    }
    // #endregion
    //#region CONSTRUCTORES
    public Directivo(){
        nombre = "";
        apellido = "";
        edad = 0;
        dni = "";
        nombreDepartamento = "";
        beneficios = 0;
    }

    public Directivo(String nombre, String apellido, int edad, String dni, String nombreDepartamento, double beneficios){
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setDni(dni);
        setNombreDepartamento(nombreDepartamento);
        setBeneficios(beneficios);
    }
    //#endregion
    //#region MÉTODOS
    public double calcularBeneficio(){
        return getBeneficios() < 0 ? 0 : getBeneficios();
    }
    //#endregion
}
