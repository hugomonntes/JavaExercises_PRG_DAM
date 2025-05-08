package javaswingadv;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal extends JFrame implements ActionListener {
    JButton btn;
    JLabel lblNombre;
    JTextField txtNombre;

    public Principal() {
        super("Ventana principal");
        setLayout(new FlowLayout());
        lblNombre = new JLabel("Nombre");
        add(lblNombre);
        txtNombre = new JTextField(9);
        add(txtNombre);
        btn = new JButton("Información");
        btn.addActionListener(this);
        add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        Secundario f = new Secundario(this);
        f.lblInfo.setText("<html><b>Fecha: "
                + (new Date())
                + "<br>Usuario: <b><i>"
                + txtNombre.getText() + "</i></b></html>");
        f.pack(); // Tamaño necesario para ver todos los componentes
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setVisible(true);
    }

}
