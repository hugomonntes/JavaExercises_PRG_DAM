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
    private JTextField textField;

    public SimulacionDado(){
        this.setLayout(new FlowLayout());

        boton = new JButton("Tirar Dado");
        this.add(boton);
        boton.addActionListener(this);

        lblNumeroAleatorio = new JLabel("");
        this.add(lblNumeroAleatorio);
        
        textField = new JTextField("Introduce un número", 10);
        this.add(textField);
        textField.setText("");
        textField.addActionListener(this); // Boton de acción predeterminado de un textField es el Enter
    }

    public String sacarNumeroAleatorio(String numberUser){
        try {
            int numeroUserCasteado = Integer.parseInt(numberUser);
            if (numeroUserCasteado <= 1) {
                throw new NumberFormatException();
            } else {
                return String.format("Resultado: %d", (int)(Math.random()*numeroUserCasteado) + 1);
            }
        } catch (NumberFormatException e) {
            System.err.println("Introduce un dato válido");
        }
        return String.format("Resultado: %d", (int)(Math.random()*6) + 1); 
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        lblNumeroAleatorio.setText(sacarNumeroAleatorio(textField.getText()));
    }
}

// b) Amplía el funcionamiento anterior mediante un JTextField en el cual el usuario
// pueda meter un número. Al pulsar el botón, se toma el valor de dicho JTextField y
// si este es mayor que 1 el dado será entre 1 y dicho valor. Si es cero o negativo o
// un dato no válido (no es número o es número excesivamente grande para int)
// sacará el resultado como si fuera un dado entre 1 y 6.