package javaexercises.PRG_Swing.Swing_Ex6;

import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        FormOperaciones operaciones = new FormOperaciones();
        operaciones.setSize(500, 500);
        operaciones.setVisible(true);
        operaciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
