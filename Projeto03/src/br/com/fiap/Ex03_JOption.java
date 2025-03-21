package br.com.fiap;

import javax.swing.*;

public class Ex03_JOption {
    public static void main(String[] args) {
        float valorRaio, PI = 3.14F, resultadoAreaCirculo;
        String auxiliar;

        try{
            auxiliar = JOptionPane.showInputDialog("Digite o raio do círculo: ");
            valorRaio = Float.parseFloat(auxiliar);

            resultadoAreaCirculo = PI * (valorRaio * valorRaio);

            JOptionPane.showMessageDialog(null, "O valor da área do círculo é " + resultadoAreaCirculo);

        } catch (Exception e) {
            System.out.println("Formato de número incorreto!");
        }
    }
}
