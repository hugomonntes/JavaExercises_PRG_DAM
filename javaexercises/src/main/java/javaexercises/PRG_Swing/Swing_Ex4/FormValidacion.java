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
        // Añadir Nombre textField
        txfNombre = new JTextField(10);
        this.add(txfNombre);
        txfNombre.setSize(100, 20);
        txfNombre.setLocation(0, 0);
        
        // Añadir Edad textField
        txfEdad = new JTextField(10);
        this.add(txfEdad);
        txfEdad.setSize(100, 20);
        txfEdad.setLocation(100, 0);
        
        // Añadir Direccion textField
        txfDir = new JTextField(10);
        this.add(txfDir);
        txfDir.setSize(100, 20);
        txfDir.setLocation(200, 0);
        
        // Añadir Boton Guardar
        btnGuardar = new JButton("Guardar");
        this.add(btnGuardar);
        btnGuardar.setSize(100, 20);
        btnGuardar.setLocation(300, 0);
        
        // Añadir Boton Cargar
        btnCargar = new JButton("Cargar");
        this.add(btnCargar);
        btnCargar.setSize(100, 20);
        btnCargar.setLocation(400, 0);
    }

    // public boolean validarDatosInput(String textoValidarNombre, String textoValidarEdad){
    //     String textoNombreFormateado = textoValidarNombre.trim();
    //     String textoValidarEdad = Integer.parseInt;
    //     if (!textoNombreFormateado.isEmpty() || ) {
    //         return true;
    //     }
        
    // }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

// 4. Haz una aplicación (layout null) que tenga 3 textfield con sus etiquetas
// correspondientes. Una para nombre (txfNombre), otra para edad (txfEdad) y una
// tercera para dirección (txfDir). Habrá dos botones: (ok)

// Guardar (btnGuardar): Si los datos del los textfield son válidos (no hay cadenas
// vacías y en edad hay un número positivo o 0) los guarda en un archivo. Si existe
// algún tipo de problema se informará con JOptionPane.showDialog() y un icono
// adecuado.

// Cargar (btnCargar): Si existe un archivo de datos, lo lee. Si en los texfield no hay
// nada coloca ahí los datos. Si hubiera algo en los textfield, pregunta al usuario con
// JOptionPane si está seguro que quiere cargarlos. Si no existe el archivo informa de
// ello al usuario con JOptionPane y no hace nada más.