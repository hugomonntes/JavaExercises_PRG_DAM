package wordle;

import javax.swing.JFrame;

public class Aplicacion {
    public static void main(String[] args) {
        Principal app = new Principal();
        app.setSize(500, 500);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
    }
}
