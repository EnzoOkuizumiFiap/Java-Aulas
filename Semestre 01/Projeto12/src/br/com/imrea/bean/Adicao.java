package br.com.imrea.bean;

public class Adicao {
    //Atributos
    private int numInteiro1;
    private int numInteiro2;
    private double numReal1;
    private double numReal2;

    //Construtores
    public Adicao(){
    }

    public Adicao(int numInteiro1, int numInteiro2, double numReal1, double numReal2) {
        this.numInteiro1 = numInteiro1;
        this.numInteiro2 = numInteiro2;
        this.numReal1 = numReal1;
        this.numReal2 = numReal2;
    }

    //Métodos Getters/Setters
    public int getNumInteiro1() {
        return numInteiro1;
    }

    public void setNumInteiro1(int numInteiro1) {
        this.numInteiro1 = numInteiro1;
    }

    public int getNumInteiro2() {
        return numInteiro2;
    }

    public void setNumInteiro2(int numInteiro2) {
        this.numInteiro2 = numInteiro2;
    }

    public double getNumReal1() {
        return numReal1;
    }

    public void setNumReal1(double numReal1) {
        this.numReal1 = numReal1;
    }

    public double getNumReal2() {
        return numReal2;
    }

    public void setNumReal2(double numReal2) {
        this.numReal2 = numReal2;
    }

    //Métodos da classe (particulares)
    public int somar(int n1, int n2) {
        this.numInteiro1 = n1;
        this.numInteiro2 = n2;

        return numInteiro1 + numInteiro2;
    }

    public double somar(double n1, double n2) {
        this.numReal1 = n1;
        this.numReal2 = n2;

        return numReal1 + numReal2;
    }

}
