package src.br.com.fiap.view;

import br.com.fiap.controller.CarroController;

import javax.swing.*;

public class CarroView {
    public static void main(String[] args) {
        String placa, cor, descricao;
        int opcao;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        CarroController carroController = new CarroController();

        do {
            try {
                opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular um Carro", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]); //Novo metodo da classe JOptionPane: showOptionDialog()

                placa = JOptionPane.showInputDialog("Digite a placa do carro");

                switch (opcao) {
                    case 0:
                        cor = JOptionPane.showInputDialog("Digite a cor do carro");
                        descricao = JOptionPane.showInputDialog("Digite uma descrição para o carro");

                        //Inserindo Carro...
                        JOptionPane.showMessageDialog(null, carroController.inserirCarro(placa, cor, descricao));
                        break;
                    case 1:
                        cor = JOptionPane.showInputDialog("Digite a NOVA cor do carro");
                        descricao = JOptionPane.showInputDialog("Digite uma NOVA descrição para o carro");

                        //Alterando Carro...
                        JOptionPane.showMessageDialog(null, carroController.alterarCarro(placa, cor, descricao));
                        break;
                    case 2:

                        //Excluir Carro...
                        JOptionPane.showMessageDialog(null, carroController.excluirCarro(placa));
                        break;
                    case 3:

                        //Listar Carro...
                        JOptionPane.showMessageDialog(null, carroController.listarUmCarro(placa));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }

    public static void exibirMenu() {
        String placa, cor, descricao;
        int opcao;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        CarroController carroController = new CarroController();

        do {
            try {
                opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular um Carro", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]); //Novo metodo da classe JOptionPane: showOptionDialog()

                placa = JOptionPane.showInputDialog("Digite a placa do carro");

                switch (opcao) {
                    case 0:
                        cor = JOptionPane.showInputDialog("Digite a cor do carro");
                        descricao = JOptionPane.showInputDialog("Digite uma descrição para o carro");

                        //Inserindo Carro...
                        JOptionPane.showMessageDialog(null, carroController.inserirCarro(placa, cor, descricao));
                        break;
                    case 1:
                        cor = JOptionPane.showInputDialog("Digite a NOVA cor do carro");
                        descricao = JOptionPane.showInputDialog("Digite uma NOVA descrição para o carro");

                        //Alterando Carro...
                        JOptionPane.showMessageDialog(null, carroController.alterarCarro(placa, cor, descricao));
                        break;
                    case 2:

                        //Excluir Carro...
                        JOptionPane.showMessageDialog(null, carroController.excluirCarro(placa));
                        break;
                    case 3:

                        //Listar Carro...
                        JOptionPane.showMessageDialog(null, carroController.listarUmCarro(placa));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                }

            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }
}
