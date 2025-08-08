package br.com.fiap.main;

import javax.swing.*;

public class ComparaString {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite sua senha:");

        if(senha.equals("P4ssW0rD")) {
            JOptionPane.showMessageDialog(null, "Acesso Concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Negado");
        }

        if(senha.equalsIgnoreCase("P4ssW0rD")) {
            JOptionPane.showMessageDialog(null, "Permitido Acesso");
        } else {
            JOptionPane.showMessageDialog(null, "Negado Acesso");
        }
    }
}
