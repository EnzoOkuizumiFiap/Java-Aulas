package br.com.fiap.bean;
/**
 * Classe para objetos do tipo Vendedor
 * essa classe implementa a interface Funcionario
 * @author Enzo
 * @version 1.0
 */

public class Vendedor implements Funcionario{
    //Atributos
    private String nome;
    private float valorHoraTrabalhado;
    private float comissao;

    //Construtores
    public Vendedor(){
    }
    public Vendedor(String nome, float valorHoraTrabalhado, float comissao) {
        this.nome = nome;
        this.valorHoraTrabalhado = valorHoraTrabalhado;
        this.comissao = comissao;
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

    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    //Métodos da classe (particulares)
    /**
     * Metodo calcularSalario que retorna o valor do salário
     * deste tipo de funcionário (Vendedor)
     * @author Astrogildo
     * @return float - retorna o valor do salário
     */
    public float calcularSalario() {
        return ((valorHoraTrabalhado * 40) * 4) * (1 + comissao / 100);
    }
}
