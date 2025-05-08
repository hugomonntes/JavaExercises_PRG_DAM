package javaswingadv;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class EventosKeyBoard extends JFrame implements KeyListener {
    JLabel lbl, lbl2;

    public EventosKeyBoard() {
        super("Eventos de teclado");
        setLayout(null);
        setFocusable(true);
        lbl = new JLabel("Tecla Pulsada: Ninguna");
        lbl.setSize(lbl.getPreferredSize().width,
                lbl.getPreferredSize().height);
        lbl.setLocation(10, 10);
        add(lbl);
        lbl2 = new JLabel("Letra Seleccionada: Ninguna");
        lbl2.setSize(lbl2.getPreferredSize().width,
                lbl2.getPreferredSize().height);
        lbl2.setLocation(10, 40);
        add(lbl2);
        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) { // Pulsación de tecla (Usa KeyCode)
        lbl.setText("Tecla Pulsada: " + e.getKeyCode());
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            lbl2.setLocation(lbl2.getX() - 5, lbl2.getY());
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            lbl2.setLocation(lbl2.getX() + 5, lbl2.getY());
        }
        if (e.isControlDown() && e.isShiftDown()) {
            System.err.println("Además estás pulsando CTRL y SHIFT");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { // Soltar una tecla pulsada (Usa KeyCode)
        lbl.setText("Tecla Liberada: "+e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) { // Character de tecla
        lbl2.setText("Letra Seleccionada: "+e.getKeyChar());
    }
}
