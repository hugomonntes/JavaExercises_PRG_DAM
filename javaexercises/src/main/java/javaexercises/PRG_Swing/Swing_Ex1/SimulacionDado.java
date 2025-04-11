package javaexercises.PRG_Swing.Swing_Ex1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SimulacionDado extends JFrame {
    public SimulacionDado(){
        JButton boton = new JButton();
        JLabel lblNumeroAleatorio = new JLabel("Numero aleatorio: ");
    }
}

// 1. a) Realiza una pequeña aplicación en Swing que simule un dado. Para ello debe
// tener un botón y una etiqueta. Al pulsar el botón debe salir en la etiqueta un
// número entre 1 y 6. Hazlo con FlowLayout.
// b) Amplía el funcionamiento anterior mediante un JTextField en el cual el usuario
// pueda meter un número. Al pulsar el botón, se toma el valor de dicho JTextField y
// si este es mayor que 1 el dado será entre 1 y dicho valor. Si es cero o negativo o
// un dato no válido (no es número o es número excesivamente grande para int)
// sacará el resultado como si fuera un dado entre 1 y 6.