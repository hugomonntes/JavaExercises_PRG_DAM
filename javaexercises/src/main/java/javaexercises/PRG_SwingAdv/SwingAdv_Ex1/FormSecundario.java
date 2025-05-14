package javaexercises.PRG_SwingAdv.SwingAdv_Ex1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FormSecundario extends JFrame implements ActionListener{
    private JComboBox<String> cbElementosUser;
    private JTextArea txaTamañoFile;

    public FormSecundario(){
        this.setTitle("Form Secundario");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // File
        String directorioHome = System.getProperty("user.home");
        File filesUser = new File(directorioHome);
        String[] elementosUser = filesUser.list();

        // Añadir cbElementoUser
        cbElementosUser = new JComboBox<>(); // No me hace falta el foreach puedo pasarle como parametro del constructor la lista de elementos
        this.add(cbElementosUser);
        for (String elemento : elementosUser) { // Es innecesario
            cbElementosUser.addItem(elemento);
        }
        cbElementosUser.addActionListener(this);

        // Añadir txaTamañoFile
        txaTamañoFile = new JTextArea();
        this.add(txaTamañoFile);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        txaTamañoFile.setText(cbElementosUser.getSelectedItem().toString().length() + "");
    }
}

// ◦ Al seleccionar un archivo en el combo se muestra en un textarea el
// tamaño del mismo.
// ◦ Al seleccionar un directorio en el combo se muestra en el textarea el
// contenido del mismo. Si es directorio se antepone [DIR] delante del
// nombre.
