package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Eventos1 extends JFrame implements ActionListener {
    // Declaración de los componentes
    private JLabel etiqueta1;
    private JButton boton1;

    // Constructor
    public Eventos1() {
        super("Controlando eventos I");
        this.setLayout(new FlowLayout());
        // Botón
        boton1 = new JButton("¡¡Púlsame!!");
        this.add(boton1);
        // Etiqueta
        etiqueta1 = new JLabel("Aún no has pulsado el botón");
        this.add(etiqueta1);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
    }
}
