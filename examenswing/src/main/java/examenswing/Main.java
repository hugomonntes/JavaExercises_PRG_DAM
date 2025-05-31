package examenswing;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Form form = new Form();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
        form.setSize(500, 500);
        form.setLocationRelativeTo(null);
    }
}
