package br.com.fiap.main;

import br.com.fiap.bean.FolhaDePagamento;

import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        FolhaDePagamento folha = new FolhaDePagamento();

        double salarioBruto, descontoINSS, valorPlanoDeSaude;
        int numeroDeDependentes;
        String auxiliar;

        try {
            auxiliar = JOptionPane.showInputDialog("Digite o salário Bruto: ");
            salarioBruto = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o número de Dependentes: ");
            numeroDeDependentes = Integer.parseInt(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite desconto INSS: ");
            descontoINSS = Double.parseDouble(auxiliar);

            auxiliar = JOptionPane.showInputDialog("Digite o valor do Plano de Saúde:");
            valorPlanoDeSaude = Double.parseDouble(auxiliar);

            //Atribuindo os valores ao objeto
            folha.salarioBruto = salarioBruto;
            folha.numeroDeDependentes = numeroDeDependentes;
            folha.descontoINSS = descontoINSS;
            folha.valorPlanoDeSaude = valorPlanoDeSaude;

            //Criando a mensagem
            String mensagem = String.format("\nSalário Bruto: R$%.2f \nN° de dependentes: %d \nDesconto INSS: %.1f%% \nValor Plano de Saúde: %.2f \nSalário Líquido: R$%.2f", folha.salarioBruto, folha.numeroDeDependentes, folha.descontoINSS, folha.valorPlanoDeSaude, folha.calcularSalarioLiquido());

            JOptionPane.showMessageDialog(null, mensagem);

        } catch (Exception e) {
            JOptionPane.showInputDialog(null, "Formato de número incorreto!");
        }

    }
}
