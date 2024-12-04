public class Perro { // Planos a partir de ellos puedes construir objetos tipo Perro
    public String raza;
    public String nombre;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int a) {
        edad = a;
    }

    public boolean setTemperatura(int fiebre){
        return fiebre > 39 ? true : false;
    }
}

// 1º Ejercicio repaso de GET y SET si un perro tiene fiebre o no mediante POO (Al parametro de un SET se le llama igual que a la propiedad EJEMPLO: setEdad(int edad))
// 2º Utilizar la palabra reservada THIS (Se utiliza para diferenciar una variable o parametro que se llama igual que otra fuera del SCOPE, EJEMPLO:

// private int edad;

// public int getEdad(int edad) {
//     this.edad = edad (El this.edad se refiere al edad del parámetro *NO DE LA VARIABLE DE ARRIBA*)
//     return edad;
// })
