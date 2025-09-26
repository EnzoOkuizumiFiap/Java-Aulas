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
        String titulo, genero, produtora, resposta;
        int option, codigo;
        FilmeController filmeCon = new FilmeController();
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Escolha uma das opções abaixo para manipular um Filme: \n1-Inserir \n2-Alterar \n3-Excluir \n4-Listar \n5-Fechar");
                option = Integer.parseInt(scan.nextLine());
                switch (option) {
                    case 1:
                        System.out.println("Digite o título do filme:\n");
                        titulo = scan.nextLine();
                        System.out.println("Digite o genero do filme:\n");
                        genero = scan.nextLine();
                        System.out.println("Digite a produtora do filme:\n");
                        produtora = scan.nextLine();
                        System.out.println(filmeCon.inserirFilme(titulo, genero, produtora));
                        break;
                    case 2:
                        System.out.println("Digite o código do filme:");
                        codigo = Integer.parseInt(scan.nextLine());
                        System.out.println("Digite o título do filme:");
                        titulo = scan.nextLine();
                        System.out.println("Digite o genero do filme:");
                        genero = scan.nextLine();
                        System.out.println("Digite a produtora do filme:");
                        produtora = scan.nextLine();
                        System.out.println(filmeCon.alterarFilme(codigo, titulo, genero, produtora));
                        break;
                    case 3:
                        System.out.println("Digite o código do filme:");
                        codigo = Integer.parseInt(scan.nextLine());
                        System.out.println(filmeCon.excluirFilme(codigo));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, filmeCon.listarTodosFilmes(), "Filmes", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        System.out.print("Opção Incorreta. Selecione outra, por favor!");
                        break;
                }
            } catch (Exception e) {
                System.out.print("Erro:" + e.getMessage());
            }

            System.out.print("\nDeseja continuar? (s/n):\n");
            resposta = scan.nextLine().trim().toLowerCase();

        } while (resposta.equals("s"));

        System.out.println("Fim do programa");
        scan.close();
    }
}
