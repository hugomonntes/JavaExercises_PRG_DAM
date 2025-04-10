package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Eventos2 extends JFrame implements ActionListener {
    // Declaración de los componentes
    JLabel etiqueta1;
    JButton btnIncremento;
    JButton btnDecremento;
    int contador;

    // Constructor
    public Eventos2() {
        super("Controlando eventos II");
        this.setLayout(new FlowLayout());
        contador = 0;
        // Botón Incremento
        btnIncremento = new JButton("Incremento");
        btnIncremento.addActionListener(this);
        this.add(btnIncremento);
        // Botón Decremento
        btnDecremento = new JButton("Decremento");
        btnDecremento.addActionListener(this);
        this.add(btnDecremento);
        // Etiqueta
        etiqueta1 = new JLabel(contador + "");
        this.add(etiqueta1);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == btnIncremento) { // getSource devuelve el evento que se esta ejecutando
            etiqueta1.setText(contador++ + "");
        } else {
            etiqueta1.setText(contador-- + "");
        }
        System.err.println("Pulsado");
        System.err.println(evento.getModifiers());
        System.err.println(Integer.toBinaryString(evento.getModifiers()));
    }
}
