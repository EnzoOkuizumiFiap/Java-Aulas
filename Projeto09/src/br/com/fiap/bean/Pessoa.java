package br.com.fiap.bean;

import java.time.LocalDate;

public class Pessoa {
    //Atributos
    private String nome;
    private int anoNascimento;

    //Construtores
    //Construtor vazio vv
    public Pessoa() {
    }

    //Construtor com passagem de parâmetro
    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        //this.anoNascimento = anoNascimento; -> Ele está sem a regra de negócio
        setAnoNascimento(anoNascimento);
    }

    //Métodos getters/setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        LocalDate dataAtual = LocalDate.now();
        try{
            if(anoNascimento >= 1900 && anoNascimento <= dataAtual.getYear()) {
                this.anoNascimento = anoNascimento;
            } else {
                throw new Exception("Valor inválido! (Min = 1900, Max = Ano Atual)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Métodos da classe
    public int calcularIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
