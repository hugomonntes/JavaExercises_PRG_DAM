package javaswingadv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Botones extends JFrame implements ActionListener {
    private String[] programadores = { "Ada Lovelace", "Denis Ritchie",
            "Grace Hopper", "Tim Berners Lee",
            "Margaret Hamilton", "Sheldon Cooper" };

    public Botones() {
        super();
        setLayout(null);
        int x = 10, y = 10;
        for (int i = 0; i < programadores.length; i++) {
            JButton b = new JButton(programadores[i]);
            b.setSize(200, 30);
            b.setLocation(x, y);
            b.addActionListener(this);
            this.add(b);
            if ((i + 1) % 3 == 0) { // Cada 3 botones cambia de “línea”
                x = 10;
                y += 40;
            } else {
                x += 210;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,
                "Ha seleccionado " + ((JButton) e.getSource()).getText());
    }
}
