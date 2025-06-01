package javaexercises.PRG_SwingAdv.Prueba;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        FormPrincipal f = new FormPrincipal();
        f.setTitle("F");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
