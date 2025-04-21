package javaexercises.PRG_Swing.Swing_Ex2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormUser extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton boton;
    private JOptionPane confirmTitle;
    private JCheckBox checkBoxReverse;
    private JCheckBox checkBoxTextField;

    public FormUser() {
        this.setTitle("Formulario User");
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Añadir CheckBox TextField
        checkBoxTextField = new JCheckBox("¿Quieres desplegar el cuadro de texto?");
        this.add(checkBoxTextField);
        this.setVisible(true);
        checkBoxTextField.addActionListener(this);

        // Añadir textField y propiedades
        textField = new JTextField("Introduce un titulo para el formulario");
        this.add(textField);
        textField.setSize(200, 50);
        textField.setLocation(100, 0);
        textField.addActionListener(this);

        // Añadir boton y propiedades
        boton = new JButton("Enviar");
        boton.addActionListener(this);
        this.add(boton);
        boton.setSize(100, 30);
        boton.setLocation(200, 50);

        // Añadir JoptionPane
        confirmTitle = new JOptionPane();

        // Añadir CheckBox Reversa
        checkBoxReverse = new JCheckBox("¿Quieres poner el título en reversa?");
        this.add(checkBoxReverse);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = textField.getText().trim();
        String inputTextReversa = "";
        if (checkBoxTextField.isSelected()) {
            textField.setVisible(true);
        } else {
            textField.setVisible(false);
        }
        
        if (!inputText.isEmpty()) { // En caso de que Curro no me deje, utilizar .length() a 0
            int respuestaJOption = confirmTitle.showConfirmDialog(this,
                    String.format("¿Quieres utilizar \"%s\" como título?", inputText),
                    "Confirmar título",
                    confirmTitle.YES_OPTION,
                    confirmTitle.QUESTION_MESSAGE);
            if (respuestaJOption == 0 && checkBoxReverse.isSelected()) {
                for (int i = inputText.length() - 1; i >= 0; i--) {
                    inputTextReversa += inputText.charAt(i);
                }
                this.setTitle(inputTextReversa);
            } else if (respuestaJOption == 0 && !checkBoxReverse.isSelected()) {
                this.setTitle(inputText);
            }
        } else {
            confirmTitle.showMessageDialog(this, "El título no puede estar vacío");
        }
    }
}

/*
 * 2. a) Realizar un pequeño programa que mediante un textfield pida un texto al
 * usuario. Tras eso, el usuario deberá pulsar un botón o pulsar Enter (ambos
 * deben
 * funcionar) y se le preguntará mediante una JOptionPane con icono de Pregunta
 * si el
 * usuario desea poner ese texto como título del formulario principal y si
 * contesta que
 * sí, cambiar dicho título. El texto introducido debe repetirse en la
 * JOptionPane
 * como parte del mensaje y entre comillas dobles. Hazlo con FlowLayout.
 * 
 * b) Añádele al formulario anterior un JCheckBox con el texto “Dar la vuelta”
 * de
 * forma que si está marcado, al pulsar el botón o pulsar Enter nuevamente
 * pregunta
 * si desea colocar el texto como título en el formulario principal pero al
 * revés (Es
 * decir, si el usuario escribe Hola, el título sería aloH).
 * Un segundo Checkbox permite habilitar o deshabilitar el JtextField.
 * Ten en cuenta que no todos los componentes tienen evento asociado.
 */