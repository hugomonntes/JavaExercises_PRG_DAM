package javaexercises.PRG_Swing.Swing_Ex6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormOperaciones extends JFrame implements ActionListener{
    private JTextField txfUno;
    private JTextField txfDos;
    private JButton btnSuma;
    private JButton btnDiv;
    private JButton btnRaiz;

    public FormOperaciones(){
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

        // Añadir btnDiv
        btnDiv = new JButton("División");
        this.add(btnDiv);

        // Añadir btnRaiz
        btnRaiz = new JButton("Raíz");
        this.add(btnRaiz);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

/*
6. Formulario con 2 cajas de texto, una etiqueta y un botón de suma, otro de
división y otro de raíz cuadrada. Al pulsar un botón realizará la operación
correspondiente con las cajas de edición (la raíz actúa sólo sobre la primera) y
mostrará el resultado en la etiqueta anteponiendo un =. Si no son valores
numéricos, es una división entre 0 o la raíz es de un número negativo lo indicará en
la JLabel de resultado en color rojo (NO uses JOptionPane). Hazlo con FlowLayout.
Los resultados con 3 decimales en color negro.
Nota: Si quieres evitar problemas con comas o puntos decimales echa un vistazo al
apéndice 3 del tema.
*/