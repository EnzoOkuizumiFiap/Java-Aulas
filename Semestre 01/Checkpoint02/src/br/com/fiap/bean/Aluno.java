package br.com.fiap.bean;

import java.time.LocalDate;

public class Aluno {
    //Atributos
    private int registroMatricula;
    private String nomeCompleto;
    private int anoDeNascimento;

    //Construtores
    public Aluno() {
    }
    public Aluno(int registroMatricula, String nomeCompleto, int anoDeNascimento) {
        setRegistroMatricula(registroMatricula);
        this.nomeCompleto = nomeCompleto;
        setAnoDeNascimento(anoDeNascimento);
    }

    //Métodos Getters/Setters

    //Matricula do Aluno
    public int getRegistroMatricula() {
        return registroMatricula;
    }
    public void setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula;
            } else {
                throw new Exception("Valor da Matrícula Inválido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    //Nome Completo do Aluno
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    //Data de Nascimento do Aluno
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }
    public void setAnoDeNascimento(int anoDeNascimento) {
        try {
            if (anoDeNascimento >= 1945 && anoDeNascimento <= LocalDate.now().getYear()) {
                this.anoDeNascimento = anoDeNascimento;
            } else {
                throw new Exception("Ano de Nascimento Inválido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Métodos da classe
    public int calcularIdade (LocalDate dataAtual) {
        return dataAtual.getYear() - anoDeNascimento;
    }
}
