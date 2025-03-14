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

public class Empresa {
    private int ganancias;
    private Directivo directivo;
    private Empleado empleados;

    //#region SET & GET
    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getGanancias() {
        return ganancias;
    }
    //#endregion

    //#region CONSTRUCTORES
    public Empresa(Directivo directivo, Empleado empleados){
        this.directivo = directivo;
        this.empleados = empleados;
        setGanancias(ganancias);
    }

    public Empresa(Directivo directivo, Empleado empleados, int ganancias){
        this.directivo = directivo;
        this.empleados = empleados;
        setGanancias(ganancias);
    }
    //#endregion
}
