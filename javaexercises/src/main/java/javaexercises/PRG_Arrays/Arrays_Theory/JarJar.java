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
package javaexercises.PRG_Arrays.Arrays_Theory;

public class JarJar {
    public static void main(String[] args) {
        String fraseEjercicio = "Jar-Jar is the Big Boss";
        System.out.println(fraseEjercicio.length());
        
        System.out.println(fraseEjercicio.charAt(0));
        
        System.out.println(fraseEjercicio.charAt(fraseEjercicio.length() - 1));
        
        System.out.println(fraseEjercicio.toUpperCase());
        String fraseEjercicio2 = fraseEjercicio.toUpperCase();
        
        System.out.println(fraseEjercicio.equals(fraseEjercicio2));
        System.out.println(fraseEjercicio.equalsIgnoreCase(fraseEjercicio2));
        
        System.out.println(fraseEjercicio.toLowerCase());
        
        System.out.println(fraseEjercicio.endsWith("Jar"));
        System.out.println(fraseEjercicio.endsWith("Boss"));
        
        System.out.println(fraseEjercicio.indexOf("Jar"));
        System.out.println(fraseEjercicio.lastIndexOf("Jar"));
        
        String fraseEjercicio3 = fraseEjercicio2.substring(7, 15);
        System.out.println(fraseEjercicio3);
        
        System.out.println(fraseEjercicio3.trim());
        
        String[] frase = fraseEjercicio.split("[ -]");
        
        for (int i = 0; i < frase.length; i++) {
            System.out.printf("%3.3s\n", frase[i]);
        }
    }
}
