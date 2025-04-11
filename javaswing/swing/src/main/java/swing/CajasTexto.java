package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CajasTexto extends JFrame implements ActionListener {
    JLabel lblDni;
    JLabel lblNombre;
    JTextField txtDni;
    JTextField txtNombre;
    JTextField txtInfo;

    public CajasTexto() {
        super("Cajas de edición de texto");
        this.setLayout(new FlowLayout());
        lblDni = new JLabel("Introduzca su DNI");
        add(lblDni);
        txtDni = new JTextField(9);
        txtDni.addActionListener(this);
        add(txtDni);
        txtNombre = new JTextField("Escriba aquí su nombre");
        txtNombre.addActionListener(this);
        add(txtNombre);
        txtInfo = new JTextField("Información no editable", 23);
        txtInfo.setEditable(false);
        txtInfo.addActionListener(this);
        add(txtInfo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == txtDni || e.getSource() == txtInfo) {
            ((JTextField) e.getSource()).selectAll();
        }
        JOptionPane.showMessageDialog(null,
                ((JTextField) e.getSource()).getSelectedText(),
                "Cajas de Texto", JOptionPane.INFORMATION_MESSAGE);
    }
}
