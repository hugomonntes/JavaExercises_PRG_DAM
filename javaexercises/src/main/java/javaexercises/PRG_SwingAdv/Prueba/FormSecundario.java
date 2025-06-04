package javaexercises.PRG_SwingAdv.Prueba;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class FormSecundario extends JDialog implements ItemListener {
    private JRadioButton rbNegro;
    private JRadioButton rbBlanco;
    private ButtonGroup grupoColores;
    private FormPrincipal formPrincipal;
    
    public FormSecundario(FormPrincipal form){
        super(form,true);
        this.formPrincipal = form;
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        rbNegro = new JRadioButton("Negro");
        rbNegro.setSelected(true);
        rbNegro.addItemListener(this);
        this.add(rbNegro);

        rbBlanco = new JRadioButton("Blanco");
        rbBlanco.addItemListener(this);
        this.add(rbBlanco);

        grupoColores = new ButtonGroup();
        grupoColores.add(rbBlanco);
        grupoColores.add(rbNegro);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (rbNegro.isSelected()) {
            formPrincipal.getContentPane().setBackground(Color.BLACK);
        } 
        if (rbBlanco.isSelected()) {
            formPrincipal.getContentPane().setBackground(Color.WHITE);
        }
    }
}
