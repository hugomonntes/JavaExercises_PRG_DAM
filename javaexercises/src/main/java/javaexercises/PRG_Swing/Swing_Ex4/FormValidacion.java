package javaexercises.PRG_Swing.Swing_Ex4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FormValidacion extends JFrame implements ActionListener{
    private JTextField txfNombre;
    private JTextField txfEdad;
    private JTextField txfDir;
    private JButton btnGuardar;
    private JButton btnCargar;

    public FormValidacion(){
        // Interfaz
        this.setTitle("Formulario Colores");
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Añadir Nombre textField
        txfNombre = new JTextField();
        this.add(txfNombre);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}

// 4. Haz una aplicación (layout null) que tenga 3 textfield con sus etiquetas
// correspondientes. Una para nombre (txfNombre), otra para edad (txfEdad) y una
// tercera para dirección (txfDir). Habrá dos botones:
// Guardar (btnGuardar): Si los datos del los textfield son válidos (no hay cadenas
// vacías y en edad hay un número positivo o 0) los guarda en un archivo. Si existe
// algún tipo de problema se informará con JOptionPane.showDialog() y un icono
// adecuado.

// Cargar (btnCargar): Si existe un archivo de datos, lo lee. Si en los texfield no hay
// nada coloca ahí los datos. Si hubiera algo en los textfield, pregunta al usuario con
// JOptionPane si está seguro que quiere cargarlos. Si no existe el archivo informa de
// ello al usuario con JOptionPane y no hace nada más.