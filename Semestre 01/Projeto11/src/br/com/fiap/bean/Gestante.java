package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Gestante {
    //Atributos
    private String nome;
    private LocalDate dataDaGestacao;

    //Construtores
    public Gestante(){
    }

    public Gestante(String nome, LocalDate dataDaGestacao) {
        this.nome = nome;
        //this.dataDaGestacao = dataDaGestacao;
        setDataDaGestacao(dataDaGestacao);
    }

    //Métodos getters/setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDaGestacao() {
        return dataDaGestacao;
    }
    public void setDataDaGestacao(LocalDate dataDaGestacao) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate limiteGestacao = dataAtual.minusMonths(9).minusDays(1);
        try {
            if (!dataDaGestacao.isBefore(limiteGestacao) && !dataDaGestacao.isAfter(dataAtual)){
                this.dataDaGestacao = dataDaGestacao;
            } else{
                throw new Exception("Data da Gestação Inválida!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    //Métodos da classe (particulares)
    public int tempoDeGestacao(){
        LocalDate dataAtual = LocalDate.now();
        Period gestacao = Period.between(dataDaGestacao, dataAtual);
        return gestacao.getMonths();
    }
}
