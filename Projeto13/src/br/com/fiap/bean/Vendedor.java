package br.com.fiap.bean;

public class Vendedor extends Funcionario{
    //Atributos
    private float comissao;

    //Construtores
    public Vendedor() {
    }
    public Vendedor(float comissao) {
        this.comissao = comissao;
    }

    //Getters/Setters
    public float getComissao() {
        return comissao;
    }
    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    //Métodos da classe (particulares)
    public float calcularSalario(){
        return (((super.getValorHoraTrabalhada() * 40) * 4) * (1 + comissao/100));
    }
}
