package javaexercises.PRG_Swing.Swing_Ex7;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FormColors extends JFrame implements ActionListener{
    private JTextField txfR;
    private JTextField txfG;
    private JTextField txfB;
    private JTextField txfImg;
    private JButton btnColor;

    public FormColors(){
        // Propiedades ventana
        super("Formulario Colores");
        this.setLayout(new FlowLayout());

        // Añadir txfR
        txfR = new JTextField(10);
        this.add(txfR);

        // Añadir txfG
        txfG = new JTextField(10);
        this.add(txfG);

        // Añadir txfB
        txfB = new JTextField(10);
        this.add(txfB);

        // Añadir txfImg
        txfImg = new JTextField(10);
        this.add(txfImg);

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
        if (((e.getModifiers() & e.CTRL_MASK) == e.getModifiers())) { // FIXME
            this.setBackground(Color.BLUE);
        }
        
        if (validarDatosInput(txfR.getText()) && validarDatosInput(txfG.getText()) && validarDatosInput(txfB.getText())) {
            int colorTxfR = Integer.parseInt(txfR.getText());
            int colorTxfG = Integer.parseInt(txfG.getText());
            int colorTxfB = Integer.parseInt(txfB.getText());
            btnColor.setBackground(new Color(colorTxfR, colorTxfG, colorTxfB));
        }
    }
    
}

// En un formulario se colocan 3 textfield y un botón Color. En dichas textfield se
// puede meter números RGB (0-255) en cada una y al pulsar el botón se cambia el
// color del fondo del botón. Si al mismo tiempo que se produce el evento se está
// pulsando la tecla CTRL, en lugar del color de fondo se cambia el del texto. También
// cambiará si se pulsa ENTER en la tercera caja de texto (la referida al azul, en este
// caso no tendrá efecto el CTRL).

// Habrá otro textfield (de mayor tamaño) en el que se permite escribir el path
// completo de una imagen, esta se cargará al pulsar Enter y se mostrará en otra
// etiqueta (la trayectoria se le puede pasar directamente al constructor de ImageIcon
// sin necesidad de getResource).
// Introduce ToolTips en los botones y cajas de texto. Usa FlowLayout.
