package be.mohamed.passgenerator;

import java.util.Random;

public class Password {

    private final boolean includeSymbols;
    private final boolean includeUpperCase;
    private final boolean includeNumbers;
    private final int size;


    public Password(boolean includeSymbols, boolean includeUpperCase, boolean includeNumbers, int size) {
        this.includeSymbols = includeSymbols;
        this.includeUpperCase = includeUpperCase;
        this.includeNumbers = includeNumbers;
        this.size = size;
    }

    public boolean isIncludeSymbols() {
        return includeSymbols;
    }

    public boolean isIncludeUpperCase() {
        return includeUpperCase;
    }

    public boolean isIncludeNumbers() {
        return includeNumbers;
    }

    public int getSize() {
        return size;
    }

    /**
     * This method generate random password based on user preferences
     *
     * @return password in a String
     */
    public String generate() {
        StringBuilder passwordBuilder = new StringBuilder();

        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()_+-=[]{}|;':,.<>?";

        Random random = new Random();
        passwordBuilder.append(lowercaseLetters);

        if (isIncludeUpperCase()) {
            passwordBuilder.append(lowercaseLetters);
            passwordBuilder.append(uppercaseLetters);
        }
        if (isIncludeNumbers()) {
            passwordBuilder.append(numbers);
        }
        if (isIncludeSymbols()) {
            passwordBuilder.append(symbols);
        }


        StringBuilder generatedPassword = new StringBuilder();
        for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(passwordBuilder.length());
            generatedPassword.append(passwordBuilder.charAt(randomIndex));
        }

        return generatedPassword.toString();
    }


}
