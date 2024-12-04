# POO THEORY

## Repaso GET y SET
>Ejercicios repaso de GET y SET si un perro tiene fiebre o no mediante POO (Al parametro de un SET se le llama igual que a la propiedad EJEMPLO: setEdad(int edad)).

## THIS
>Para utilizar la palabra reservada THIS (Se utiliza para diferenciar una variable o parametro que se llama igual que otra fuera del **SCOPE**, el THIS sirve para deshacer conflictos entre variables o parametros, ES COMO DECIR YO e identificarse a sí mismo.

>EJEMPLO:
<private int edad
public int getEdad(int edad) {
    this.edad = edad (El this.edad se refiere al edad del parámetro *NO DE LA VARIABLE DE ARRIBA*)
    return edad;
})
**OTRA POSIBILIDAD DE LA PALABRA THIS ES DEVOLVERSE A SI MISMA**
public Perro foo(){
    return this;
}

## CONSTRUCTORES
>Es una función que se encarga de inicializar al objeto a través de parámetros.
**No tiene ningún tipo de función.**

>EJEMPLO:
<public Perro (String nombre, String raza, int edad, double temperatura){
    this.nombre = nombre;
    this.raza = raza;
    this.setEdad(edad);
    this.setTemperatura(temperatura);
}>

<Perro p1 = new Perro(Poncho, Yorkshire, 18, 36);

## SOBRECARGA
## MIEMBROS ESTÁTICOS
