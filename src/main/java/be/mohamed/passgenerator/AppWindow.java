package be.mohamed.passgenerator;

import javax.swing.*;
import java.awt.*;
import java.net.PasswordAuthentication;

public class AppWindow extends JFrame {

    private JCheckBox includeLowAndUpperCase;
    private JCheckBox includeNumbers;
    private JCheckBox includeSymbols;
    private JButton generatePassword;
    private JTextField password;






    public AppWindow() throws HeadlessException {

        setTitle("Générateur de mots de passe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600); // Agrandit la fenêtre (largeur x hauteur)

        BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        getContentPane().setLayout(layout);

        includeNumbers = new JCheckBox("Inclure des nombres ");
        includeSymbols = new JCheckBox("Inclure des symboles ");
        includeLowAndUpperCase = new JCheckBox("Inclure des majuscules/miniscules ");

        password = new JPasswordField(20);
        password.setEditable(false);


        generatePassword = new JButton("Générer le mot de passe");
        generatePassword.addActionListener(e -> {
            System.out.println("Génération ...");
        });

        add(includeNumbers);
        add(includeSymbols);
        add(includeLowAndUpperCase);
        add(generatePassword);
        add(password);

        pack();

        setVisible(true);




    }




}
