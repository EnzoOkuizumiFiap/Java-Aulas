package br.com.fiap.main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opcao;

        do {
            try {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha o tipo de mensagem \n(1) Pergunta \n(2) Informação \n(3) Alerta \n(4) Erro"));

                switch (opcao){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Mensagem com ícone de PERGUNTA", "Pergunta", JOptionPane.QUESTION_MESSAGE);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Mensagem com ícone de INFORMAÇÃO", "Informação", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Mensagem com ícone de ALERTA", "Alerta", JOptionPane.WARNING_MESSAGE);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Mensagem com ícone de ERRO", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                    default:
                        throw new Exception("Escolha incorreta");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "ATENÇÃO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de programa. Volte sempre!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
