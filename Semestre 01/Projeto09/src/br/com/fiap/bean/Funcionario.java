package br.com.fiap.bean;

public class Funcionario {
    //Exercício da Aula
    //Atributos
    private String nome;
    private float valorHoraTrabalho;

    //Construtor vazio
    public Funcionario() {
    }
    //Construtor com passagem de parâmetro
    public Funcionario(String nome, float valorHoraTrabalho) {
        this.nome = nome;
        //this.valorHoraTrabalho = valorHoraTrabalho;
        setValorHoraTrabalho(valorHoraTrabalho);
    }

    //Metodo getters/setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalho() {
        return valorHoraTrabalho;
    }
    public void setValorHoraTrabalho(float valorHoraTrabalho) {
        try{
            if (valorHoraTrabalho > 0 ) {
                this.valorHoraTrabalho = valorHoraTrabalho;
            } else {
                throw new Exception("Nome ou valor da Hora Inválidos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //Metodo da classe
    public float calcularSalario(float qtdeHorasTrabalhadaSemana){
        return valorHoraTrabalho * qtdeHorasTrabalhadaSemana * 4;
    }
}
