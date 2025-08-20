package br.com.fiap.main;

import br.com.fiap.bean.Calculadora;

import javax.swing.*;

public class UsaCalculadora {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();
        boolean continuar = true;

        while (continuar) {
            try {
                float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1° Número:"));
                float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 2° Número: "));

                calcular.setNumero1(num1);
                calcular.setNumero2(num2);

                String menu = """
                        Escolha a Operação:
                        1. Soma
                        2. Subtração
                        3. Multiplicação
                        4. Divisão
                        """;

                int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

                float resultado = 0;
                switch (opcao) {
                    case 1 -> resultado = calcular.adicao();
                    case 2 -> resultado = calcular.subtracao();
                    case 3 -> resultado = calcular.multiplicacao();
                    case 4 -> resultado = calcular.divisao();
                    default -> JOptionPane.showMessageDialog(null, "Opção Inválida!");
                }

                if (opcao >= 1 && opcao <= 4) {
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro: Digite apenas números válidos!");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (resposta != JOptionPane.YES_OPTION) {
                continuar = false;
                JOptionPane.showMessageDialog(null, "Obrigado por usar a calculadora. Até mais!");
            }
        }
    }

}
