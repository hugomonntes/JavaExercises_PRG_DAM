package javaexercises.PRG_SwingAdv.SwingAdv_Ex1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseControl extends JFrame {
    private JButton btnIzq;
    private JButton btnDer;
    private JLabel lblTeclas;
    public String titleForm = "Control de Ratón";

    public MouseControl() {
        this.setTitle(titleForm);
        this.setLayout(new FlowLayout());
        this.getContentPane().addMouseMotionListener(new EventosMouse());
        this.getContentPane().addMouseListener(new EventosMouse());

        // Añadir btnUno
        btnIzq = new JButton("Izquierdo");
        this.add(btnIzq);

        // Añadir btnDos
        btnDer = new JButton("Derecho");
        this.add(btnDer);

        // Añadir lblTeclas
        lblTeclas = new JLabel("Teclas");
        this.add(lblTeclas);
    }

    private class EventosMouse extends MouseAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            lblTeclas.setText(String.format("CoordenadasX: %d, CoordenadasY: %d", e.getX(), e.getY()));
            MouseControl.this.setTitle(String.format("CoordenadasX: %d, CoordenadasY: %d", e.getX(), e.getY()));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            MouseControl.this.setTitle(titleForm);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK) {
                btnIzq.setBackground(Color.RED);
            } else if (e.getModifiersEx() == InputEvent.BUTTON3_DOWN_MASK) {
                btnDer.setBackground(Color.BLUE);
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK) {
                btnIzq.setBackground(null);
            } else if (e.getModifiersEx() == InputEvent.BUTTON3_DOWN_MASK) {
                btnDer.setBackground(null);
            }
        }
    }
}

// • Al pulsar una tecla se mostrará en la label tanto la letra Unicode pulsada
// como su código de teclado.
// • Si se pulsa la combinación de teclas CTRL+C se abrirá un formulario
// secundario modal (Puede ser FlowLayout) con las siguientes características:
// ◦ Tiene un combo donde aparecen en cada línea un elemento del directorio
// de usuario.
// ◦ Al seleccionar un archivo en el combo se muestra en un textarea el
// tamaño del mismo.
// ◦ Al seleccionar un directorio en el combo se muestra en el textarea el
// contenido del mismo. Si es directorio se antepone [DIR] delante del
// nombre.