
package swing;

import javax.swing.JOptionPane;

public class Application {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, // Método de la clase JOptionPane public static
        "Welcome to the Java World",
        "Usando Swing",
        JOptionPane.INFORMATION_MESSAGE);
    System.out.println("Hello World!");
  }
}
