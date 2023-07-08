package be.mohamed.passgenerator;

import javax.swing.*;
import java.awt.*;
import java.net.PasswordAuthentication;
import java.util.UUID;

public class AppWindow extends JFrame {

    private JCheckBox includeLowAndUpperCase;
    private JCheckBox includeNumbers;
    private JCheckBox includeSymbols;
    private JButton generatePassword;
    private JTextField password;





    public AppWindow() {
        setTitle("Générateur de mots de passe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(650, 190); // Agrandit la fenêtre (largeur x hauteur)

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

        includeNumbers = new JCheckBox("Inclure des nombres");
        includeSymbols = new JCheckBox("Inclure des symboles");
        includeLowAndUpperCase = new JCheckBox("Inclure des majuscules/minuscules");

        password = new JTextField(20);
        password.setEditable(false);

        generatePassword = new JButton("Générer le mot de passe");

        generatePassword.addActionListener(e -> {
            password.setText(UUID.randomUUID().toString());
        });



        includeNumbers.setAlignmentX(Component.CENTER_ALIGNMENT);
        includeSymbols.setAlignmentX(Component.CENTER_ALIGNMENT);
        includeLowAndUpperCase.setAlignmentX(Component.CENTER_ALIGNMENT);
        generatePassword.setAlignmentX(Component.CENTER_ALIGNMENT);
        password.setAlignmentX(Component.CENTER_ALIGNMENT);

        contentPane.add(includeNumbers);
        contentPane.add(includeSymbols);
        contentPane.add(includeLowAndUpperCase);
        contentPane.add(generatePassword);
        contentPane.add(password);

        setContentPane(contentPane);
        setLocationRelativeTo(null);
        setVisible(true);


    }




}
