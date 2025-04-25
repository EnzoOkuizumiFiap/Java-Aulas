package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class FormataData {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate fimDosTempos = LocalDate.parse("2012-12-21");
        Period periodo = Period.between(fimDosTempos, dataAtual);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        JOptionPane.showMessageDialog(null, String.format("Data atual: %s \nData do fim do mundo: %s \nDesde de o fim dos tempos, passaram-se %d ano(s), %d mês(es) e %d dias(s)", dataAtual.format(dtf), fimDosTempos.format(dtf), periodo.getYears(), periodo.getMonths(), periodo.getDays()));
    }
}
