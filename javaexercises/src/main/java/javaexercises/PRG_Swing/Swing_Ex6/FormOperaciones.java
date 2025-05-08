package javaexercises.PRG_Swing.Swing_Ex6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormOperaciones extends JFrame implements ActionListener {
    private JTextField txfUno;
    private JTextField txfDos;
    private JButton btnSuma;
    private JButton btnDiv;
    private JButton btnRaiz;
    private JLabel lblResultado;

    public FormOperaciones() {
        this.setTitle("Formulario Operaciones");
        this.setLayout(new FlowLayout());

        txfUno = new JTextField(10);
        this.add(txfUno);

        txfDos = new JTextField(10);
        this.add(txfDos);

        btnSuma = new JButton("Suma");
        btnSuma.addActionListener(this);
        this.add(btnSuma);

        btnDiv = new JButton("División");
        btnDiv.addActionListener(this);
        this.add(btnDiv);

        btnRaiz = new JButton("Raíz");
        btnRaiz.addActionListener(this);
        this.add(btnRaiz);

        lblResultado = new JLabel();
        this.add(lblResultado);

        this.setSize(300, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public double parseInput(String input) throws NumberFormatException { // Apéndice III
        return Double.parseDouble(input.trim().replace(",", "."));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double number1 = parseInput(txfUno.getText());
            double number2 = parseInput(txfDos.getText());

            if (e.getSource() == btnSuma) {
                double resultSuma = number1 + number2;
                lblResultado.setText(String.format("= %.3f", resultSuma));
                lblResultado.setForeground(Color.BLACK);
            } else if (e.getSource() == btnDiv) {
                if (number2 == 0) {
                    lblResultado.setText("Error! División entre 0");
                    lblResultado.setForeground(Color.RED);
                } else {
                    double result = number1 / number2;
                    lblResultado.setText(String.format("= %.3f", result));
                    lblResultado.setForeground(Color.BLACK);
                }
            } else if (e.getSource() == btnRaiz) {
                if (number1 < 0) {
                    lblResultado.setText("Error! Raíz de número negativo");
                    lblResultado.setForeground(Color.RED);
                } else {
                    double result = Math.sqrt(number1);
                    lblResultado.setText(String.format("= %.3f", result));
                    lblResultado.setForeground(Color.BLACK);
                }
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Error! Introduce datos numéricos");
            lblResultado.setForeground(Color.RED);
        }
    }
}
