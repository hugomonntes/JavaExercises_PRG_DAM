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

public class FormSecundario extends JDialog implements ActionListener, ItemListener {
    private JComboBox<String> cbElementosUser;
    private JTextArea txaTamañoFile;

    public FormSecundario(FormPrincipal formPrincipal) {
        super(formPrincipal, true); // Modal
        this.setTitle("Form Secundario");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new FlowLayout());

        // File
        String directorioHome = System.getProperty("user.home");
        File filesUser = new File(directorioHome);
        String[] elementosUser = filesUser.list();
        long tamañoArchivo = filesUser.length();

        // Añadir cbElementoUser
        cbElementosUser = new JComboBox<>(elementosUser); // No me hace falta el foreach puedo pasarle como parametro
                                                          // del constructor la lista de elementos
        this.add(cbElementosUser);
        cbElementosUser.addActionListener(this);
        cbElementosUser.addItemListener(this);

        // Añadir txaTamañoFile
        txaTamañoFile = new JTextArea(20, 40);
        this.add(txaTamañoFile);
        txaTamañoFile.setText(tamañoArchivo + "");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            String selectedItem = (String) cbElementosUser.getSelectedItem();
            String directorioHome = System.getProperty("user.home");
            File selectedFile = new File(directorioHome, selectedItem);

            if (selectedFile.isFile()) {
                long tamañoArchivo = selectedFile.length();
                txaTamañoFile.setText(String.format("Tamaño del archivo: %d bytes", tamañoArchivo));
            } else if (selectedFile.isDirectory()) {
                File[] files = selectedFile.listFiles();
                String contenido = "";
                for (File f : files) {
                    if (f.isDirectory()) {
                        contenido += String.format("[DIR] %s \n", f.getName());
                    } else {
                        contenido += String.format("%s \n", f.getName());
                    }
                }
                txaTamañoFile.setText(contenido);
            }
        }
    }

}

// ◦ Al seleccionar un archivo en el combo se muestra en un textarea el
// tamaño del mismo.
// ◦ Al seleccionar un directorio en el combo se muestra en el textarea el
// contenido del mismo. Si es directorio se antepone [DIR] delante del
// nombre.
