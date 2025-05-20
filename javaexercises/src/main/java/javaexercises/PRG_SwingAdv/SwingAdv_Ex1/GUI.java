package javaexercises.PRG_SwingAdv.SwingAdv_Ex1;

import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        FormPrincipal control = new FormPrincipal();
        control.setSize(500, 500);
        control.setVisible(true);
        control.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
