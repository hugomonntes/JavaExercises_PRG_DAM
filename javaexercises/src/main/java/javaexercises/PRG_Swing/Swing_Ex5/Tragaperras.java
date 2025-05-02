package javaexercises.PRG_Swing.Swing_Ex5;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class Tragaperras extends JFrame implements ActionListener {
    private JTextField txfUno; 
    private JTextField txfDos; 
    private JTextField txfTres;
    private JButton btnTirada;
    private JLabel lblSaldo;
    int saldo = 20;

    public Tragaperras() {
        this.setTitle("Tragaperras v1");
        this.setLayout(new FlowLayout());

        // Añadir txfUno
        txfUno = new JTextField(5);
        this.add(txfUno);
        txfUno.setEnabled(false);

        // Añadir txfDos
        txfDos = new JTextField(5);
        this.add(txfDos);
        txfDos.setEnabled(false);

        // Añadir txfTres
        txfTres = new JTextField(5);
        this.add(txfTres);
        txfTres.setEnabled(false);

        // Añadir Boton
        btnTirada = new JButton("Lanzar Tirada");
        this.add(btnTirada);
        btnTirada.addActionListener(this);

        // Añadir saldo
        lblSaldo = new JLabel("Saldo disponible: 20€");
        this.add(lblSaldo);
    }

    public String createRamdonNumber(){
        return String.format("%d", (int)(Math.random() * 9) + 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        txfUno.setText(createRamdonNumber());
        txfDos.setText(createRamdonNumber());
        txfTres.setText(createRamdonNumber());

        if (txfUno.getText().equals(txfDos.getText()) && txfUno.getText().equals(txfTres.getText())) {
            saldo = saldo * 2;
            JOptionPane.showMessageDialog(this, String.format("Enhorabuena! Has ganado el premio! Saldo actual de: %d€", saldo));
            lblSaldo.setText(String.format("Saldo disponible: %d€", saldo));
        } else if (!(txfUno.getText().equals(txfDos.getText()) && txfUno.getText().equals(txfTres.getText()))) {
            saldo--;
            lblSaldo.setText(String.format("Saldo disponible: %d€", saldo));
            if (saldo == 0) {
                JOptionPane.showMessageDialog(this, String.format("Has perdido! Saldo actual de: %d€", saldo));
                this.dispose(); // Con esto cierro la ventana
            }
        }

    }
}
