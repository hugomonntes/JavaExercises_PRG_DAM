package swing;

import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        CorrectFormUseJFrame window = new CorrectFormUseJFrame();
        window.setSize(300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
