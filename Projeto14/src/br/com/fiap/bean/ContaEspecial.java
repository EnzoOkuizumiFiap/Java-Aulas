package br.com.fiap.bean;

import javax.swing.*;

public class ContaEspecial extends ContaBancaria{
    //Atributos
    private float limite;

    //Construtores
    public ContaEspecial() {
    }

    //Getters e Setters
    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }

    // métodos da classe (particulares)
    public float sacar(float valor) {
        float novoSaldo = super.getSaldo();
        if (valor <= (super.getSaldo() + limite)) {
            novoSaldo = super.getSaldo() - valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor superior ao seu limite atual");
        }
        super.setSaldo(novoSaldo);
        return super.getSaldo();
    }
}
