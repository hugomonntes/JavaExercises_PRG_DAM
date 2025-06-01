package javaexercises.PRG_SwingAdv.Prueba;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormPrincipal extends JFrame implements ActionListener{
    private JTextField txf;
    private JButton btn;
    private JComboBox jc;
    private JLabel lbl;
    private String[] nombres = new String[]{"Hugo", "Fukin", "AAAA"};

    public FormPrincipal(){
        this.setLayout(new FlowLayout());
        this.getContentPane().addMouseMotionListener(new EventosMouse());
        this.getContentPane().addMouseListener(new EventosMouse());
        this.addKeyListener(new EventosTeclado());
        
        //txf
        txf = new JTextField(20);
        this.add(txf);
        txf.addKeyListener(new EventosTeclado());

        //btn
        btn = new JButton("Enviar");
        this.add(btn);
        btn.addActionListener(this);
        btn.addKeyListener(new EventosTeclado());

        //jc
        jc = new JComboBox<>(nombres);
        this.add(jc);
        jc.addActionListener(this);
        jc.addKeyListener(new EventosTeclado());

        //lbl
        lbl = new JLabel();
        this.add(lbl);
        lbl.addKeyListener(new EventosTeclado());
    }

    public String[] recopilarTexto(){
        return txf.getText().split(" ");
    }

    public void escribirArchivo() throws IOException{
        FileWriter fw = new FileWriter("Hola.txt");
        String[] texto = recopilarTexto();
        for (String palabra : texto) {
            fw.write(palabra + "\n");
        }
        fw.close();
    }
    
    File archivo;
    public String leerArchivo() throws FileNotFoundException{
        archivo = new File("Hola.txt");
        Scanner sc = new Scanner(archivo);
        String cadenaFinal = "";
        while (sc.hasNext()) {
            String cadenaCompleta = sc.nextLine();
            cadenaFinal += cadenaCompleta;
        }
        sc.close();
        return cadenaFinal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            escribirArchivo();
        } catch (IOException e1) {
        }

        if (e.getSource() == jc) {
            if (jc.getSelectedItem().equals("Hugo")) {
                this.getContentPane().setBackground(Color.CYAN);
            } else {
                this.getContentPane().setBackground(null);
            }
        }

        try {
            lbl.setText(leerArchivo());
        } catch (FileNotFoundException e1) {
        }
    }

    public class EventosMouse extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
                System.out.println("Hola");
            }
        }
    }

    public class EventosTeclado extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_B) {
                FormPrincipal.this.getContentPane().setBackground(Color.BLUE);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_B) {
                FormPrincipal.this.getContentPane().setBackground(null);
            }

            if (e.getKeyCode() == KeyEvent.VK_0) {
                FormSecundario fs = new FormSecundario(FormPrincipal.this);
                fs.setVisible(true);
            }
        }
    }
    
}
