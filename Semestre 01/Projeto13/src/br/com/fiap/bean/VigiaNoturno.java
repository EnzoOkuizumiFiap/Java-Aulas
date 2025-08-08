package br.com.fiap.bean;

public class VigiaNoturno extends Funcionario{
    //Atributos
    private float adicionalNoturno;

    //Construtores
    public VigiaNoturno(){
    }
    public VigiaNoturno(String nome, float valorHoraTrabalhada, float adicionalNoturno) {
        super(nome, valorHoraTrabalhada);
        this.adicionalNoturno = adicionalNoturno;
    }

    //Getters/Setters
    public float getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(float adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    //Métodos da classe (particulares)
    public float calcularSalario(){
        return ((super.getValorHoraTrabalhada() * 40) * 4 +adicionalNoturno);
    }
}
