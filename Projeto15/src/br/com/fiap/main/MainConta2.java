package br.com.fiap.main;

import br.com.fiap.bean.ContaEspecial;

import javax.swing.*;

public class MainConta2 {
    public static void main(String[] args) {
        String auxiliar, escolha = "sim";
        int numConta, opcao;
        float saldo, valor, limite;

        while(escolha.equalsIgnoreCase("sim")) {
            try {
                auxiliar = JOptionPane.showInputDialog("Digite o número da conta Especial");
                numConta = Integer.parseInt(auxiliar);

                auxiliar = JOptionPane.showInputDialog("Digite valor do saldo");
                saldo = Float.parseFloat(auxiliar);

                auxiliar = JOptionPane.showInputDialog("Digite o limite da sua conta");
                limite = Float.parseFloat(auxiliar);

                ContaEspecial cp = new ContaEspecial();

                cp.setNumConta(numConta);
                cp.setSaldo(saldo);
                cp.setLimite(limite);

                auxiliar = JOptionPane.showInputDialog("Escolha a Operação \n1 - Saque \n2 - Depósito");
                opcao = Integer.parseInt(auxiliar);

                switch (opcao) {
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Digite valor a ser sacado");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da conta \nNúmero da conta: %d \n Saldo Atual: R$ %.2f", cp.getNumConta(), cp.sacar(valor)));
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Digite valor a ser depositado");
                        valor = Float.parseFloat(auxiliar);
                        JOptionPane.showMessageDialog(null, String.format("Dados da conta \nNúmero da conta: %d \n Saldo Atual: R$ %.2f", cp.getNumConta(), cp.depositar(valor)));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            escolha = JOptionPane.showInputDialog("Deseja continuar? (Sim/Não)");
        }
        JOptionPane.showMessageDialog(null, "Fim de programa");
    }
}
