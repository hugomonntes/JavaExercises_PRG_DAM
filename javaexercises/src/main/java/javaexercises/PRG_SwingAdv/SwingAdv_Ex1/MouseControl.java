package javaexercises.PRG_SwingAdv.SwingAdv_Ex1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseControl extends JFrame {//TODO revisa pulsaciones contones ratón. Evento teclado en todos los comp.
    //TODO secundario modal. Gestionar textarea en secundario.
    private JButton btnIzq;
    private JButton btnDer;
    private JLabel lblTeclas;
    public String titleForm = "Control de Ratón";

    public MouseControl() {
        this.setTitle(titleForm);
        this.setLayout(new FlowLayout());
        this.getContentPane().addMouseMotionListener(new EventosMouse());
        this.getContentPane().addMouseListener(new EventosMouse());
        this.addKeyListener(new EventosTeclado());
        this.setFocusable(true);

        // Añadir btnUno
        btnIzq = new JButton("Izquierdo");
        this.add(btnIzq);
        btnIzq.addMouseListener(new EventosMouse());
        btnIzq.addMouseMotionListener(new EventosMouse());
        btnIzq.addKeyListener(new EventosTeclado());

        // Añadir btnDos
        btnDer = new JButton("Derecho");
        this.add(btnDer);
        btnDer.addMouseListener(new EventosMouse());
        btnDer.addMouseMotionListener(new EventosMouse());
        btnDer.addKeyListener(new EventosTeclado());

        // Añadir lblTeclas
        lblTeclas = new JLabel("Teclas");
        this.add(lblTeclas);
    }

    private class EventosMouse extends MouseAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {//TODO detectar si estoy en form o botones
            lblTeclas.setText(String.format("CoordenadasX: %d, CoordenadasY: %d", e.getX() + btnDer.getX(), e.getY() + btnDer.getY()));
            MouseControl.this.setTitle(String.format("CoordenadasX: %d, CoordenadasY: %d", e.getX() + btnDer.getX(), e.getY() + btnDer.getY()));
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
            btnIzq.setBackground(null);
            btnDer.setBackground(null);
        }

    }

    private class EventosTeclado extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            lblTeclas.setText(String.format("Tecla: %s, Unicode: %d", e.getKeyChar(), e.getKeyCode()));
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_C) {
                FormSecundario formSecundario = new FormSecundario();
            }
        }
    }
}

// ◦ Tiene un combo donde aparecen en cada línea un elemento del directorio
// de usuario.
// ◦ Al seleccionar un archivo en el combo se muestra en un textarea el
// tamaño del mismo.
// ◦ Al seleccionar un directorio en el combo se muestra en el textarea el
// contenido del mismo. Si es directorio se antepone [DIR] delante del
// nombre.