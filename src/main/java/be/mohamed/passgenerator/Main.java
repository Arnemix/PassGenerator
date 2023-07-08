package be.mohamed.passgenerator;


import javax.swing.*;

public class Main {


    public static void main(String[] args) {


        SwingUtilities.invokeLater(AppWindow::new);

        JOptionPane.showMessageDialog(new JFrame(), "Cette application est en phase de développement");





    }
}