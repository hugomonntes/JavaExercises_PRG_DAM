package javaexercises.PRG_Swing.Swing_Ex1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SimulacionDado extends JFrame implements ActionListener{
    private JButton boton;
    private JLabel lblNumeroAleatorio;
    private JLabel mostrarError;
    private JTextField textField;

    public SimulacionDado(){
        this.setLayout(new FlowLayout());

        boton = new JButton("Tirar Dado");
        this.add(boton);
        boton.addActionListener(this);
        boton.setSize(100, 30);

        lblNumeroAleatorio = new JLabel("");
        this.add(lblNumeroAleatorio);

        mostrarError = new JLabel("");
        this.add(mostrarError);
        
        textField = new JTextField("Introduce un número", 10);
        this.add(textField);
        textField.setSize(100, 100);
        textField.setText("");

        this.setTitle("Simulación de Dado");
        this.setSize(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static String sacarNumeroAleatorio(String numberUser){
        try {
            if (Integer.parseInt(numberUser) <= 0 || Integer.parseInt(numberUser) > Integer.MAX_VALUE) {
                throw new NumberFormatException();
            } else {
                int numeroUserCasteado = Integer.parseInt(numberUser);
                if (numeroUserCasteado > 1) {
                    return "Resultado: " + (int)(Math.random() * numeroUserCasteado + 1);
                } else {
                    return "Resultado: " + (int)(Math.random() * 6 + 1); 
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error! Introduce un dato válido!");
        }
        return "";
    }

    public static boolean checkError(String numberUser){
        if (Integer.parseInt(numberUser) <= 0 || Integer.parseInt(numberUser) > Integer.MAX_VALUE) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String numberUser = textField.getText();
        lblNumeroAleatorio.setText(sacarNumeroAleatorio(numberUser));
        if (checkError(numberUser)) {
            mostrarError.setText("Error! Introduce un dato válido!");
        } else {
            mostrarError.setText("");
        }
    }
}

// b) Amplía el funcionamiento anterior mediante un JTextField en el cual el usuario
// pueda meter un número. Al pulsar el botón, se toma el valor de dicho JTextField y
// si este es mayor que 1 el dado será entre 1 y dicho valor. Si es cero o negativo o
// un dato no válido (no es número o es número excesivamente grande para int)
// sacará el resultado como si fuera un dado entre 1 y 6.