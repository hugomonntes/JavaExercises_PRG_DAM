package javaexercises.PRG_SwingAdv.SwingAdv_Ex2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TecladoMovil extends JFrame implements ActionListener {
    private JTextField txfPantalla;
    String[] etiquetasBotones = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "#", "*" };

    public TecladoMovil() {
        // Props Window
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500, 500);

        // Props Botones
        for (String etiqueta : etiquetasBotones) {
            JButton btnDefault = new JButton(etiqueta);
            class EventosMouse extends MouseAdapter {
                @Override
                public void mouseMoved(MouseEvent e) {
                    if (!btnDefault.getBackground().equals(Color.orange)) {
                        btnDefault.setBackground(Color.LIGHT_GRAY);
                    }
                }
                
                @Override
                public void mouseExited(MouseEvent e) {
                    if (!btnDefault.getBackground().equals(Color.orange)) {
                        btnDefault.setBackground(null);
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    btnDefault.setBackground(Color.orange);
                }
            }
            btnDefault.addMouseListener(new EventosMouse());
            btnDefault.addMouseMotionListener(new EventosMouse());
            this.add(btnDefault);
        }

        // Props TxfPantalla
        txfPantalla = new JTextField(100);
        this.add(txfPantalla);
        txfPantalla.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

// • Además se dispondrá de un JTextfield donde se mostrarán los números
// pulsados. Será no editable.
// • Si se pulsa una tecla que corresponda a un número también funcionará.
// • Finalmente se creará otro botón más de reset (este no es necesario que se
// haga en el bucle) mediante el cual se borra el textfield y se restaura el
// color
// de todos los botones.
