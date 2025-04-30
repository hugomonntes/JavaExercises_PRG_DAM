package javaexercises.PRG_Swing.Swing_Ex3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class SelectColor extends JFrame implements ActionListener{
    private JButton botonAmarillo;
    private JButton botonAzul;
    private JButton botonRamdon;

    public SelectColor(){
        // Boton Amarillo
        botonAmarillo = new JButton();
        botonAmarillo.setText("Amarillo");
        botonAmarillo.setSize(100, 100);
        botonAmarillo.addActionListener(this);
        this.add(botonAmarillo);

        // Boton Azul
        botonAzul = new JButton();
        botonAzul.setText("Azul");
        botonAzul.setSize(100, 100);
        botonAzul.addActionListener(this);
        this.add(botonAzul);

        // Boton Ramdon
        botonRamdon = new JButton();
        botonRamdon.setText("Ramdon");
        botonRamdon.setSize(100, 100);
        botonRamdon.addActionListener(this);
        this.add(botonRamdon);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonAmarillo) {
            this.getContentPane().setBackground(Color.YELLOW);
        } else if (evento.getSource() == botonAzul) {
            this.getContentPane().setBackground(Color.BLUE);
        } else if (evento.getSource() == botonRamdon && (evento.getModifiers() & evento.SHIFT_MASK) == evento.SHIFT_MASK){
            this.getContentPane().setBackground(new Color((int)(Math.random() * 1000000))); // No esta en la especificación
            this.setLocation((int)(Math.random() * 600), (int)(Math.random() * 400));
        } else if (evento.getSource() == botonRamdon) {
            botonRamdon.setLocation((int)(Math.random() * 300), (int)(Math.random() * 300));
        }
        // System.err.println(evento.SHIFT_MASK == 1);
    }
}

// 3. Crea un formulario en null layout con 3 botones y de título Colores. Uno con
// texto Amarillo, otro con texto Azul y un tercero con el texto Aleatorio.
// Si se pulsa el amarillo o el azul el color de fondo del formulario cambiará a dicho
// color(usa getContentPane()). (ok)

// Si pulsa el botón Aleatorio cambiará la posición del formulario en la pantalla dentro
// de un área de 600x400 aproximadamente (Deduce o averigua como hacerlo). (ok)

// Si al mismo tiempo que pulsas aleatorio se está pulsando la tecla SHIFT lo que
// cambiará de posición será el botón Aleatorio a alguna posición visible del formulario
// (coge la altura del Content Pane para no tener en cuenta la barra de título). (ok) 