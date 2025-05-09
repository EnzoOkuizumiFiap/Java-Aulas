package br.com.fiap.main;

import br.com.fiap.bean.Funcionario;

import javax.swing.*;

public class MainPagamento {
    public static void main(String[] args) {
        String auxiliar, nome, escolha = "sim";
        float valorHoraTrabalhada, adicionalNoturno, comsissao;

        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar = JOptionPane.showInputDialog(null, "Qual tipo de funcionário você deseja calcular o salário? \n1 - Funcionário \n2 - Vigia Noturno \n 3 - Vendedor \n4 - Sair");

                switch (escolha){
                    case 1:
                        Funcionario func = new Funcionario();
                        func.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
                        
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
