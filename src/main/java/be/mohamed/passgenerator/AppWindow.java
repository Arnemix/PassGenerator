package be.mohamed.passgenerator;

import javax.swing.*;
import java.awt.*;

public class AppWindow extends JFrame {

    private final JCheckBox includeUpperCase;
    private final JCheckBox includeNumbers;
    private final JCheckBox includeSymbols;
    private final JTextField passwordField;


    public AppWindow() {
        setTitle("Générateur de mots de passe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(650, 190); // Agrandit la fenêtre (largeur x hauteur)

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        includeNumbers = new JCheckBox("Inclure des nombres");
        includeSymbols = new JCheckBox("Inclure des symboles");
        includeUpperCase = new JCheckBox("Inclure des Majuscules");

        passwordField = new JTextField(20);
        passwordField.setEditable(false);

        JButton generatePassword = new JButton("Générer le mot de passe");

        generatePassword.addActionListener(e -> {
            Password password = new Password(includeSymbols.isSelected(), includeUpperCase.isSelected(), includeNumbers.isSelected(), 20);
            passwordField.setText(password.generate());

        });


        includeNumbers.setAlignmentX(Component.CENTER_ALIGNMENT);
        includeSymbols.setAlignmentX(Component.CENTER_ALIGNMENT);
        includeUpperCase.setAlignmentX(Component.CENTER_ALIGNMENT);
        generatePassword.setAlignmentX(Component.CENTER_ALIGNMENT);
        passwordField.setAlignmentX(Component.CENTER_ALIGNMENT);

        contentPane.add(includeNumbers);
        contentPane.add(includeSymbols);
        contentPane.add(includeUpperCase);
        contentPane.add(generatePassword);
        contentPane.add(passwordField);

        setContentPane(contentPane);
        setLocationRelativeTo(null);
        setVisible(true);


    }


}
