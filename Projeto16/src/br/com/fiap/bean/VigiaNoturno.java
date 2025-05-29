package br.com.fiap.bean;
/**
 * Classe para objetos do tipo VigiaNoturno
 * essa classe implementa a interface Funcionario
 * @author Enzo
 * @version 1.0
 */
public class VigiaNoturno implements Funcionario{
    //Atributos
    private String nome;
    private float valorHoraTrabalhado;
    private float adicionalNoturno;

    //Construtores
    public VigiaNoturno(){
    }

    public VigiaNoturno(String nome, float valorHoraTrabalhado, float adicionalNoturno) {
        this.nome = nome;
        this.valorHoraTrabalhado = valorHoraTrabalhado;
        this.adicionalNoturno = adicionalNoturno;
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

    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    //Métodos da classe (particulares)
    /**
     * Metodo calcularSalario que retorna o valor do salário
     * deste tipo de funcionário (VigiaNoturno)
     * @author Enzo
     * @return float - retorna o valor do salário
     */
    public float calcularSalario() {
        return (valorHoraTrabalhado * 40) * 4 + adicionalNoturno;
    }
}
