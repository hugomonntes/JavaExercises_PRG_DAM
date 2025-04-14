package javaexercises.PRG_Swing.Swing_Ex1;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulacionDado extends JFrame implements ActionListener{
    private JButton boton;
    private JLabel lblNumeroAleatorio;

    public SimulacionDado(){
        this.setLayout(new FlowLayout());
        boton = new JButton("Tirar Dado");
        this.add(boton);
        boton.addActionListener(this);
        boton.setSize(100, 30);

        lblNumeroAleatorio = new JLabel("");
        this.add(lblNumeroAleatorio);
        
        this.setTitle("Simulación de Dado");
        this.setSize(100, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static String sacarNumeroAleatorio(){
        return "Resultado: " + (int)(Math.random() * 6 + 1);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        lblNumeroAleatorio.setText(sacarNumeroAleatorio());
    }
}

// 1. a) Realiza una pequeña aplicación en Swing que simule un dado. Para ello debe
// tener un botón y una etiqueta. Al pulsar el botón debe salir en la etiqueta un
// número entre 1 y 6. Hazlo con FlowLayout.
// b) Amplía el funcionamiento anterior mediante un JTextField en el cual el usuario
// pueda meter un número. Al pulsar el botón, se toma el valor de dicho JTextField y
// si este es mayor que 1 el dado será entre 1 y dicho valor. Si es cero o negativo o
// un dato no válido (no es número o es número excesivamente grande para int)
// sacará el resultado como si fuera un dado entre 1 y 6.