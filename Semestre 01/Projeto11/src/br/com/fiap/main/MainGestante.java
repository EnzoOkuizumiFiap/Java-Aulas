package br.com.fiap.main;

import br.com.fiap.bean.Gestante;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainGestante {
    public static void main(String[] args) {
        Gestante gravida1;
        String nome, data1, dataBrasil;
        LocalDate dataDaGestacao;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            nome = JOptionPane.showInputDialog("Digite o seu nome");
            data1 = JOptionPane.showInputDialog("Digite o inicio da gestação (dia/mês/ano)");

            dataDaGestacao = LocalDate.parse(data1, dtf);
            gravida1 = new Gestante(nome, dataDaGestacao); //Aqui estamos instanciando gravida1...
            //JOptionPane.showMessageDialog(null, String.format("Data formato EUA \n%s",gravida1.getDataDaGestacao()));

            dataBrasil = gravida1.getDataDaGestacao().format(dtf);
            JOptionPane.showMessageDialog(null, String.format("Exibindo informações \nNome: %s \nData da Gestação: %s \nTempo de Gestação: %d mês(es)", gravida1.getNome(), gravida1.getDataDaGestacao(), gravida1.tempoDeGestacao())); //Nós pegamos o nome aqui no final no gravida1.getNome()

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
