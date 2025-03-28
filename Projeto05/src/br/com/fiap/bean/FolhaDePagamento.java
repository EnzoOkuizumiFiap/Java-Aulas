package br.com.fiap.bean;

public class FolhaDePagamento {
    //Atributos
    public double salarioBruto;
    public int numeroDeDependentes;
    public double descontoINSS;
    public double planoDeSaude;

    //Métodos
    public double calcularSalarioLiquido(){
       double desconto1 = salarioBruto * (descontoINSS/100);
       double desconto2 = numeroDeDependentes * planoDeSaude;

       return salarioBruto - desconto1 - desconto2;
    }
}
