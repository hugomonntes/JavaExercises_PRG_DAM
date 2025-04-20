package javaexercises.PRG_Swing.Swing_Ex2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FormUser extends JFrame {
    private JTextField textField;
    private JButton boton;

    public FormUser(){
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Añadir textField y propiedades
        textField = new JTextField("Introduce un texto");
        this.add(textField);
        textField.setSize(300, 50);
        textField.setLocation(100, 0);
        
        // Añadir boton y propiedades
        boton = new JButton("Enviar");
        this.add(boton);
        boton.setSize(100, 30);
        boton.setLocation(200, 50);
    }
}

/*
2. a) Realizar un pequeño programa que mediante un textfield pida un texto al
usuario. Tras eso, el usuario deberá pulsar un botón o pulsar Enter (ambos deben
funcionar) y se le preguntará mediante una JOptionPane con icono de Pregunta si el
usuario desea poner ese texto como título del formulario principal y si contesta que
sí, cambiar dicho título. El texto introducido debe repetirse en la JOptionPane
como parte del mensaje y entre comillas dobles. Hazlo con FlowLayout.
b) Añádele al formulario anterior un JCheckBox con el texto “Dar la vuelta” de
forma que si está marcado, al pulsar el botón o pulsar Enter nuevamente pregunta
si desea colocar el texto como título en el formulario principal pero al revés (Es
decir, si el usuario escribe Hola, el título sería aloH).
Un segundo Checkbox permite habilitar o deshabilitar el JtextField.
Ten en cuenta que no todos los componentes tienen evento asociado.
*/