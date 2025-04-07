package swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CorrectFormUseJFrame extends JFrame {
    public CorrectFormUseJFrame() {
        super("Main Title");

        JLabel label = new JLabel("Label");
        label.setToolTipText("Label");
        this.add(label);
        
        JLabel etiqueta1 = new JLabel("Etiqueta Uno");
        JLabel etiqueta2 = new JLabel("Etiqueta Dos");
        JButton boton1 = new JButton("Aceptar");
        JButton boton2 = new JButton("Cancelar");
        etiqueta1.setLocation(0, 0);
        etiqueta2.setLocation(100, 0);
        boton1.setLocation(0, 100);
        boton2.setLocation(100, 100);
        this.add(etiqueta1, BorderLayout.NORTH);
        this.add(etiqueta2, BorderLayout.SOUTH);
        this.add(boton1, BorderLayout.EAST);
        this.add(boton2, BorderLayout.WEST);
    }
}
