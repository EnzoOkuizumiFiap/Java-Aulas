package br.com.fiap.view;

import javax.swing.*;

public class ParkingView {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String[] opcoes = {"Carro", "Cliente", "Sair"};

            int escolha = JOptionPane.showOptionDialog(null, "Quem você deseja manipular?", "Parking System", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0:
                    CarroView.exibirMenu();
                    break;
                case 1:
                    ClienteView.exibirMenu();
                    break;
                default:
                    continuar = false;
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Programa encerrado!");
    }
}
