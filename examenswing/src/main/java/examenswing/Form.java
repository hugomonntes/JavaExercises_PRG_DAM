package examenswing;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;


public class Form extends JFrame implements ActionListener {
    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblDir;
    private JTextField txfNombre;
    private JTextField txfEdad;
    private JTextField txfDir;

    public Form(){
        //Props Ventana
        this.setLayout(null);

        //lblNombre
        lblNombre = new JLabel("Nombre");
        lblNombre.setSize(100, 30);
        lblNombre.setLocation(0, 0);
        this.add(lblNombre);

        //lblEdad
        lblEdad = new JLabel("Edad");
        lblEdad.setSize(100, 30);
        lblEdad.setLocation(0, 30);
        this.add(lblEdad);

        //lblDir
        lblDir = new JLabel("Dirección");
        lblDir.setSize(100, 30);
        lblDir.setLocation(0, 60);
        this.add(lblDir);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
