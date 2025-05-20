package javaexercises.PRG_SwingAdv.SwingAdv_Ex1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FormSecundario extends JDialog {
    private JComboBox<String> cbElementosUser;
    private JTextArea txaTamañoFile;

    public FormSecundario(FormPrincipal formPrincipal){
        super(formPrincipal,true); // Modal si es true NO Modal con false
        this.setTitle("Form Secundario");
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());
    }
    
    private class VentanaSecundaria extends JFrame implements ActionListener, ItemListener{
        // File
        String directorioHome = System.getProperty("user.home");
        File filesUser = new File(directorioHome);
        String[] elementosUser = filesUser.list();
        long tamañoArchivo = filesUser.length();
    
        // Añadir cbElementoUser
        cbElementosUser = new JComboBox<>(elementosUser); // No me hace falta el foreach puedo pasarle como parametro del constructor la lista de elementos
        this.add(cbElementosUser);
        cbElementosUser.addActionListener(this);
        cbElementosUser.addItemListener(this);
        // for (String elemento : elementosUser) { // Es innecesario
        //     cbElementosUser.addItem(elemento);
        // }
    
        // Añadir txaTamañoFile
        txaTamañoFile = new JTextArea();
        this.add(txaTamañoFile);
        txaTamañoFile.setText(tamañoArchivo + "");
        
        @Override
        public void actionPerformed(ActionEvent e) {
            // txaTamañoFile.setText(cbElementosUser.getSelectedItem().toString().length() + "");        
        }
    
        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(e.getItem());
        }
    }
}

// ◦ Al seleccionar un archivo en el combo se muestra en un textarea el
// tamaño del mismo.
// ◦ Al seleccionar un directorio en el combo se muestra en el textarea el
// contenido del mismo. Si es directorio se antepone [DIR] delante del
// nombre.
