package br.com.fiap.main;

import javax.swing.*;

public class ManipulaString {
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma";
        JOptionPane.showMessageDialog(null, frase.length());
        JOptionPane.showMessageDialog(null, frase.toUpperCase());
        JOptionPane.showMessageDialog(null, frase.toLowerCase());
        JOptionPane.showMessageDialog(null, frase.substring(23, 26));

        JOptionPane.showMessageDialog(null, frase.replace("roupa", "parede"));
    }
}
