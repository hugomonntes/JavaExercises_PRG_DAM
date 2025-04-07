
package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class IncorrectFormUseJFrame {
  public static void main(String[] args) {
    // JOptionPane.showMessageDialog(null, // Método de la clase JOptionPane public static
    //     "Welcome to the Java World",
    //     "Usando Swing",
    //     JOptionPane.INFORMATION_MESSAGE);
    // System.out.println("Hello World!");

    JFrame window = new JFrame("Titulo Ventana"); // Show Constructors
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(300, 400);
    window.setVisible(true);

    // Instance label object to use in window
    JLabel label = new JLabel("App");
    label.setToolTipText("This is a ToolTipText example"); // Put mouse over label (hover) and ToolTip shows help label
    window.add(label);

    JButton button = new JButton("Add info");
    button.setSize(100, 50);
    window.add(button);
  }
}
