package javaswingadv;

import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        // EventosMouse eventos = new EventosMouse();
        EventosKeyBoard eventos = new EventosKeyBoard();
        eventos.setSize(500, 500);
        eventos.setVisible(true);
        eventos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
