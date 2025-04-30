package br.com.fiap.bean;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    //Atributos
    private String nome;
    private LocalDate dataNascimento;

    //Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        //this.dataNascimento = dataNascimento; Esse comando é sem seguir a regra de negócio
        setDataNascimento(dataNascimento);
    }

    //Métodos getters/setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        LocalDate inicio = LocalDate.parse("1899-12-31");
        LocalDate fim = LocalDate.now().plusDays(1);
        try {
            if (dataNascimento.isAfter(inicio) && dataNascimento.isBefore(fim)) {
                this.dataNascimento = dataNascimento;
            } else {
                throw new Exception("Data fora da faixa permitida!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0); //Encerrando o programa após o erro
        }
    }

    //Métodos da classe (particulares)
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataNascimento, dataAtual);
        return idade.getYears();
    }

}


