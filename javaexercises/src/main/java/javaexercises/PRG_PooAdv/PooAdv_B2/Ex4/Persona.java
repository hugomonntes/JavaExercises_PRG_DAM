package javaexercises.PRG_PooAdv.PooAdv_B2.Ex4;

abstract class Persona {
    
}

// 4. Retoma del primer tema de POO las clases Empleado y Directivo y rehazlas
// usando herencia de la siguiente forma:
// Crea una clase abstracta denominada Persona que tenga los elementos comunes
// de Empleado y Directivo.
// Además dispondrá del método abstracto firmaMail. Este método lo
// implementarás luego (no en Persona) en Empleado (devolviendo nombre y
// apellidos del mismo) y en Directivo (devolviendo nombre apellidos y departamento
// rodeado de asteriscos).
// Revisa ambas clases de forma que minimices la repetición de código con llamadas
// entre constructores.
// Sobreescribe toString() de forma que devuelva nombre y apellidos. Piensa donde
// realizar esta función.
// Amplia con la comprobación del DNI en el set correspondiente de la siguiente
// forma:
// • En el set se pasa un numero de dni y la letra. Puede ir sin separaci ón o
// separado con un guión (123456789X o 123456789-X). Debe comprobar si la
// letra corresponde al DNI. El algoritmo es el siguiente:
// ◦ Se coge el n.º y se calcula el resto de dividirlo entre 23.