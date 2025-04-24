package javaexercises.PRG_Swing.Swing_Ex3;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GraphicUserInterface {
    public static void main(String[] args) {
        SelectColor color = new SelectColor();
        //Propiedades Formulario
        color.setTitle("Formulario Colores");
        color.setLayout(new FlowLayout());
        color.setVisible(true);
        color.setSize(400, 400);
        color.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
