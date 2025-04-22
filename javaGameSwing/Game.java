import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Game extends JFrame implements ActionListener {
    private JButton clicker;
    private JLabel labelContadorClicks;
    private int contador = 0;
    private Timer timer;

    public Game() {
        this.setTitle("Clicker Game");
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Añadir Boton Clicker
        clicker = new JButton("Click Me");
        this.add(clicker);
        clicker.setSize(100, 50);
        clicker.addActionListener(this);

        // Añadir Contador JLabel
        labelContadorClicks = new JLabel();
        this.add(labelContadorClicks);
        labelContadorClicks.setSize(100, 100);

        // Añadir Timer
        timer = new Timer(1000, this);
        timer.setRepeats(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clicker) {
            timer.start();
            clicker.setLocation((int) (Math.random() * 550), (int) (Math.random() * 550));
            labelContadorClicks.setText(String.format("Contador: %d", contador));
            contador++;
            timer.restart();
        } else if (e.getSource() == timer) { // Si se pasa de 3 segundos sin clickar se acaba el juego
            JOptionPane.showMessageDialog(null, "Has perdido!");
            clicker.setEnabled(false);
            timer.stop();
        }
    }
}
