package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(561432, "Enzo Okuizumi Miranda de Souza", 2006);
        Aluno aluno4 = new Aluno(564836, "Milton Jakson de Sousa Marcelino", 1980);
        String auxiliar;

        try {
            //Aluno1
            auxiliar = JOptionPane.showInputDialog("Digite seu registro de Matrícula, aluno 1 (Min: 80000, Max: 599999");
            aluno1.setRegistroMatricula(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite seu nome completo, aluno 1");
            aluno1.setNomeCompleto(String.format(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite seu ano de nascimento, aluno 2 (Min: 1945)");
            aluno1.setAnoDeNascimento(Integer.parseInt(auxiliar));


            //Aluno 2
            auxiliar = JOptionPane.showInputDialog("Digite seu registro de Matrícula, aluno 2 (Min: 80000, Max: 599999");
            aluno2.setRegistroMatricula(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite seu nome completo, aluno 2");
            aluno2.setNomeCompleto(String.format(auxiliar));

            auxiliar = JOptionPane.showInputDialog("Digite seu ano de nascimento, aluno 2 (Min: 1945)");
            aluno2.setAnoDeNascimento(Integer.parseInt(auxiliar));



            //Resultado
            //Aluno 1
            String mensagem1 = String.format("\nAluno 1\nRM: %s\nNome: %s\nIdade: %d", aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdade(dataAtual));
            JOptionPane.showMessageDialog(null, mensagem1);

            // Aluno 2
            String mensagem2 = String.format("\nAluno 2\nRM: %s\nNome: %s\nIdade: %d", aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdade(dataAtual));
            JOptionPane.showMessageDialog(null, mensagem2);

            // Aluno 3
            String mensagem3 = String.format("\nAluno 3\nRM: %s\nNome: %s\nIdade: %d", aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdade(dataAtual));
            JOptionPane.showMessageDialog(null, mensagem3);

            // Aluno 4
            String mensagem4 = String.format("\nAluno 4\nRM: %s\nNome: %s\nIdade: %d", aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdade(dataAtual));
            JOptionPane.showMessageDialog(null, mensagem4);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valor Inserido Inválido!");
        }
    }
}
