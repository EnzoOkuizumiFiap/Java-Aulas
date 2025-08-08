package br.com.fiap.bean;
/**
 * Classe para objetos do tipo Freelancer
 * essa classe implementa a interface Funcionario
 * @author Enzo
 * @version 1.0
 */

public class Freelancer implements Funcionario {
    //Atributos
    private String nome;
    private float valorHoraTrabalhado;

    //Construtores
    public Freelancer(){
    }
    public Freelancer(String nome, float valorHoraTrabalhado) {
        this.nome = nome;
        this.valorHoraTrabalhado = valorHoraTrabalhado;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorHoraTrabalhado() {
        return valorHoraTrabalhado;
    }
    public void setValorHoraTrabalhado(float valorHoraTrabalhado) {
        this.valorHoraTrabalhado = valorHoraTrabalhado;
    }

    //Métodos da classe (particulares)
    /**
     * Metodo calcularSalario que retorna o valor do salário
     * deste tipo de funcionário (Freelancer)
     * @author Enzo
     * @return float - retorna o valor do salário
     */
    public float calcularSalario(){
        return ((valorHoraTrabalhado * 40) * 4) * 1.5f;
    }
}
