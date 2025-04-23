package javaexercises.PRG_Swing.Swing_Ex2;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GraphicUserInterface {
    public static void main(String[] args) {
        FormUser formulario = new FormUser();

        formulario.setTitle("Formulario User");
        formulario.setLayout(new FlowLayout());
        formulario.setVisible(true);
        formulario.setSize(400, 400);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
