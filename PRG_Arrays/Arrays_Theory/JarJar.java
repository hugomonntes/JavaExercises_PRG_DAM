package PRG_Arrays.Arrays_Theory;

public class JarJar {
    public static void main(String[] args) {
        String fraseJar = "Jar-Jar is the Big Boss";
        System.out.println(fraseJar.length());
        System.out.println(fraseJar.charAt(0) + fraseJar.charAt(fraseJar.length() - 1));
    }
}
/*
Declara e inicializa una variable de tipo String con la frase: “Jar-Jar is the Big
Boss”
Utilizando las funciones citadas anteriormente y viendo como se usan
mediante la documentación:
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
En el main realiza las siguientes tareas (deben funcionar aunque se cambie la
frase):
• Muestra la longitud de la cadena
• Muestra el primer carácter, el último y comprueba lo que pasa al acceder
al carácter de la posición 100.
• Crea una segunda cadena a partir de la primera pasándola a mayúsculas
y observa el resultado de equals y equalsIgnoreCase.
• Muestra la cadena en minúsculas.
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