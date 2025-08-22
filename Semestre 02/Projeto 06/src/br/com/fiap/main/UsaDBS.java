package br.com.fiap.main;

import br.com.fiap.bean.DragonBallSuper;

import javax.swing.*;
import java.io.IOException;

public class UsaDBS {
    public static void main(String[] args) {
        DragonBallSuper dbs = new DragonBallSuper();
        String path;

        do {
            try {
                int choice = Integer.parseInt(JOptionPane.showInputDialog(null, "O que você deseja?\n1 - Cadastro\n2 - Consultar"));

                path = JOptionPane.showInputDialog(null, "Digite o caminho da pasta.", "Caminho", JOptionPane.INFORMATION_MESSAGE);

                switch (choice) {
                    case 1:
                        dbs.setNome(JOptionPane.showInputDialog(null, "Digite o nome.", "Nome", JOptionPane.INFORMATION_MESSAGE).toLowerCase());
                        dbs.setKI(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de seu KI.", "KI", JOptionPane.INFORMATION_MESSAGE)));
                        dbs.setTecnicas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite suas tecnicas.", "Tecnicas", JOptionPane.INFORMATION_MESSAGE)));
                        dbs.setVelocidade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua velocidade.", "Velocidade", JOptionPane.INFORMATION_MESSAGE)));
                        dbs.setTransformacao(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de transformações que possui.", "Transformações", JOptionPane.INFORMATION_MESSAGE)));

                        JOptionPane.showMessageDialog(null, dbs.gravar(path));
                        break;
                    case 2:
                        dbs.setNome(JOptionPane.showInputDialog(null, "Digite o nome", "Nome", JOptionPane.INFORMATION_MESSAGE));
                        dbs.ler(path);
                        if (dbs == null) {
                            JOptionPane.showMessageDialog(null, "Caminho e/ou código informado(s) incorreto(s)");
                        } else {
                            JOptionPane.showMessageDialog(null, "Exibindo dados: " + "\nCaminho: " + path + "\nArquivo: " + path + "/" + dbs.getNome() + ".txt" + "\nNome: " + dbs.getNome() + "\nKI: " + dbs.getKI() + "\nTécnicas: " + dbs.getTecnicas() + "\nVelocidade: " + dbs.getVelocidade() + "\nTransformações: " + dbs.getTransformacao(), "Exibindo", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Valor incorreto", "Erro", JOptionPane.INFORMATION_MESSAGE);
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
