package javaexercises.PRG_Swing.Swing_Ex1;

import javax.swing.JFrame;

public class GraphicUserInterface {
    public static void main(String[] args) {
        SimulacionDado windowDado = new SimulacionDado();

        windowDado.setTitle("Simulación de Dado");
        windowDado.setSize(500, 500);
        windowDado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowDado.setVisible(true);
        windowDado.setLocationRelativeTo(null);
    }
}
