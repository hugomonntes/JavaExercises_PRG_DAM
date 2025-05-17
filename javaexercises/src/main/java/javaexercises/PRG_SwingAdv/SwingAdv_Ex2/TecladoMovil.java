package javaexercises.PRG_SwingAdv.SwingAdv_Ex2;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TecladoMovil extends JFrame {
    private JButton btnDefault;

    public TecladoMovil() {
        // Props Window
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(500, 500);

        for (int i = 1; i <= 12; i++) {
            if (i < 10) {
                btnDefault = new JButton(String.format("%d", i));
            } else if (i == 10) {
                btnDefault = new JButton(String.format("0"));
            } else if (i == 11) {
                btnDefault = new JButton(String.format("#"));
            } else if (i == 12) {
                btnDefault = new JButton(String.format("*"));
            }
            this.add(btnDefault);
            btnDefault.addMouseListener(new EventosMouse());
            btnDefault.addMouseMotionListener(new EventosMouse());
        }
    }

    public class EventosMouse extends MouseAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            btnDefault.setBackground(Color.LIGHT_GRAY);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            btnDefault.setBackground(null);
        }
    }
}

// • Debe tener al menos 12 botones con los números del 1 al 9 en las tres
// primeras filas y en la última la almohadilla (#), el 0 y el asterisco (*).

// Se inicializarán los 12 mediante un bucle (no habrá 12 variables JButton).
// • Cuando el ratón pase por encima de los botones cambiará de color y si se
// pulsan quedarán permanentemente con un tercer color.
// • Además se dispondrá de un JTextfield donde se mostrarán los números
// pulsados. Será no editable.
// • Si se pulsa una tecla que corresponda a un número también funcionará.
// • Finalmente se creará otro botón más de reset (este no es necesario que se
// haga en el bucle) mediante el cual se borra el textfield y se restaura el
// color
// de todos los botones.