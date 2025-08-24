package br.com.fiap.main;

import br.com.fiap.bean.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

/*
* Integrantes:
* Enzo Okuizumi RM561432
* Milton Jakson RM564836
* Lucas Barros RM 566422
* */

public class UsaDBSuper {
    public static void main(String[] args) {
        DragonBallSuper dbs = new DragonBallSuper();

        do {
            int input = Integer.parseInt(JOptionPane.showInputDialog(null, "=== Dragon Ball Super ===\n1 - Cadastrar personagem\n2 - Consultar Personagem\nEscolha um Opção:", "Menu Dragon Ball Super", JOptionPane.QUESTION_MESSAGE));

            String path = JOptionPane.showInputDialog(null, "Digite o caminho da pasta:", "Caminho da pasta", JOptionPane.INFORMATION_MESSAGE);

            try {
                switch (input){
                    case 1:
                        dbs.setNome_do_personagem(JOptionPane.showInputDialog(null, "Digite o nome do personagem:", "Nome Personagem", JOptionPane.INFORMATION_MESSAGE).toLowerCase());

                        dbs.setKI(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o seu KI:", "KI", JOptionPane.INFORMATION_MESSAGE)));

                        dbs.setTecnicas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digita suas Técnicas:", "Técnicas", JOptionPane.INFORMATION_MESSAGE)));

                        dbs.setVelocidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Velocidade:", "Velocidade", JOptionPane.INFORMATION_MESSAGE)));

                        dbs.setTransformacoes(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Transformações que possui:", "Transformações", JOptionPane.INFORMATION_MESSAGE)));

                        JOptionPane.showMessageDialog(null, dbs.gravar(path));
                        break;

                    case 2:
                    dbs.setNome_do_personagem(JOptionPane.showInputDialog(null, "Digite o nome do personagem:", "Nome Personagem", JOptionPane.INFORMATION_MESSAGE));

                        dbs.ler(path);

                        if (dbs == null) {
                            JOptionPane.showMessageDialog(null, "Caminho e/ou código informado incorreto.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Exibindo Dados:" + "\nCaminho:" + path + "Arquivo:" + path + "/" + dbs.getNome() + ".txt" + "\nNome:" + dbs.getNome() + "\nKI:" + dbs.getKI() + "\nTécnicas:" + dbs.getTecnicas() + "\nVelocidade:" + dbs.getVelocidade() + "\nTransformações:" + dbs.getTransformacoes(), "Exibindo dados...", JOptionPane.INFORMATION_MESSAGE);
                        }

                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida. Digite 1, 2 ou 3.", "valor incorreto", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Erro de Conversão!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao Acessar Arquivo!\n" + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0);

    }
}
