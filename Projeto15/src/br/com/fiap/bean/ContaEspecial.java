package br.com.fiap.bean;

/**
 * Método sacar que permite sacar um valor informado.
 * Valor informado não deve ser superior ao saldo atual.
 * @author Fulano da silva, Enzo Okuizumi
 * @return float - valor do saldo (atualizado)
 */

public class ContaEspecial implements ContaBancaria {
    //Atributos
    private int numConta;
    private float saldo;
    private float limite;

    //Construtores
    public ContaEspecial() {
    }

    //Getters/Setters

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }
    public void setLimite(float limite) {
        this.limite = limite;
    }


    //Métodos da classe (particulares)

    /**
     * Método sacar que permite sacar um valor informado.
     * Valor informado não deve ser superior ao saldo atual.
     * @author Fulano da silva, Enzo Okuizumi
     * @param valor indica valor a ser sacado
     * @return float - valor do saldo (atualizado)
     */
    public float sacar(float valor) {
        try {
            if (valor <= saldo + limite){
                saldo -= valor;
            } else {
                throw new Exception("Saldo insuficiente!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return saldo;
    }

    /**
     * Método depositar que permite depositar um valor informado.
     * @author Ciclano de Souza, Enzo Okuizumi
     * @param valor indica valor a ser depositado
     * @return float - valor do saldo (atualizado)
     */
    public float depositar(float valor){
        saldo += valor;
        return saldo;
    }
}
