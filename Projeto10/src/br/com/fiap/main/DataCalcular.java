package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataCalcular {
    public static void main(String[] args) {
        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
           String dataInicialStr = JOptionPane.showInputDialog(null,"Digite uma data inicial (dia/Mês/Ano): ");
           LocalDate dataInicial = LocalDate.parse(dataInicialStr, dataFormatada);

           String dataFinalStr = JOptionPane.showInputDialog(null, "Digite a data final (dia/Mês/Ano): ");
           LocalDate dataFinal = LocalDate.parse(dataFinalStr, dataFormatada);

            // Calcula a diferença entre as datas
            Period diferenca = Period.between(dataInicial, dataFinal);

            int anos = diferenca.getYears();
            int meses = diferenca.getMonths();
            int dias = diferenca.getDays();

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, "Diferença: " + anos + " anos, " + meses + " meses e " + dias + " dias.");

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null,"Formato de data inválido. Por favor, insira no formato dd/MM/yyyy.");
        }

    }
}
