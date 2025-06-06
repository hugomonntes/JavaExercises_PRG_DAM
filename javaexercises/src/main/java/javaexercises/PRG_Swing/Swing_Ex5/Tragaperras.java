package javaexercises.PRG_Swing.Swing_Ex5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Tragaperras extends JFrame implements ActionListener {  
                                                                    // etiqueta perder y ganar
    private JTextField txfUno;
    private JTextField txfDos;
    private JTextField txfTres;
    private JButton btnTirada;
    private JLabel lblSaldo;
    private JLabel lblPremio;
    private Timer timer;
    private JLabel lblTimer;
    int countMin = 0;
    int countSec = 56;
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

        // Añadir lblPremio
        lblPremio = new JLabel("Premio: ");
        this.add(lblPremio);

        // Añadir saldo
        lblSaldo = new JLabel("Saldo disponible: 20€");
        this.add(lblSaldo);

        // Añadir Timer
        timer = new Timer(1000, this);
        timer.start();

        // Añadir etiqueta timer
        lblTimer = new JLabel();
        this.add(lblTimer);
    }

    public String createRamdonNumber() {
        return String.format("%d", (int) (Math.random() * 3) + 1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTirada) {
            txfUno.setText(createRamdonNumber());
            txfDos.setText(createRamdonNumber());
            txfTres.setText(createRamdonNumber());

            if (txfUno.getText().equals(txfDos.getText()) && txfUno.getText().equals(txfTres.getText())) {
                saldo = saldo * 2;
                lblPremio.setText("Enhorabuena! Has ganado el premio!");
                // JOptionPane.showMessageDialog(this, String.format("Enhorabuena! Has ganado el
                // premio! Saldo actual de: %d€", saldo));
                // lblSaldo.setText(String.format("Saldo disponible: %d€", saldo));
            } else {
                saldo--;
                lblSaldo.setText(String.format("Saldo disponible: %d€", saldo));
                lblPremio.setText("Has perdido!");
                if (saldo == 0) {
                    // JOptionPane.showMessageDialog(this, String.format("Has perdido! Saldo actual de: %d€", saldo));
                    this.dispose(); // Cierro la ventana si el saldo es 0 (No está en la especificación)
                }
            }
        }

        if (e.getSource() == timer) {
            lblTimer.setText(String.format("%02d:%02d", countMin, countSec));
            countSec++;
            if (countSec == 60) {
                countMin++;
                countSec = 0;
            }
        }

    }
}
