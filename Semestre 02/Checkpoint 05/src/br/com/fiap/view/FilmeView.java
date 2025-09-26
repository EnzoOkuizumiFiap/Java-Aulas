package br.com.fiap.view;

import br.com.fiap.controller.FilmeController;

import javax.swing.*;

import java.util.Scanner;

import static java.lang.System.exit;

/*
 * Integrantes:
 * Enzo Okuizumi RM561432
 * Milton Jakson RM564836
 * Lucas Barros RM 566422
 * */

public class FilmeView {
    public static void main(String[] args) {
        String titulo, genero, produtora;
        String[] choice = {"Inserir", "Alterar", "Excluir", "Listar", "Fechar"};
        int option, codigo;
        FilmeController filmeCon = new FilmeController();
        Scanner scan = new Scanner(System.in);
        do {
            try {
                option = JOptionPane.showOptionDialog(null, "Escolha uma das opções abaixo para manipular um Filme:\n", "Escolha", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);

                switch (option) {
                    case 0:
                        System.out.println("Digite o título do filme:");
                        titulo = scan.nextLine();
                        System.out.println("Digite o genero do filme:");
                        genero = scan.nextLine();
                        System.out.println("Digite a produtora do filme:");
                        produtora = scan.nextLine();
                        System.out.println(filmeCon.inserirFilme(titulo, genero, produtora));
                        break;
                    case 1:
                        System.out.println("Digite o ID do filme:");
                        codigo = Integer.parseInt(scan.nextLine());
                        System.out.println("Digite o título do filme:");
                        titulo = scan.nextLine();
                        System.out.println("Digite o genero do filme:");
                        genero = scan.nextLine();
                        System.out.println("Digite a produtora do filme:");
                        produtora = scan.nextLine();
                        System.out.println(filmeCon.alterarFilme(codigo, titulo, genero, produtora));
                        break;
                    case 2:
                        System.out.println("Digite o ID do filme:");
                        codigo = Integer.parseInt(scan.nextLine());
                        System.out.println(filmeCon.excluirFilme(codigo));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, filmeCon.listarTodosFilmes(), "Filmes", JOptionPane.INFORMATION_MESSAGE);
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
