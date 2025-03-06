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