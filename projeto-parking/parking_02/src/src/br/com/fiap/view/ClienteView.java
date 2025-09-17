package src.br.com.fiap.view;

import br.com.fiap.controller.ClienteController;

import javax.swing.*;

public class ClienteView {
    public static void main(String[] args) {
    String nome, placa;
    int id, opcao;
    String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
    ClienteController clienteController = new ClienteController();

    do {
        try {
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular um Cliente", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]);

            switch (opcao) {
                case 0:
                    nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
                    placa = JOptionPane.showInputDialog("Digite a placa do carro");

                    //Inserindo Cliente...
                    JOptionPane.showMessageDialog(null, clienteController.inserirCliente(nome, placa));
                    break;
                case 1:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do Cliente"));
                    nome = JOptionPane.showInputDialog("Digite o NOVO nome do cliente");
                    placa = JOptionPane.showInputDialog("Digite a NOVA placa do carro");

                    //Alterando Cliente...
                    JOptionPane.showMessageDialog(null, clienteController.alterarCliente(id, nome, placa));
                    break;
                case 2:
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do Cliente"));
                    //Excluir Carro...
                    JOptionPane.showMessageDialog(null, clienteController.excluirCliente(id));
                    break;
                case 3:
                    //Listar Cliente...
                    id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do cliente"));
                    JOptionPane.showMessageDialog(null, clienteController.listarUmCliente(id));
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");

            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }

    public static void exibirMenu() {
        String nome, placa;
        int id, opcao;
        String[] escolha = {"Inserir", "Alterar", "Excluir", "Listar"};
        ClienteController clienteController = new ClienteController();

        do {
            try {
                opcao = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular um Cliente", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]);

                switch (opcao) {
                    case 0:
                        nome = JOptionPane.showInputDialog("Digite o nome do Cliente");
                        placa = JOptionPane.showInputDialog("Digite a placa do carro");

                        //Inserindo Cliente...
                        JOptionPane.showMessageDialog(null, clienteController.inserirCliente(nome, placa));
                        break;
                    case 1:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do Cliente"));
                        nome = JOptionPane.showInputDialog("Digite o NOVO nome do cliente");
                        placa = JOptionPane.showInputDialog("Digite a NOVA placa do carro");

                        //Alterando Cliente...
                        JOptionPane.showMessageDialog(null, clienteController.alterarCliente(id, nome, placa));
                        break;
                    case 2:
                        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do Cliente"));
                        //Excluir Carro...
                        JOptionPane.showMessageDialog(null, clienteController.excluirCliente(id));
                        break;
                    case 3:
                        //Listar Cliente...
                        id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do cliente"));
                        JOptionPane.showMessageDialog(null, clienteController.listarUmCliente(id));
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida!");

                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }

}
