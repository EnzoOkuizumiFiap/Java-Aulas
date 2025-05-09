package main;

import javax.swing.JOptionPane;
import br.com.imrea.bean.Adicao;

public class MainAdicao {
    public static void main(String[] args) {
        Adicao adicao = new Adicao(); // 1. Instancia o objeto

        int opcao;
        do {
            // 2. Exibe o menu
            String menu = JOptionPane.showInputDialog(
                    "Qual tipo de soma deseja realizar?\n" +
                            "1 - Soma de números inteiros\n" +
                            "2 - Soma de números reais\n" +
                            "0 - Sair"
            );

            if (menu == null || menu.equals("0")) break;

            opcao = Integer.parseInt(menu);

            switch (opcao) {
                case 1:
                    // 3. Pede os valores inteiros
                    int inteiro1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
                    int inteiro2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));

                    // 4. Realiza soma
                    int resultadoInt = adicao.somar(inteiro1, inteiro2);

                    // 5. Mostra resultado
                    JOptionPane.showMessageDialog(null,
                            String.format("Você digitou %d e %d\nResultado da soma: %d",
                                    inteiro1, inteiro2, resultadoInt));
                    break;

                case 2:
                    // 3. Pede os valores reais
                    double real1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número real:"));
                    double real2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número real:"));

                    // 4. Realiza soma
                    double resultadoReal = adicao.somar(real1, real2);

                    // 5. Mostra resultado
                    JOptionPane.showMessageDialog(null,
                            String.format("Você digitou %.2f e %.2f\nResultado da soma: %.2f",
                                    real1, real2, resultadoReal));
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }

            // 6. Pergunta se deseja continuar
            int continuar = JOptionPane.showConfirmDialog(null, "Deseja realizar outra soma?", "Continuar?", JOptionPane.YES_NO_OPTION);
            if (continuar != JOptionPane.YES_OPTION) {
                break;
            }

        } while (true);

        // 7. Mensagem de despedida
        JOptionPane.showMessageDialog(null, "Obrigado por usar o programa de adição!\nAté a próxima.");
    }
}
