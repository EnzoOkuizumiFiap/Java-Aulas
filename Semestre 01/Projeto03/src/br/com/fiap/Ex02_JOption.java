package br.com.fiap;

import javax.swing.*;

public class Ex02_JOption {
    public static void main(String[] args) {
        int dataAtual, dataNascimento, resultadoIdade;
        String auxiliar;

        try{
            auxiliar = JOptionPane.showInputDialog("Digite a data atual: ");
            dataAtual = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Digite a data de nascimento: ");
            dataNascimento = Integer.parseInt(auxiliar);

            resultadoIdade = dataAtual - dataNascimento;

            JOptionPane.showMessageDialog(null, "A data atual é " + dataAtual + ", a sua data de nascimento é " + dataNascimento + ", então a sua idade é " + resultadoIdade + " anos.");


        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
