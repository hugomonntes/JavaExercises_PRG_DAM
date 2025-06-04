
package wordle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal extends JFrame implements ActionListener {
  JLabel[][] arrayLabels = new JLabel[5][10];
  private JPanel jp;

  public Principal() {
    jp = new JPanel();
    jp.setSize(100, 100);
    jp.setLocation(0, 0);

    this.setTitle("Wordle");
    this.setLayout(null);
    for (int i = 0; i < arrayLabels.length; i++) {
      for (int j = 0; j < arrayLabels[i].length; j++) {
        JLabel lblLetra = new JLabel("2");
        arrayLabels[i][j] = lblLetra;
        lblLetra.setLocation(120 * i, 100 * j);
        lblLetra.setSize(100,100);
        lblLetra.setHorizontalAlignment(JLabel.CENTER);
        lblLetra.setVerticalAlignment(JLabel.CENTER);
        lblLetra.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        lblLetra.setOpaque(true);
        this.add(lblLetra);
      }
    }
  }

  @Override
  public void actionPerformed(ActionEvent e) {

  }
}
