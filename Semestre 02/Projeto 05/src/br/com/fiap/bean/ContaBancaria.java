package br.com.fiap.bean;

import br.com.fiap.exception.SaldoInsuficienteException;

public class ContaBancaria {
    //Atributos
    private double saldo;

    //Construtores
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //Getters
    public double getSaldo() {
        return saldo;
    }

    //Métodos
    public void sacar(double quantia) throws SaldoInsuficienteException { //throws vai precisar tratar SaldoInsuficienteException
        if (quantia > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque"); //Criamos uma classe para lidar com essa Exceção -> SaldoInsuficienteException
        }
        saldo -= quantia;
    }
}
