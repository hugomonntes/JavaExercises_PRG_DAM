package javaexercises.PRG_Swing.Swing_Ex7;

import javax.swing.JFrame;

public class GraphicUserInterface {
    public static void main(String[] args) {
        FormColors colors = new FormColors();
        colors.setVisible(true);
        colors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colors.setSize(500, 500);
        colors.setLocationRelativeTo(null);
    }
}
