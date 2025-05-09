package br.com.fiap.bean;

public class Funcionario {
    //Atributos
    private String nome;
    private float valorHoraTrabalhada;

    //Construtores
    public Funcionario (){
    }
    public Funcionario(String nome, float valorHoraTrabalhada) {
        this.nome = nome;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    //Getters/Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }
    public void setValorHoraFuncionario(float valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    //Métodos da classe (particulares)
    public float calcularSalario(){
        return ((valorHoraTrabalhada * 40) * 4);
    }
}
