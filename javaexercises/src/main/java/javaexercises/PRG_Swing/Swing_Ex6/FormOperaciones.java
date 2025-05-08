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

        // Añadir txfUno
        txfUno = new JTextField(10);
        this.add(txfUno);

        // Añadir txfDos
        txfDos = new JTextField(10);
        this.add(txfDos);

        // Añadir btnSuma
        btnSuma = new JButton("Suma");
        this.add(btnSuma);
        btnSuma.addActionListener(this);

        // Añadir btnDiv
        btnDiv = new JButton("División");
        this.add(btnDiv);
        btnDiv.addActionListener(this);

        // Añadir btnRaiz
        btnRaiz = new JButton("Raíz");
        this.add(btnRaiz);
        btnRaiz.addActionListener(this);

        // Añadir lblResultado
        lblResultado = new JLabel();
        this.add(lblResultado);
    }

    public double isDataVerified(String dataToVerified) {
        return Double.parseDouble(dataToVerified);
    }

    public double calculateSum(double numberInput1, double numberInput2) {
        return numberInput1 + numberInput2;
    }

    public double calculateDiv(double numberInput1, double numberInput2) {
        return numberInput1 / numberInput2;
    }

    public double calculateRaiz(double numberInput1) {
        return Math.sqrt(numberInput1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == btnSuma) {
                lblResultado.setText(String.format("Resultado: %.2f",
                        calculateSum(isDataVerified(txfUno.getText()), isDataVerified(txfDos.getText()))));
            }
            if (e.getSource() == btnDiv) {
                lblResultado.setText(String.format("Resultado: %.2f",
                        calculateDiv(isDataVerified(txfUno.getText()), isDataVerified(txfDos.getText()))));
            }
            if (e.getSource() == btnRaiz && isDataVerified(txfUno.getText()) > 0) { // FIXME RAIZ DE NUMEROS NEGATIVOS
                lblResultado.setText(String.format("Resultado = %.2f",
                        calculateRaiz(isDataVerified(txfUno.getText()))));
            } else if (e.getSource() == btnRaiz && isDataVerified(txfUno.getText()) < 0) {
                lblResultado.setText("Error! Introduce datos numéricos positivos");
                lblResultado.setForeground(Color.RED);
            }
        } catch (NumberFormatException e1) {
            lblResultado.setText("Error! Introduce datos numéricos");
            lblResultado.setForeground(Color.RED);
        }
    }
}

/*
 * 6. Formulario con 2 cajas de texto, una etiqueta y un botón de suma, otro de
 * división y otro de raíz cuadrada. Al pulsar un botón realizará la operación
 * correspondiente con las cajas de edición (la raíz actúa sólo sobre la
 * primera) y
 * mostrará el resultado en la etiqueta anteponiendo un =. Si no son valores
 * numéricos, es una división entre 0 o la raíz es de un número negativo lo
 * indicará en
 * la JLabel de resultado en color rojo (NO uses JOptionPane). Hazlo con
 * FlowLayout.
 * Los resultados con 3 decimales en color negro.
 * Nota: Si quieres evitar problemas con comas o puntos decimales echa un
 * vistazo al
 * apéndice 3 del tema.
 */