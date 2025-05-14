package javaexercises.PRG_SwingAdv.SwingAdv_Ex1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseControl extends JFrame implements ActionListener {
    private JButton btnUno;
    private JButton btnDos;
    private JLabel lblTeclas;

    public MouseControl() {
        this.setTitle("Control de Ratón");
        this.setLayout(new FlowLayout());

        // Añadir btnUno
        btnUno = new JButton("Boton 1");
        this.add(btnUno);

        // Añadir btnDos
        btnDos = new JButton("Boton 2");
        this.add(btnDos);

        // Añadir lblTeclas
        lblTeclas = new JLabel("Teclas");
        lblTeclas.addMouseMotionListener(new EventosMouse());
        this.add(lblTeclas);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    private class EventosMouse extends MouseAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            lblTeclas.setText(String.format("CoordenadasX: %d, CoordenadasY: %d", e.getX(), e.getY()));
            MouseControl.this.setTitle(String.format("CoordenadasX: %d, CoordenadasY: %d", e.getX(), e.getY()));
        }
    }
}

// 1. En un formulario con el título “Control de Ratón” coloca dos botones y una
// label
// con el texto “Teclas”. Actuará de la siguiente forma:
// • Cada vez que el ratón esté dentro del formulario se debe indicar la
// coordenada añadida al título (P. ej. “Control de ratón – (X:100, Y:200)”.
// También lo realizará aunque esté encima de los botones. El (0,0) será la
// esquina superior izquierda del ContentPane (No del JFrame)
// • Cuando el puntero esté fuera del formulario se reestablecerá el título sin
// coordenadas.