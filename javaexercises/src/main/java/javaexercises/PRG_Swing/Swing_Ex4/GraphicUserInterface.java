package javaexercises.PRG_Swing.Swing_Ex4;

import javax.swing.JFrame;

public class GraphicUserInterface {
    public static void main(String[] args) {
        FormValidacion formValidacion = new FormValidacion();

        // Interfaz
        formValidacion.setTitle("Formulario Validación");
        formValidacion.setLayout(null);
        formValidacion.setVisible(true);
        formValidacion.setSize(500, 500);
        formValidacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
