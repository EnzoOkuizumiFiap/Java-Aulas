package br.com.fiap.view;

import br.com.fiap.controller.FilmeController;

import javax.swing.*;

import static java.lang.System.exit;

public class FilmeView {
    public static void main(String[] args) {
        String titulo, genero, produtora;
        String[] choice = {"Inserir", "Alterar", "Excluir", "Listar", "Fechar"};
        int option, codigo;
        FilmeController filmeCon = new FilmeController();
        do {
            try {
                option = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular um Filme:\n", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);

                switch (option) {
                    case 0:
                        titulo = JOptionPane.showInputDialog(null, "Digite o titulo do filme", "CPF", JOptionPane.INFORMATION_MESSAGE);
                        genero = JOptionPane.showInputDialog(null, "Digite o genero", "Genero", JOptionPane.INFORMATION_MESSAGE);
                        produtora = JOptionPane.showInputDialog(null, "Digite o nome da produtora", "Produtora", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(filmeCon.inserirFilme(titulo, genero, produtora));
                        break;
                    case 1:
                        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID", "ID", JOptionPane.INFORMATION_MESSAGE));
                        titulo = JOptionPane.showInputDialog(null, "Digite o novo CPF", "Placa", JOptionPane.INFORMATION_MESSAGE);
                        genero = JOptionPane.showInputDialog(null, "Digite o novo genero", "Nome", JOptionPane.INFORMATION_MESSAGE);
                        produtora = JOptionPane.showInputDialog(null, "Digite o nova produtora", "Senha", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println(filmeCon.alterarFilme(codigo, titulo, genero, produtora));
                        break;
                    case 2:
                        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do filme", "ID", JOptionPane.INFORMATION_MESSAGE));
                        System.out.println(filmeCon.excluirFilme(codigo));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, filmeCon.listarTodosFilmes());
                        break;
                    case 4:
                        exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim do programa", "Fim", JOptionPane.INFORMATION_MESSAGE);
    }
}
