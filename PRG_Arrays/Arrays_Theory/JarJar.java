package PRG_Arrays.Arrays_Theory;

public class JarJar {
    public static void main(String[] args) {
        String fraseJar = "Jar-Jar is the Big Boss";
        System.out.println(fraseJar.length());
        System.out.println(fraseJar.charAt(0) + fraseJar.charAt(fraseJar.length() - 1));
        String fraseMod = fraseJar.toUpperCase();
        System.out.println(fraseJar.equals(fraseMod));
        System.out.println(fraseJar.equalsIgnoreCase(fraseMod));
        System.out.println(fraseJar.toLowerCase());
    }
}
/*
• Comprueba si la cadena acaba por “Boss” y por “Jar”.
• Muestra la posición de la primera y la última vez que aparece la palabra
“Jar”.
• Crea otra variable String a partir del fragmento de la cadena anterior
que empieza en la posición 7 y acaba en la 14 (ambos incluidos).
• Quita los espacios de los extremos de la anterior cadena creada y
muéstrala.
• Crea un array de Strings con las palabras de la primera cadena (los
separadores son el espacio y el guion).
• Muestra cada palabra del array anterior en una linea ocupando 3
caracteres (cortala si es mayor). Esto no lo hagas con substring si no
jugando con el formateo de printf.
*/