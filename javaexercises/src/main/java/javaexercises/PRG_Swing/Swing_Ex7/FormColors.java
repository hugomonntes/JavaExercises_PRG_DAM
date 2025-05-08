package javaexercises.PRG_Swing.Swing_Ex7;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FormColors extends JFrame implements ActionListener{
    private JTextField txfUno;
    private JTextField txfDos;
    private JTextField txfTres;
    private JButton btnColor;

    public FormColors(){
        // Propiedades ventana
        super("Formulario Colores");
        this.setLayout(new FlowLayout());

        // Añadir txfUno
        txfUno = new JTextField(10);
        this.add(txfUno);

        // Añadir txfDos
        txfDos = new JTextField(10);
        this.add(txfDos);

        // Añadir txfTres
        txfTres = new JTextField(10);
        this.add(txfTres);

        // Añadir btnColor
        btnColor = new JButton("Color");
        this.add(btnColor);
        btnColor.addActionListener(this);
    }

    public boolean validarDatosInput(String datosValidar){
        try {
            int numeroRGB = Integer.parseInt(datosValidar);
            if (numeroRGB >= 0 && numeroRGB <= 255) {
                return true;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error");
            return false;
        }
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        validarDatosInput(txfUno.getText());
        validarDatosInput(txfDos.getText());
        validarDatosInput(txfTres.getText());
    }
    
}
