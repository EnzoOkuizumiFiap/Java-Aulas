package br.com.fiap;

import javax.swing.*;

public class Ex01_JOption {
    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, resultado;
        String auxiliar;
        try {
            auxiliar = JOptionPane.showInputDialog("Digite a sua 1° nota: ");
            nota1 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a sua 2° nota: ");
            nota2 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a sua 3° nota: ");
            nota3 = Float.parseFloat(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite a sua 4° nota: ");
            nota4 = Float.parseFloat(auxiliar);

            resultado = (nota1 + nota2 + nota3 + nota4) / 4;

            JOptionPane.showMessageDialog(null, "O resultado da média é: " + resultado);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
