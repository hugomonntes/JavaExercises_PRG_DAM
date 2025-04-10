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
        etiqueta1.setLocation(0, 0);
        etiqueta1.setSize(100, 20);
        etiqueta1.setBounds(0,0,100,20); // Equivalente a setLocation y setSize pero los dos juntos
        this.add(etiqueta1, BorderLayout.NORTH);

        JLabel etiqueta2 = new JLabel("Etiqueta Dos");
        etiqueta2.setLocation(100, 0);
        etiqueta2.setSize(100, 20);
        this.add(etiqueta2, BorderLayout.SOUTH);
        
        JButton boton1 = new JButton("Aceptar");
        boton1.setLocation(0, 100);
        boton1.setSize(100, 20);
        this.add(boton1, BorderLayout.EAST);

        JButton boton2 = new JButton("Cancelar");
        boton2.setLocation(100, 100);
        boton2.setSize(100, 20);
        this.add(boton2, BorderLayout.WEST);
    }
}
