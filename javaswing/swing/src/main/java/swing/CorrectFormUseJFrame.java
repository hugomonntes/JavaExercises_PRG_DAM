package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CorrectFormUseJFrame extends JFrame {
    public CorrectFormUseJFrame() {
        super("Main Title");

        JLabel label = new JLabel("Label");
        label.setToolTipText("Label");
        this.add(label);
        // setLayout(new FlowLayout()); // Style Layout
        setLayout(null); // Style sin Layout Si no estableces tamaños no funciona
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

        etiqueta1.setSize(100, 20);
        etiqueta2.setSize(100, 20);
        boton1.setSize(100, 20);
        boton2.setSize(100, 20);
    }
}
