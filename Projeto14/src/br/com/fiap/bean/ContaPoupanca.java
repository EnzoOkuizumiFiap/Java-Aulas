package br.com.fiap.bean;

public class ContaPoupanca extends ContaBancaria {
    //Atributos
    private int diaDeRendimento;

    //Construtores
    public ContaPoupanca(){
    }

    //Getters e Setters
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    // métodos da classe (particulares)
    public float novoSaldo(float rendimento) {
        float novoSaldo = super.getSaldo() * (1 + rendimento / 100);
        super.setSaldo(novoSaldo);
        return super.getSaldo();
    }
}
