package javaexercises.PRG_Swing.Swing_Ex4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormValidacion extends JFrame implements ActionListener {
    private JTextField txfNombre;
    private JTextField txfEdad;
    private JTextField txfDir;
    private JButton btnGuardar;
    private JButton btnCargar;

    public FormValidacion() {
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
        btnGuardar.addActionListener(this);

        // Añadir Boton Cargar
        btnCargar = new JButton("Cargar");
        this.add(btnCargar);
        btnCargar.setSize(100, 20);
        btnCargar.setLocation(400, 0);
        // btnCargar.addActionListener(this);
    }

    public boolean validarDatosInput(String textoValidarNombre, String textoValidarEdad) {
        String textoNombreFormateado = textoValidarNombre.trim();
        try {
            int textoEdadFormateado = Integer.parseInt(textoValidarEdad.trim());
            if (textoEdadFormateado <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, String.format("Error! Introduce un número positivo"), "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return !textoNombreFormateado.isEmpty() ? true : false;
    }

    @SuppressWarnings("resource")
    public void escribirArchivo(String textoEscribirEnArchivo) throws IOException {
        FileWriter fw = new FileWriter("SwingEx4.txt");
        fw.write(textoEscribirEnArchivo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean isChecked = validarDatosInput(txfNombre.getText(), txfEdad.getText());
        String texto;
        if (isChecked) {
            texto = String.format("%s , %s", txfNombre.getText(), txfEdad.getText());
            try {
                escribirArchivo(texto);
                System.err.println(texto);
            } catch (IOException e1) {

            }
        }
    }
}

// 4. Haz una aplicación (layout null) que tenga 3 textfield con sus etiquetas
// correspondientes. Una para nombre (txfNombre), otra para edad (txfEdad) y una
// tercera para dirección (txfDir). Habrá dos botones: (ok)

// Guardar (btnGuardar): Si los datos del los textfield son válidos (no hay
// cadenas
// vacías y en edad hay un número positivo o 0) los guarda en un archivo. Si
// existe
// algún tipo de problema se informará con JOptionPane.showDialog() y un icono
// adecuado. (ok)

// Cargar (btnCargar): Si existe un archivo de datos, lo lee. Si en los texfield
// no hay
// nada coloca ahí los datos. Si hubiera algo en los textfield, pregunta al
// usuario con
// JOptionPane si está seguro que quiere cargarlos. Si no existe el archivo
// informa de
// ello al usuario con JOptionPane y no hace nada más.