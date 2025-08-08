package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.bean.Vendedor;
import br.com.fiap.bean.VigiaNoturno;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String auxiliar, nome;
        float valorHoraTrabalhada, adicionalNoturno, comsissao;
        int escolha = 1;

        while (escolha != 4){
            try {
                auxiliar = JOptionPane.showInputDialog(null, "Qual tipo de funcionário você deseja calcular o salário? \n1 - Funcionário \n2 - Vigia Noturno \n3 - Vendedor \n4 - Sair");
                escolha = Integer.parseInt(auxiliar);

                switch (escolha){
                    case 1: // Calcular o funcionário basico
                        Funcionario func = new Funcionario();
                        func.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
                        func.setValorHoraFuncionario(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora trabalhada")));
                        JOptionPane.showMessageDialog(null, String.format("Nome do Funcionário: %s \nSalário do funcionário: %.2f", func.getNome(), func.calcularSalario()));
                        break;
                    case 2: //Calcula o vigia noturno
                        VigiaNoturno vigia = new VigiaNoturno();
                        vigia.setNome(JOptionPane.showInputDialog("Digite o nome do vigia"));
                        vigia.setValorHoraFuncionario(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora trabalhada")));
                        vigia.setAdicionalNoturno(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor adicional do noturno")));
                        JOptionPane.showMessageDialog(null, String.format("Nome do funcionario: %s\nSalário do  vigia noturno: %.2f", vigia.getNome(), vigia.calcularSalario()));
                        break;
                    case 3: //Calcula o vendedor
                        Vendedor vendedor = new Vendedor();
                        vendedor.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
                        vendedor.setValorHoraFuncionario(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da hora trabalhada")));
                        vendedor.setComissao(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da comissão")));
                        JOptionPane.showMessageDialog(null, String.format("Nome do funcionário: %s \nSalário do Funcionário: %.2f", vendedor.getNome(), vendedor.calcularSalario()));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Programa encerrando... Volte sempre!");
                        break;
                    default:
                        throw new Exception("Valor inserido inválido!");
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
