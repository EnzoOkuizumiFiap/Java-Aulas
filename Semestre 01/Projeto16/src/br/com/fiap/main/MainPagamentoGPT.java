package br.com.fiap.main;

import br.com.fiap.bean.Freelancer;
import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamentoGPT {
    public static void main(String[] args) {
        while (true) {
            String[] opcoes = {"Vigia Noturno", "Vendedor", "Freelancer"};
            int escolha = JOptionPane.showOptionDialog(null, "Escolha o tipo de Funcionário:", "Cálculo de Salário", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            // Se o usuário clicar em Cancelar ou fechar a janela
            if (escolha == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário.", "Saída", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            Funcionario funcionario = null;
            String nome;
            float valorHora;

            if (escolha == 0) {
                nome = JOptionPane.showInputDialog("Nome do Vigia:");
                valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora Trabalhada:"));
                float adicional = Float.parseFloat(JOptionPane.showInputDialog("Adicional Noturno:"));
                funcionario = new VigiaNoturno(nome, valorHora, adicional);
            } else if (escolha == 1 ) {
                nome = JOptionPane.showInputDialog("Nome do Vendedor:");
                valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora Trabalhada:"));
                float comissao = Float.parseFloat(JOptionPane.showInputDialog("Comissão (%):"));
                funcionario = new Vendedor(nome, valorHora, comissao);
            } else if (escolha == 2) {
                nome = JOptionPane.showInputDialog("Nome do Freelancer:");
                valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora Trabalhada:"));
                long cnpj = Long.parseLong(JOptionPane.showInputDialog("CNPJ:"));
                funcionario = new Freelancer(nome, valorHora);
            } else {
                JOptionPane.showMessageDialog(null, "Opção Inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            float salario = funcionario.calcularSalario();
            JOptionPane.showMessageDialog(null, "Tipo: " + funcionario.getClass().getSimpleName() + "\nSalário: R$" + salario, "Resultado", JOptionPane.INFORMATION_MESSAGE);

            int continuar = JOptionPane.showConfirmDialog(null, "Deseja calcular outro salário?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (continuar != JOptionPane.YES_NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Encerrando o programa.", "Saída", JOptionPane.WARNING_MESSAGE);
            }

        }
    }
}
