package br.com.fiap.main;

import javax.swing.*;

public class UserDigita {
    public static void main(String[] args) {
        String digitado = JOptionPane.showInputDialog("Digite alguma abobrinha:");

        JOptionPane.showMessageDialog(null,"A palavra " + digitado + " tem " + digitado.length() + " letras.");
        JOptionPane.showMessageDialog(null, digitado.toUpperCase());

        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        String palavra = JOptionPane.showInputDialog("Digite uma palavra que deseja substituir: ");
        String palavraSubstituir = JOptionPane.showInputDialog("Digite a palavra");
        String substituido = frase.replace(palavra, palavraSubstituir);

        JOptionPane.showMessageDialog(null, substituido);
        JOptionPane.showMessageDialog(null, "A frase " + substituido + " tem " + substituido.length() + " letras.");


    }
}
