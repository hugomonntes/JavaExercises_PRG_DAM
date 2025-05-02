package javaexercises.PRG_Swing.Swing_Ex5;

import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        Tragaperras tragaperras = new Tragaperras();
        tragaperras.setVisible(true);
        tragaperras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tragaperras.setSize(500, 500);
    }
}
